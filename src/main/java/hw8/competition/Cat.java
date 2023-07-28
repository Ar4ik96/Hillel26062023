package hw8.competition;

public class Cat extends Participant {

    private static final String CAT_ICON =
                    " /\\_/\\ \n" +
                    " (o.o)\n" +
                    "  >^< ";

    protected Cat(int maxRun, int maxJump) {
        super(maxRun, maxJump, " /\\_/\\ \n" +
                                    " (o.o)\n" +
                                    "  >^< ");
    }

    @Override
    public String getIcon() {
        return CAT_ICON;
    }


    @Override
    public void run() {
        for (int i = 0; i < maxRun; i += 10) {
            System.out.println("\r" + CAT_ICON + "Running: " + (i + 10) + " meters");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
        System.out.println("\r" + CAT_ICON + "Running: "  + maxRun + " meters");
    }

    @Override
    public void jump() {
        for (int i = 0; i < maxJump; i += 5) {
            System.out.println("\r" + CAT_ICON + "Jumping: " + i + " meters");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println( "\r" + CAT_ICON + "Jumping: " + maxJump + " meters");
    }
}
