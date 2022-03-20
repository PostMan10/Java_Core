package HomeWork3.Task2.classes;

public class BoxFactory {
    public static <T extends Fruit> Box<T> getBox(Class<T> clazz) {
        if (Object.equals(clazz, Fruit.class)) {
            throw new IllegalArgumentException("Wrong class");
        }
        return new Box<>();
    }
}
