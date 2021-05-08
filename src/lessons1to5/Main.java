package lessons1to5;

/*Домашнее задание второго и третьего урока
@author ВовненкоСергей*/



import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Пример решения квадратных уровнений
        System.out.println("Задача вычесления корней квадратных уровнений");
        System.out.println("Введите a,b,c через ентер !!");
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double D=b*b-4*a*c;
        // Ищем дискриминант по формуле D=bsqrt - 4ac

        // если  D>0 то уровнение имеет два корня
        if (D>0){
            double x1 = (-b -  Math.sqrt(D)) / (2*a);
            double x2 = (-b + Math.sqrt(D))/ (2*a);
            System.out.println("Roots is  " + x1 +  " " +x2);

        }
        // один корень
        else if (D==0){
            double x = -b/(2*a);
            System.out.println("Root is"+x);
        }
        // Упрощённый вариант алгоритма корней нет ;)
        else {
            System.out.println("Has no roots");
        }

        // Площадь круга и длина окружности
        System.out.println("Задача:Площадь круга и длина окружности");

        System.out.println("Введите радиус круга");
        double P = Math.PI; //константа  пи
        double R = scan.nextDouble(); // радиус круга

        double C = 2*P*R;
        System.out.println("Длинна окружности " +C);

        double S  = P*R*R;
        System.out.println("Площадь Круга " + S);






        // Самое близкое число к 10
        System.out.println("Задача: Самое близкое число к 10");
        System.out.println("Введите два числа ");
        double m = scan.nextDouble();
        double n = scan.nextDouble();

        if (Math.abs(10-m)<=Math.abs(10-n)){
            System.out.println(m);
        }else {
            System.out.println(n);
        }
        System.out.println("Задача минимального и максимального значения масива");
        // Задача минимального и максимального значения масива
        // указываю размер масимва
        int awesome = 50;
        // создаю масив указаного размера
        /// Новый комент

        double[] array = new double[awesome];
        //наполняю масив рандомными данными
        for(int x=0;x<awesome;x++){
            array[x]= Math.random();

        }

        //сортирую массив, класс масивов ещё не изучали потому пишем свой метод
        sortArr(array);
        // вывожу самое маленькое и самое большое на экран
        System.out.println("Минимально число в масиве "+array[0]);
        System.out.println("Максимальное число в масиве "+array[awesome-1]);


        //последовтельность непарных до 55
        System.out.println("Задача последовтельность непарных до 55");
        for (int x=1;x<56;x++){  //пока икс не равен 56 инкримент
            if(x%2!=0){ // если число непарное выводим на экран
                System.out.println(x);
            }
        }
        // последовательность делимая на 5
        System.out.println("обратная последовательность делимая на 5");
        for (int x = 90;x!=0;x=x-5){

            System.out.println(x);
        }
        //Дневник
        /*
        monday 	[ ˈmʌndeɪ ] 	понедельник
        tuesday 	[ ˈtjuːzdeɪ ] 	вторник
        wednesday 	[ ˈwenzdeɪ ] 	среда
        thursday 	[ ˈθɜːzdeɪ ] 	четверг
        friday 	[ ˈfraɪdeɪ ] 	пятница
        saturday 	[ ˈsætədeɪ ] 	суббота
        sunday 	[ ˈsʌndeɪ ] 	воскресенье*/

        System.out.println("Задача Дневник");
        System.out.println("Введите день недели на англиском языке !!");
        String day = scan.next();
        day.toLowerCase();
        switch (day) {
            case "monday": {
                System.out.println("Купить молоко");
                break;
            }
            case "tuesday": {
                System.out.println("Погулять в парке");
                break;
            }
            case "wednesday":{
                System.out.println("Выгулять черепаху");
                break;
            }
            case "thursday": {
                System.out.println("Убить Рэмбо");
                break;
            }
            case "friday":{
                System.out.println("Скушать луну");
                break;
            }
            case "saturday":{
                System.out.println("Отдыхать от дел");
                break;
            }
            case "sunday":{
                System.out.println("Сходить в церковь сатаны");
                break;
            }
            default:{
                System.out.println("Введи день недели правильно по англицки ");
            }
        }
    }

    //метод сортировки массива для задачи с масивом
    public static void sortArr (double  [] arr){
        for (int i = arr.length-1;i>0;i--){
            for (int j = 0; j<i;j++){
                if(arr[j]>arr[j+1]){
                    double tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

    }

    public static  void  test (int a){
        System.out.println(a);
    }

}

