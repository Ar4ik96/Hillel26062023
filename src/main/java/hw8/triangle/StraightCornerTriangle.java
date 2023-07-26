package hw8.triangle;

public class StraightCornerTriangle extends Triangle  {


    public StraightCornerTriangle(double a, double b, double c, double cornerA, double cornerB) {
        super(a, b, c,cornerA, cornerB,90);

    }

    @Override
    public double calcSquare() {
        throw new UnsupportedOperationException();
    }
}
