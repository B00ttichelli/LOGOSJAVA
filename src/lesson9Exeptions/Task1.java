package lesson9Exeptions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt=0;
        System.out.println("Enter an Integer");
        try {
            inputInt = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {

            System.out.println("Only Integer numbers are allowed");
            System.exit(0);
        }

        if(inputInt%2 == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
