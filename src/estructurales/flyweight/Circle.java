package estructurales.flyweight;

// ConcreteFlyweight class
public class Circle implements Shape {
    private String color; // Intrinsic state (shared)
    private int x; // Extrinsic state (unique)
    private int y; // Extrinsic state (unique)
    private int radius; // Extrinsic state (unique)

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
