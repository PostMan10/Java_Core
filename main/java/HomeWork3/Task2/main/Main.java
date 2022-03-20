package HomeWork3.Task2.main;

import HomeWork3.Task2.classes.Apple;
import HomeWork3.Task2.classes.Box;
import HomeWork3.Task2.classes.BoxFactory;
import HomeWork3.Task2.classes.Fruit;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = BoxFactory.getBox(Apple.class);
        Box<Fruit> fruitBox = BoxFactory.getBox(Fruit.class);
    }

}
