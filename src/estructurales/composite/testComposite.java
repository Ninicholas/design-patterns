package estructurales.composite;

public class testComposite {
    public static void main(String[] args) {
        Componente libro = new Elemento("Libro", 1);
        Componente laptop = new Elemento("Laptop", 2);
        Componente vidrio = new Elemento("Vidrio", 3);

        Caja caja1 = new Caja("Caja1");
        caja1.addComponente(libro);
        caja1.addComponente(laptop);

        Caja caja2 = new Caja("Caja2");
        caja2.addComponente(vidrio);
        caja2.addComponente(caja1);

        caja2.mostrar();
        System.out.println("Precio total de caja2: " + caja2.calcularPrecio());
    }
}
