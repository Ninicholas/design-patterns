package comportamiento.estrategia;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(double price) {
        items.add(price);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        double totalAmount = items.stream().mapToDouble(Double::doubleValue).sum();
        paymentStrategy.pay(totalAmount);
    }
}
