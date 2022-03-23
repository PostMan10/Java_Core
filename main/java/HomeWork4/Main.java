package HomeWork4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /** 1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
     вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     Посчитать, сколько раз встречается каждое слово.
     2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
     телефонных номеров. В этот телефонный справочник с помощью метода add() можно
     добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
     учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
     тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
     лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
     через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
     справочника. */

    public static void main(String[] args) {
        // first homework
        List<String> wordArray = new ArrayList<>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        // second homework
        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Skvorcov");
        phonebook.add(5678794, "Solovyev");
        phonebook.add(3456783, "Dyatlov");
        phonebook.add(3456278, "Orlov");
        phonebook.add(9786053, "Sokolov");
        phonebook.add(6475893, "Drozdov");

        phonebook.get("Solovyev");
        phonebook.get("Orlov");
        phonebook.get("Drozdov");
        phonebook.get("Sverchkov");
    }

}
