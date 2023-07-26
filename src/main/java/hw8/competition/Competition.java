package hw8.competition;

public class Competition {
    public static void compete(Participant participant, Obstacle... obstacles) {
        for (Obstacle obstacle : obstacles) {
            System.out.println(participant.getIcon()  + obstacle);
            if (obstacle.overcome(participant)) {
                System.out.println( participant.getIcon() + "Participant has overcome " + obstacle + ". Go to the next obstacle");
            } else {
                System.out.println("obstacle has won");
                return;
            }
        }
    }
}
