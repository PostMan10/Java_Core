package HomeWork3.Task2.classes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruitList;

    private double totalWeight;

    private Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
