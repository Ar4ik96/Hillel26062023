package hw8.competition;

public abstract class Participant {

    protected final int maxRun;
    protected final int maxJump;
    protected final String icon;

    protected Participant(int maxRun, int maxJump, String icon) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.icon = icon;
    }

    public abstract void run();

    public abstract void jump();

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
    public String getIcon(){
        return icon;
    }

}
