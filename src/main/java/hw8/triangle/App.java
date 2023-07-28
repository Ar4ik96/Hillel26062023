package hw8.triangle;

import hw8.figures.AreaPrinter;
import hw8.figures.Circle;
import hw8.figures.Square;
import hw8.figures.Squareable;

public class App {
    public static void main(String[] args) {
        Squareable square = new Square(4);
        Squareable circle = new Circle(6);


        AreaPrinter.printSquare(square);

        AreaPrinter.printSquare(circle);


    }
}
