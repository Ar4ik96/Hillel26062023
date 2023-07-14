package Hw4Animals;

public class Dog extends Animals {
    public static int dogCounter = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCounter++;
    }

    @Override
    public void run(int distance) {
        if (maxRunningDistance <= distance) {
            System.out.println(this.name + " Ran " + distance + " Meters");
        } else {
            System.out.println(this.name + " Cannot run more than " + this.maxRunningDistance + " Meters");
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimmingDistance <= distance) {
            System.out.println(this.name + " Swim " + distance + " Meters");
        } else {
            System.out.println(this.name + " Cannot swim more than " + this.maxSwimmingDistance + " Meters");
        }
    }
}
