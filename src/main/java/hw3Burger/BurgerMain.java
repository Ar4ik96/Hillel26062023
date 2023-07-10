package hw3Burger;

public class BurgerMain {
    public static void main(String[] args) {

        Burger regularBurger = new Burger("bun", "onePortionMeat", "cheese", "mayo");
        Burger dietBurger = new Burger("bun", "onePortionMeat", "cheese");
        Burger doubleMeatRegularBurger = new Burger("bun", "onePortionMeat", "twoServingMeat",
                "cheese", "mayo");

    }
}
