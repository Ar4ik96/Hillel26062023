package Hw5Builder;

import Hw5Builder.CoffeeMaker.CoffeeBuilder;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffee = CoffeeMaker.builder()
                .grain(CoffeeMaker.GrainType.ARABICA)
                .milk(CoffeeMaker.MilkType.OAT)
                .shotEspresso(2)
                .build();


        System.out.println(coffee);

    }
}
