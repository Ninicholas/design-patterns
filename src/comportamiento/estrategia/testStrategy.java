package comportamiento.estrategia;

public class testStrategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(30);
        cart.addItem(70);

        // Pagar con tarjeta de crédito
        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23"));
        cart.checkout();

        // Pagar con PayPal
        cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com", "password123"));
        cart.checkout();

        // Pagar con criptomonedas
        cart.setPaymentStrategy(new CryptoPayment("1A2b3C4d5E6f7G8h9I0j"));
        cart.checkout();
    }
}
