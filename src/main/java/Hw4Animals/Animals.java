package Hw4Animals;

public class Animals {
   String name;
   int maxRunningDistance;
   int maxSwimmingDistance;

   public static int animalsCounter;

    public Animals(String name, int maxRunningDistance, int maxSwimmingDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
        animalsCounter++;
    }
    public void run(int distance){
        if(maxRunningDistance <= distance){
            System.out.println(this.name + " Ran " + distance + " Meters");
        }else {
            System.out.println(this.name + " Cannot run more than " + this.maxRunningDistance + " Meters");
        }
    }
    public void swim(int distance){
        if(maxSwimmingDistance <= distance){
            System.out.println(this.name + " Swim " + distance + " Meters");
        }else {
            System.out.println(this.name + " Cannot swim more than " + this.maxSwimmingDistance + " Meters");
        }
    }
}
