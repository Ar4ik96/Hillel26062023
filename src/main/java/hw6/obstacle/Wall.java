package hw6.obstacle;

import hw6.participant.Participant;

public class Wall implements Obstacle{
    private double height;
    public Wall ( double height){
        this.height = height;

    }

    @Override
    public boolean overcome(Participant participant) {
        boolean result = participant.jump(height);
       if (result) {
            System.out.println(participant.getName() + " has successfulley overcome the wall!");
        } else {
            System.out.println(participant.getName() + " has failed to overcome the wall");
        }
       return result;
    }
}
