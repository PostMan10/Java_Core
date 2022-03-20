package HomeWork3.Task1;

/** 1. Написать метод, который меняет два элемента массива местами (массив может быть любого
 ссылочного типа);
 */

public class Task1 {

    static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }

}
