package Lesson15Map;

/*Створити структуру Зооклуб.
        Створити клас Person , який описати двома полями : ім’я , вік.
        Створити клас Animal , який описати двома полями : тип тваринки(кіт,пес), ім’я тваринки.
        Кожна людина може мати багато тваринок. Але одна тваринка належить лише одній людині.
        Map<Person, List<Animal>> map;
        Реалізувати консольне меню(НЕ обов’язково), таким чином щоб можна було:
        ● Додати людину до клубу
        ● Додати тваринку до людини
        ● Видалити(забрати) тваринку від людини
        ● Видалити людину з клубу
        ● Вивести на екран зооклуб
        ● Вийти з програми
        Використати для побудови меню Switch.*/

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static final String ERROR = "Something is wrong try again";

    public static void main(String[] args) {

        String input = "";
        int choice = 0;
        while (!input.equals("exit")) {

            System.out.println("Type number to select an act or Exit to exit ");
            System.out.println("1. Add member too club");
            System.out.println("2. Add the animal to owner");
            System.out.println("3. Pick-up the animal from owner");
            System.out.println("4. Delete person from club");
            System.out.println("5. Show all members with their animals ");
            input = scanner.next();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(ERROR);
            }

            switch (choice) {
                case 1:
                    try {
                        Zooclub.addMember();
                    } catch (Exception e) {
                        System.out.println(ERROR);
                        break;
                    }
                    break;
                case 2:
                    try {
                        Zooclub.addAnimal();
                    } catch (NumberFormatException e) {
                        System.out.println(ERROR);
                    }
                    break;
                case 3:
                    try {
                        Zooclub.PickUpAnimal();
                    } catch (RuntimeException e) {
                        System.out.println(ERROR);
                    }
                    break;
                case 4:
                    try {
                        Zooclub.delMember();
                    } catch (RuntimeException e) {
                        System.out.println(ERROR);
                    }
                    break;
                case 5:
                    Zooclub.show();
                    break;
                default:
                    System.out.println(ERROR);
                    break;

            }

        }


    }


}
