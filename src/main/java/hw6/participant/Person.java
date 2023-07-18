package hw6.participant;

public class Person implements Participant {
    private String name;
    private int maxRunDistance;
    private double maxJumpHeight;


    public Person(String name, int maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }


    @Override
    public void run(int distance) {
        System.out.println(name + " is running " + distance + " meters");
    }

    @Override
    public boolean jump(double height) {
        System.out.println(name + " is jumping " + height + " meters");
        return false;
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public String getName() {
        return name;
    }
}
