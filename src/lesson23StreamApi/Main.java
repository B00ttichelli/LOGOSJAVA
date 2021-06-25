package lesson23StreamApi;


/*Дана колекція клас People (з полями name - ім'я, age - вік, sex - стать)
        ● Вибрати чоловіків-військовозобов'язаних (від 18 до 27 років)
        ● Знайти середній вік серед чоловіків
        ● Знайти кількість потенційно працездатних людей у вибірці (тобто від 18 років і з
        огляду на що жінки виходять в 55 років, а чоловік в 60)
        ● Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку
        ● Відсортувати колекцію людей спочатку за ім’ям, а потім за віком
        ● Знайти найстаршу людину
        ● Знайти наймолодшу людину
        ● Вивести скільки є чоловіків
        ● Вивести скільки є жінок
        ● Вивеcти всіх жінок в яких ім’я починається на “A*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<People> peoples = new ArrayList<>();
        peoples.add(new People("Ann", 34, "F"));
        peoples.add(new People("John", 15, "M"));
        peoples.add(new People("Merry", 23, "F"));
        peoples.add(new People("Oksana", 27, "F"));
        peoples.add(new People("Andrew", 18, "M"));
        peoples.add(new People("Alex", 67, "M"));
        peoples.add(new People("Julia", 58, "F"));
        peoples.add(new People("Fatima", 14, "F"));


        List<People> canBeSoldiers = peoples.stream().filter(
                (a) -> a.getSex().equals("M")).filter(
                (a) -> a.getAge() >= 18 && a.getAge() <= 27).collect(Collectors.toList());
        System.out.println(canBeSoldiers);  // наши солдатики )))

        System.out.println(peoples.stream().filter((a)->a.getSex().equals("M")).mapToInt(
                (a)->a.getAge()).average().getAsDouble()); // средний возраст мужиков


        List<People> workers = peoples.stream().filter(
                a -> a.getSex().equals("M") && a.getAge() >= 18 &&
                        a.getAge() <= 60 || a.getSex().equals("F") &&
                        a.getAge() >= 18 && a.getAge() <= 55).collect(Collectors.toList()); // список работопригодных
        System.out.println(workers);

        List<People> sortedBack = peoples.stream().sorted(
                (a, b) -> b.getName().compareTo(a.getName())).collect(Collectors.toList()); //сортиторвка верхногами
        System.out.println(sortedBack);

        List<People> sortedTwoTimes = peoples.stream().sorted(
                Comparator.comparing(People::getName)).sorted(
                        (a, b) -> Math.max(a.getAge(), b.getAge())).collect(Collectors.toList()); // сортируем два раза
        System.out.println(sortedTwoTimes);

        Optional<People> max = peoples.stream().max(Comparator.comparingInt(People::getAge)); // самый старший человек
        Optional<People> min = peoples.stream().min(Comparator.comparingInt(People::getAge)); // самый младший человек
        System.out.println(max.get());
        System.out.println(min.get());


        System.out.println((int) peoples.stream().filter((a) -> a.getSex().equals("M")).count()); // количество мужиков
        System.out.println((int) peoples.stream().filter((a) -> a.getSex().equals("F")).count()); // количество леди

        peoples.stream().filter(
                (a)->a.getSex().equals("F")&&a.getName().startsWith("A")).collect(Collectors.toList()).forEach(System.out::println); //Вивожу всех женищин с именем на А
    }


}
