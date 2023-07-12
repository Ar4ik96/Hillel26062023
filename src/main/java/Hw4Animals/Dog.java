package Hw4Animals;

public class Dog extends Animals {
    public static int dogCounter = 0;
    public Dog(String name){
        super(name,500,10);
        dogCounter++;
    }
}
