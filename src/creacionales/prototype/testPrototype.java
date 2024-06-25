package creacionales.prototype;

import java.util.ArrayList;

public class testPrototype {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(2, 4);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(rectangulo);

        ArrayList<Forma> clones = new ArrayList<>();

        for (Forma forma : formas) {
            Forma clon = forma.clonar();
            clones.add(clon);
        }

        formas.addAll(clones);

        for (Forma forma : formas) {
            System.out.println("-----------------------------");
            System.out.println(forma);
        }
    }
}
