package hw3Burger;
public class Burger {
   public String bun;
   public String onePortionMeat;
   public String twoServingMeat;
   public String cheese;
   public String mayo;

    public Burger(String bun, String onePortionMeat, String cheese, String mayo) {
        this(bun, onePortionMeat,null, cheese,mayo);

    }

    public Burger (String bun, String onePortionMeat, String cheese) {
        this(bun, onePortionMeat,  null, cheese, null);

    }

    public Burger(String bun, String onePortionMeat, String twoServingMeat , String cheese, String mayo) {
        this.bun = bun;
        this.onePortionMeat = onePortionMeat;
        this.twoServingMeat = twoServingMeat;
        this.cheese = cheese;
        this.mayo = mayo;
        System.out.println("Бургер: " + bun + ", " + onePortionMeat + ( twoServingMeat != null ? ", " + twoServingMeat : "") + ", " +
                cheese + (mayo != null ? ", " + mayo : "") + ".");
    }
}
