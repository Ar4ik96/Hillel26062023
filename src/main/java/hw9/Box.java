package hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends  Fruit> {
    private final  List<T> fruits;
    public Box(){
        fruits = new ArrayList<>();
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
        this.fruits.addAll(otherBox.fruits);
        otherBox.fruits.clear();
    }
    @SafeVarargs
    public final void addAllFruits(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }
 }
