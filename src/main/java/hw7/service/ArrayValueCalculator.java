package hw7.service;

import hw7.exceptions.ArraySizeException;

public class ArrayValueCalculator {
    public static int sum(String[][] input, int sizeRestriction) {
        validateSize(input, sizeRestriction);
        validatePayload(input);
        return sum(input);

    }

    private static void validateSize(String[][] input, int sizeRestriction) {
        if (sizeRestriction < 1)
            throw new IllegalArgumentException("sizeRestriction must be more then zero");
        if (input == null)
            throw new ArraySizeException("Invalid array size. Expected " + sizeRestriction + " but was " + null);
        if (input.length != sizeRestriction)
            throw new ArraySizeException("Invalid array size. Expected " + sizeRestriction + " but was " + input.length);
        for (int i = 0; i < input.length; i++) {
            if (input[i].length != sizeRestriction)
                throw new ArraySizeException("Invalid array size. Expected " + sizeRestriction + " but was " + input.length + " in column " + i);
        }
    }

    private static void validatePayload(String[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (!input[i][j].matches("\\d+"))
                    throw new IllegalArgumentException("Invalid data input in place [i] + " + (i + 1) + " [j]" + (j + 1));
            }

        }
    }


    private static int sum(String[][] input) {
        int result = 0;
        for (String[] outer : input) {
            for (String payload : outer) {
                result += Integer.parseInt(payload);
            }
        }
        return result;
    }
}





