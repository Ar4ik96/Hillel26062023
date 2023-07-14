package hw3Burger;

public class BurgerMain {
    public static void main(String[] args) {

        Burger regularBurger = new Burger("bun", 1, "cheese", true);
        Burger dietBurger = new Burger("bun", 1, "cheese");
        Burger doubleMeatRegularBurger = new Burger("bun", 1, 1,
                "cheese", true);

    }
}
