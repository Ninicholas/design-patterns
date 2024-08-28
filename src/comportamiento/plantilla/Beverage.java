package comportamiento.plantilla;

public abstract class Beverage {
    // Template
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Métodos comunes
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Métodos que se deben implementar en las subclases
    abstract void brew();
    abstract void addCondiments();
}

