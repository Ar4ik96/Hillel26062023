package hw6.participant;

public interface Participant {

    void run(int distance);
    boolean jump(double height);

    int getMaxRunDistance();

    double getMaxJumpHeight();
        String getName();
}
