package hw8.triangle;

public class EqualTwoSideTriangle extends Triangle{
    public EqualTwoSideTriangle(double a, double b, double c, double aCorner, double bCorner) {
        super(a, b, c, aCorner, aCorner, bCorner);
    }

    @Override
    public double calcSquare() {
        throw new UnsupportedOperationException();
    }
}
