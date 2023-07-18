package hw6.figure;

import hw6.figure.GeometricFigure;

public class Triangle implements GeometricFigure {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this. height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
