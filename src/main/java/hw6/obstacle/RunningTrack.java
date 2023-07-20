package hw6.obstacle;

import hw6.participant.Participant;

public class RunningTrack implements Obstacle {
    private int distance;
    public RunningTrack(int distance){
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run(distance);
        return participant.getMaxRunDistance() >= distance;
    }
}

