package hw6.obstacle;

import hw6.participant.Cat;
import hw6.participant.Participant;
import hw6.participant.Person;
import hw6.participant.Robot;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Person("John", 100,2.0),
                new Cat("Tom", 80,1.5),
                new Robot("Robocop-007", 150,3.0)
        };
        Obstacle[] obstacles ={
                new RunningTrack(100),
                new Wall(2.5),
                new RunningTrack(200),
                new Wall(1.8)
        };
        for (Participant participant : participants){
           boolean canPassAllObstacles = true;
           for (Obstacle obstacle : obstacles){
               if (!obstacle.overcome(participant)){
                   canPassAllObstacles = false;
                   break;
               }
           }
           if (canPassAllObstacles){
               System.out.println(participant.getName() + "has successfully passed all obstacles!");
           }else {
               System.out.println(participant.getName() + " has failed to pass obstacles");
           }
        }
    }
}
