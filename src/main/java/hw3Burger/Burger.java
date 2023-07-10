package hw3Burger;
public class Burger {
   public String bun;
   public int onePortionMeat;
   public int additionalPortionOfMeat;
   public String cheese;
   public boolean mayo;

    public Burger(String bun, int onePortionMeat, String cheese, boolean mayo) {
        this(bun, onePortionMeat ,0, cheese, mayo);

    }

    public Burger (String bun, int onePortionMeat, String cheese) {
        this(bun, 1,  0, cheese, false);

    }

    public Burger(String bun, int onePortionMeat, int additionalPortionOfMeat , String cheese, boolean mayo) {
        this.bun = bun;
        this.onePortionMeat = onePortionMeat;
        this.additionalPortionOfMeat = additionalPortionOfMeat;
        this.cheese = cheese;
        this.mayo = mayo;
        System.out.println("Бургер: " + bun + ", " + onePortionMeat + (onePortionMeat == 1 ? " portion meat" : " Additional portion of meat") +
                (additionalPortionOfMeat != 0 ? ", " + additionalPortionOfMeat + " additional portion of meat" : "") + ", " + cheese +
                (mayo ? ", with mayonnaise" : "") + ".");
    }
}
