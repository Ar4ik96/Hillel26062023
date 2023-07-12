package Hw4Animals;

public class Main {
    public static void main(String[] args) {
       Cat cat = new Cat("Tom");
       Cat cat2 = new Cat("Silvester");
       Dog dog = new Dog("Butch");
       dog.run(500);
       dog.swim(8);
       cat2.swim(1);

        System.out.println("Number of cats " + Cat.catCounter);
        System.out.println("Number of dogs " + Dog.dogCounter);
        System.out.println("Total number of animals " + Animals.animalsCounter);
    }
}
