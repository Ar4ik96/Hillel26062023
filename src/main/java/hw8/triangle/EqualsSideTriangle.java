package hw8.triangle;

public class EqualsSideTriangle extends Triangle{
    public EqualsSideTriangle(double a, double b, double c) {
        super(a, b, c, 60,60,60);
    }

    @Override
    public double calcSquare() {
        throw new UnsupportedOperationException();
    }
}
