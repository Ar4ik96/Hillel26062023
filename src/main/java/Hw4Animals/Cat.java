package Hw4Animals;

public class Cat extends Animals {
    public static int catCounter = 0;

    public Cat(String name) {
        super(name, 200, 0);
        catCounter++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("The cat cannot swim ");
    }
}
