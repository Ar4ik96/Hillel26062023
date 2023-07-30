package hw9;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends  Fruit> {
    private final List<T> fruits;
    public Box(){
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit){
        if (fruits.isEmpty() || fruit.getClass()  == fruits.get(0).getClass()){
            fruits.add(fruit);
        }else {
            System.out.println("Cannot add " + fruit.getName() + " to the box. It already contains " + fruits.get(0).getName());
        }
    }
    public double getWeight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }
    public void merge(Box<T> otherBox){
        if (this.fruits.isEmpty() || otherBox.fruits.isEmpty()){
            throw new IllegalArgumentException("One of the boxes is empty");
        }
        if (this.fruits.get(0).getClass() != otherBox.fruits.get(0).getClass()){
            throw new IllegalArgumentException("Cannot merge boxes with different fruit types ");
        }
        this.fruits.addAll(otherBox.fruits);
        otherBox.fruits.clear();
    }
 }
