package lesson12Lists;

/*Користувач з консолі має вводити слова доти, доки не введе “break”,
        всі слова записуються в List.
        Написати функцію для :
        ● виведення користувачу всіх слова, які він ввів!
        ● виведення слів, які починаються на “s”!
        ● виведення слів, які мають кількість букв більше ніж 5!*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<String> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words divided by enter, type break to see result");
        String input = scanner.nextLine();
        while (!input.equals("break")) {
            arr.add(input);
            input = scanner.nextLine();


        }
        showAll(arr);
        showSWords(arr);
        showMoreThan5(arr);
        
    }

    public static void showAll(List<String> arr) {
        System.out.println("All word typed by user !");
        for (String x : arr
        ) {
            System.out.println(x);
        }
    }

    public static void showSWords(List<String> arr) {
        System.out.println("That word(s) starts with 'S' ");
        for (String x : arr
        ) {
            if (x.startsWith("s")) {
                System.out.println(x);
            }
        }
    }

    public static void showMoreThan5(List<String> arr) {
        System.out.println("That word(s) has more than 5 letters");
        for (String x : arr
        ) {
            if (x.length() >= 5) {
                System.out.println(x);
            }

        }

    }

}
