package hw9;

public class App {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple("Apple",0.2));
        appleBox1.addFruit(new Apple( "Apple",0.3));

        appleBox2.addFruit(new Apple("Apple",0.4));
        appleBox2.addFruit(new Apple("Apple",0.1));

        orangeBox.addFruit(new Orange("Orange",0.3));

        System.out.println("Apple box 1 weight: " + appleBox1.getWeight());
        System.out.println("Apple box 2 weight: " + appleBox2.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());

        appleBox1.merge(appleBox2);

        System.out.println("Apple box 1 after merging: " + appleBox1.getWeight());
        System.out.println("Apple box 2 after merging: " + appleBox2.getWeight());
    }
}

