package hw6.figure;

import hw6.figure.GeometricFigure;

public class Square implements GeometricFigure {
    private double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
