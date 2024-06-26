package estructurales.decorator;

public class testDecorator {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println(cafe.getDescripcion() + " $" + cafe.getPrecio());

        Bebida cafeConLeche = new LecheDecorator(cafe);
        System.out.println(cafeConLeche.getDescripcion() + " $" + cafeConLeche.getPrecio());

        Bebida te = new Te();
        System.out.println(te.getDescripcion() + " $" + te.getPrecio());

        Bebida teConLimon = new LimonDecorator(te);
        System.out.println(teConLimon.getDescripcion() + " $" + teConLimon.getPrecio());
    }
}
