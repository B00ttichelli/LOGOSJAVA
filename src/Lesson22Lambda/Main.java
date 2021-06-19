package Lesson22Lambda;
/*Створіть функціональний інтерфейс із методом, який приймає три
        значення int та повертає значення int.
        Створіть лямбда-функції (як змінні в основному методі), що реалізує
        цей інтерфейс:
        Перша лямбда повертає максимальне значення
        Друга - середнє значення
        Третя - суму всіх трьох значень
        Викликати ці лямбди.*/
public class Main {

    public static void main(String[] args) {
        SomeInterface sum = (a,b,c)->a+b+c; // лямбда для суммы
        SomeInterface medium  = (a,b,c)->(a+b+c)/3;  // для среднего значения
        SomeInterface maximum = (a,b,c)->a>b?a>c?a:c:b>c?b:c; // максимальное значение

        System.out.println(sum.someMethod(20,30,10));
        System.out.println(medium.someMethod(30,20,10));
        System.out.println(maximum.someMethod(20,100,70));
    }
}
