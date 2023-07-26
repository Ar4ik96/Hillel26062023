package hw8.figures;

public class Circle implements Squareable {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
