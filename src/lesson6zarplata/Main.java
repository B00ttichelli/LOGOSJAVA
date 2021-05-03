package lesson6zarplata;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        FullTimeWorker fullTimeWorker = new FullTimeWorker();
        fullTimeWorker.setName("Vasya");
        fullTimeWorker.setDolarspermonth(1000.0); // Месячная зарплата
        PartTimeWorker partTimeWorker = new PartTimeWorker();
        partTimeWorker.setName("Oleg");
        partTimeWorker.setDollarsperhour(15.0); //Зарплата в час


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество проработаных часов");
        int timeinhours  = scanner.nextInt();
        partTimeWorker.setWorkinghours((double)timeinhours);
        fullTimeWorker.setWorkingmonts((double) timeinhours);
        partTimeWorker.Salary();
        fullTimeWorker.Salary();

    }
}
