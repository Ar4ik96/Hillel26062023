package hw6.figure;

import hw6.figure.Circle;
import hw6.figure.GeometricFigure;
import hw6.figure.Square;
import hw6.figure.Triangle;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[3];
        figures[0] = new Circle(5.0);
        figures[1] = new Triangle(6.0,4.0);
        figures[2] = new Square(7.0);

        double totalArea = calculateTotalArea(figures);
        System.out.println(" Total Area: " + totalArea);
    }
    public static double calculateTotalArea(GeometricFigure[] figures){
        double totalArea = 0.0;
        for (GeometricFigure figure : figures){
            totalArea += figure.getArea();
        }
        return totalArea;
        }
    }

