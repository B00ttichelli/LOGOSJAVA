package lesson6Calc;

import lesson6Calc.second.Mycalculator;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Mycalculator mycalc = new Mycalculator();
        System.out.println("Введите два целых числа через ентер");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();




        System.out.println(mycalc.devide(a,b));
        System.out.println(mycalc.minus(a,b));
        System.out.println(mycalc.plus(a,b));
        System.out.println(mycalc.multiply(a,b));

    }
}
