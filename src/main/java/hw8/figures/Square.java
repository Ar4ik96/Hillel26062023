package hw8.figures;

public class Square implements Squareable {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calcSquare() {
        return Math.pow(length,2);
    }
}
