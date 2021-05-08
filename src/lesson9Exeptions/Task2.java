package lesson9Exeptions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Type Integer two with new line  to get sum ! ");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        try {
            a=Integer.parseInt(scanner.next());
            b=Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {

            System.out.println("Only Integer numbers are allowed");
            System.exit(0);
        }

        System.out.println(a+b);
    }
}
