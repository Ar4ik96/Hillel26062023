package Hw4Animals;

public class DogBobik extends Animals{
    private static int numberOfDogs = 0;
    public DogBobik(){
        super();
        numberOfDogs++;
    }
    public static int obtainedQuantityOfDogs(){
        return numberOfDogs;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500){
            System.out.println("The dog Bobik ran " + distance + " meters");
        }else {
            System.out.println("The dog Bobik cannot run more than 500 meters");
        }
    }
    public void swim(int distance){
        if (distance <= 10){
            System.out.println("The dog Bobik swam 10 meters");
        }else {
            System.out.println("Oh no! The dog Bobik drowned :( The dog Bobic cannot swim more than 10 meters.");
        }
    }
}
