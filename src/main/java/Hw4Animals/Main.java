package Hw4Animals;

public class Main {
    public static void main(String[] args) {
        DogBobik dogBobik = new DogBobik();
        CatTom catTom = new CatTom();

        dogBobik.run(500);
        dogBobik.swim(5);

        catTom.run(150);
        catTom.swim(8);

        System.out.println("number of dogs " + dogBobik.obtainedQuantityOfDogs());
        System.out.println("number of cat " + catTom.obtainedQuantityOfCat());
    }
}
