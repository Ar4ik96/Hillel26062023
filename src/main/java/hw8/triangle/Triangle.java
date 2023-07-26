package hw8.triangle;

import hw8.figures.Squareable;

public abstract class Triangle implements Squareable {
    private final double a;
    private final double b;
    private final double c;

    private final double aCorner;
    private final double bCorner;
    private final double cCorner;



    public Triangle(double a, double b, double c,
                    double aCorner, double bCorner, double cCorner) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.aCorner = aCorner;
        this.bCorner = bCorner;
        this.cCorner = cCorner;
    }
}
