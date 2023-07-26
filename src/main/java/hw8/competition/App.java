package hw8.competition;

public class App {
    public static void main(String[] args) {


        Obstacle[] obstacles = new Obstacle[10];
        int start = 10;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                obstacles[i] = new Wall(start);
            else obstacles[i] = new Run(start);
            start = start + 10;

        }
        Competition.compete(new Cat(100, 200), obstacles);
    }
    }

