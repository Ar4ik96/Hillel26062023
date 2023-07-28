package hw7;

import hw7.service.ArrayValueCalculator;

public class App {
    public static void main(String[] args) {
        ArrayValueCalculator.sum(new String[][]{
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}},
        4);
    }
}
