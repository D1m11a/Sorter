package Sorter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorter {
    public static String processArray(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(", "))) // Розбиваємо рядок на числа
                .map(Integer::parseInt) // Перетворюємо на цілі числа
                .sorted() // Сортуємо числа
                .map(String::valueOf) // Перетворюємо назад на рядки
                .collect(Collectors.joining(", ")); // З'єднуємо рядки через кому
    }

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = processArray(inputArray);
        System.out.println(result);
    }
}

