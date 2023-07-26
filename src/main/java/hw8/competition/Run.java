package hw8.competition;

public record Run(int length) implements Obstacle {

    @Override
    public boolean overcome(Participant participant) {

        return participant.getMaxJump() > this.length;
    }

    @Override
    public String toString() {
        return "Run: length = " + length ;
    }
}
