package hw8.figures;

import java.util.Objects;

public class AreaPrinter {
    public static void printSquare(Squareable squareable) {
        System.out.println(squareable.calcSquare());
    }

    public static void printSquareNew(int num, Squareable... squareables) {
        if (Objects.isNull(squareables) || squareables.length == 0)
            throw new IllegalArgumentException("Wrong input. Specified array is null or empty");

        if (num > squareables.length)
            throw new IllegalArgumentException("Wrong input. Specified array is less then NUM param");
        if (num < 0)
            throw new IllegalArgumentException("Wrong input. Specified array NUM is less then zero ");



        double totalArea = 0;
        for (int i = 0; i < num; i++) {
            totalArea += squareables[i].calcSquare();
        }
        System.out.println(totalArea);
    }

    public static void printSquare(Squareable... squareables) {
        if (Objects.isNull(squareables))
            throw new IllegalArgumentException("Wrong input. Specified array is null ");
        double totalArea = 0;
        for (Squareable squareable : squareables) {
            totalArea += squareable.calcSquare();
        }
        System.out.println(totalArea);
    }
}
