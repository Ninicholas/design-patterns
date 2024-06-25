package estructurales.composite;

public class testComposite {
    public static void main(String[] args) {
        // Crear objetos simples
        Componente objeto1 = new Elemento("Libro", 1);
        Componente objeto2 = new Elemento("Laptop", 2);
        Componente objeto3 = new Elemento("Teléfono", 3);

        // Crear una caja y agregarle objetos
        Caja caja1 = new Caja("Caja1");
        caja1.addComponente(objeto1);
        caja1.addComponente(objeto2);

        // Crear otra caja y agregarle un objeto y la primera caja
        Caja caja2 = new Caja("Caja2");
        caja2.addComponente(objeto3);
        caja2.addComponente(caja1);

        // Mostrar el contenido y el precio total de caja2
        caja2.mostrar();
        System.out.println("Precio total de caja2: " + caja2.calcularPrecio());
    }
}
