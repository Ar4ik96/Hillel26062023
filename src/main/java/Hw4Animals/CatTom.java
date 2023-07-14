package Hw4Animals;

public class CatTom extends Animals {
    private static int numberOfCat = 0;
    public CatTom(){
        super();
        numberOfCat++;
    }
    public static int obtainedQuantityOfCat(){
        return numberOfCat;
    }
    @Override
    public void run(int distance) {
        if (distance <= 200){
            System.out.println("The cat Tom ran " + distance + " meters");
        }else {
            System.out.println("The cat Tom cannot run more than 200 meters");
        }
    }
    public void swim(int distance){
            System.out.println("Tom the cat cannot swim");
    }

}
