package estructurales.composite;

import java.util.ArrayList;

public class Caja implements Componente {
    private final String nombre;
    private ArrayList<Componente> componentes = new ArrayList<>();

    public Caja(String nombre) {
        this.nombre = nombre;
    }

    public void addComponente(Componente componente) {
        componentes.add(componente);
    }

    public void removeComponente(Componente componente) {
        componentes.remove(componente);
    }

    public ArrayList<Componente> getComponentes() {
        return this.componentes;
    }

    @Override
    public void mostrar() {
        System.out.println("Caja: " + nombre);
        for (Componente componente : componentes) {
            componente.mostrar();
        }
    }

    @Override
    public double calcularPrecio() {
        double precio = 0;
        for (Componente componente : componentes) {
            precio += componente.calcularPrecio();
        }
        return precio;
    }
}
