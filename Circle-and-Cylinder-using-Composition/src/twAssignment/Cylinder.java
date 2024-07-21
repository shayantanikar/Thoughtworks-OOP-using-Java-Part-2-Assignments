package twAssignment;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }


    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: is composed of " + base.toString() + " height=" + height;
    }
}

