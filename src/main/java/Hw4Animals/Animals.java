package Hw4Animals;

public class Animals {
    private static int numberOfAnimals =0;
    public Animals(){
        numberOfAnimals++;
    }
    public static int obtainedQuantityOfAnimals(){
        return numberOfAnimals;
    }
    public void run(int distance){
        System.out.println("run away");
    }
    public void swim(int distance){
        System.out.println("to swim");
    }
}
