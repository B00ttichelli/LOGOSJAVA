package Lesson19InputOutput;


/*Створити клас Employee, описати даний клас наступними полями: name, id, salary. Дані поля
        повинні бути private. Описати getters and setters. Створити клас Methods де описати всього
        два методи serialize() and deserealize().
        1).Створити метод Main створити екземпляр класу Employee і провести сереалізацію та
        десереалізацію. Результат Десереалізації вивести на консоль.
        2). Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію.
        Результат вивести на екран.
        3) Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції
        4) Зробити Salary об’єктом, провести сереалізацію та десереалізацю.*/

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       Employee employee = new Employee();
       employee.setId(1);
       employee.setName("Maria");
       Salary salary = new Salary();
       salary.setSalary(10000d);
       employee.setSalary(salary);

       Methods.serialize(employee);
       Employee deserializedemployee = new Employee();
        System.out.println(Methods.deserealize(deserializedemployee));

        // Serialization fo Collection

        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setName("Vasylina");
        employee2.setName("Gavrilina");
        employee3.setName("Drazdraperma");
        employee1.setId(2);
        employee2.setId(3);
        employee3.setId(4);
        employee1.setSalary(salary);
        employee1.setSalary(salary);
        employee1.setSalary(salary);
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Methods.serialize(employeeList);

        ArrayList<Employee> deserializedlist = new ArrayList<>();
        System.out.println(Methods.deserealize(deserializedlist));




    }
}

