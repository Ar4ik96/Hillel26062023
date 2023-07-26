package hw8.competition;

public class Wall implements Obstacle {
    private static int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getMaxJump() >= height){
            System.out.println(participant.getIcon() + " Jumped over the wall height: " + height);
            return true;
        }else {
            System.out.println(participant.getIcon() + " Failed to jump over the wall with height: " + height);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Wall: high=" + height ;
    }
}
