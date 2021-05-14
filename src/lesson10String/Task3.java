package lesson10String;

import java.util.Scanner;

/*Ввести n слів з консолі. Вивести на екран слова які починаються на ‘a’ і мають парну кількість
        символів.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        String [] arr = input.split(" ");
        for (String x :arr
             ) {
            if (x.length()%2 == 0 && x.startsWith("a")){
                System.out.println(x);
            }

        }
    }
}
