package hw3Burger;



public class Burger {
   public String bun;
   public String onePortionMeat;
   public String twoServingMeat;
   public String cheese;
   public String mayo;

    public Burger(String bun, String onePortionMeat, String cheese, String mayo) {
        this.bun = bun;
        this.onePortionMeat = onePortionMeat;
        this.cheese = cheese;
        this.mayo = mayo;
        System.out.println("Звычайний бургер: " + bun + ", " +onePortionMeat + ", " + cheese + ", " + mayo +".");
    }

    public Burger(String bun, String onePortionMeat, String cheese) {
        this.bun = bun;
        this.onePortionMeat = onePortionMeat;
        this.cheese = cheese;
        System.out.println("Діетичний бургеp: " + bun + ", " + onePortionMeat + ", " + cheese + ".");
    }

    public Burger(String bun, String onePortionMeat, String twoServingMeat, String cheese, String mayo) {
        this.bun = bun;
        this.onePortionMeat = onePortionMeat;
        this.twoServingMeat = twoServingMeat;
        this.cheese = cheese;
        this.mayo = mayo;
        System.out.println("Бургер з подвійним м'ясом: " + bun + ", " + onePortionMeat + ", " + twoServingMeat + ", " +
                cheese + ", " +mayo + ".");
    }
}
