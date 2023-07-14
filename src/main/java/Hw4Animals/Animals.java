package Hw4Animals;

public abstract class Animals {
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
    public abstract void run(int distance);

    public abstract void swim(int distance);


    }

