package Lesson17InnerClases;

/*
Переробити задачі з Comparator так, щоб використовувалися
        anonymous classes , замість створення компаратора-класу.
*/



import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0 ;
        String input;
        while (true){
            System.out.println("Select option from menu,and type a number");
            System.out.println("1 Add New Product");
            System.out.println("2 Delete product ");
            System.out.println("3 Replace Product");
            System.out.println("4 Sort products by Name");
            System.out.println("5 Sort products by  length");
            System.out.println("6 Sort products by width");
            System.out.println("7 Sort by weight");
            System.out.println("8 Show element by number");
            System.out.println("9 Show all Products");
            System.out.println("Press 0  to Exit");


            input = scanner.next();
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Only Integers Allowed");

            }

            switch (choice){
                case 1:
                    Commodity.addProduct();
                    break;
                case 2:
                    Commodity.removeProduct();
                    break;
                case 3:
                    Commodity.replaceItem();
                    break;
                case 4:
                    Commodity.sortByName();
                    break;
                case 5:
                    Commodity.sortByHeight();
                    break;
                case 6:
                    Commodity.sortByWidth();
                    break;
                case 7:
                    Commodity.sortByWeight();
                    break;
                case 8:
                    Commodity.showProduct();
                    break;
                case 9:
                    Commodity.showAll();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please type a valid number");
            }



        }

    }
}
