package lesson8enum;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int choice = 0;
        int daysinmonth = 0;
        int counter = 0;
        String season;
        Seasons[] seasons = Seasons.values();
    /*
       1 Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим ).
       2 Вивести всі місяці з такою ж порою року.
       3 Вивести всі місяці які мають таку саму кількість днів.
       4 Вивести на екран всі місяці які мають меншу кількість днів.
       5 Вивести на екран всі місяці які мають більшу кількість днів.
       6 Вивести на екран наступну пору року.
       7 Вивести на екран попередню пору року.
       8 Вивести на екран всі місяці які мають парну кількість днів.
       9 Вивести на екран всі місяці які мають непарну кількість днів.
       10 Вивести на екран чи введений з консолі місяць має парну кількість днів.*/
        while (!"11".equals(input)) {
            System.out.println("1.Check if month exist");
            System.out.println("2.Output All months with same season");
            System.out.println("3.Output all months with same day quantity");
            System.out.println("4.Output all months with less days");
            System.out.println("5.Output all months with more days");
            System.out.println("6.Output next season");
            System.out.println("7.Output  one season before");
            System.out.println("8.Output all monht with even days quantity");
            System.out.println("9.Outhput all days with ods days quantity");
            System.out.println("10.Chek if mont have even days quantity");
            System.out.println("Type 11 to exit");
            input = scanner.next();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Wrong Input,type only numbers");
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter name of the month");
                    String month = scanner.next().toUpperCase(Locale.ROOT);
                    boolean existense = monthExistance(month);
                    if (existense) {
                        System.out.println("Mont " + month + " exist");
                    } else {
                        System.out.println(month + " is not exist");
                    }

                    break;
                case 2:
                    System.out.println("Enter Season name");
                     season = scanner.next();
                    for (Months x : Months.values()) {

                        if (x.season.name().equals(season.toUpperCase(Locale.ROOT))) {
                            System.out.println(x);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter days quantity to search");

                    try {
                        daysinmonth = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Only Integer allowed");
                    }
                    for (Months months : Months.values()
                    ) {
                        if (months.dayquantity == daysinmonth) {
                            System.out.println(months);
                            counter++;
                        }

                    }
                    if (counter == 0) {
                        System.out.println("No month with that day quantity founded");
                    }

                    break;
                case 4:
                    System.out.println("Enter day quantity ");
                    try {
                        counter = 0;
                        daysinmonth = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Only numbers are allowed !");
                    }
                   lessORMore("less",daysinmonth);
                    break;
                case 5:

                    System.out.println("Enter day quantity ");
                    try {

                        daysinmonth = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Only numbers are allowed !");
                    }
                     lessORMore("more",daysinmonth);

                    break;
                case 6:
                    System.out.println("Enter season Name");
                    season = scanner.next();
                    int ordinal = -1;
                    for (Seasons s: Seasons.values()
                         ) {
                        if(s.name().equals(season.toUpperCase(Locale.ROOT))){
                            ordinal = s.ordinal();
                        }

                    }
                     seasons = Seasons.values();
                    if(ordinal >= 0){

                        ordinal++;
                        System.out.println(seasons[ordinal]);


                    }else if (ordinal == seasons.length-1){
                        System.out.println(seasons[0]);
                    }
                    else {
                        System.out.println("Season "+season + " dont exist");
                    }

                    break;
                case 7:
                    System.out.println("Enter season Name");
                    season  =  scanner.next().toUpperCase(Locale.ROOT);
                    int id = -1;
                    int idcounter = 0;
                    for (Seasons a :Seasons.values()
                         ) {
                         idcounter++;
                        if(a.name().equals(season)){
                            id = a.ordinal();
                        }

                    }

                    if(id == 0 ){
                        System.out.println(seasons[idcounter]);
                    }
                    else if (id == -1) {
                        System.out.println("Season "+ season+" not founded");

                }else {
                        System.out.println(seasons[id-1]);
                    }

                    break;
                case 8:
                    for (Months x: Months.values()
                         ) {
                        if(x.theEven()){
                            System.out.println(x);
                        }

                    }
                    break;
                case 9:
                    for (Months x : Months.values()){
                        if(!x.theEven()){
                            System.out.println(x);
                        }
                    }
                    break;
                case 10:
                    System.out.println("Enter mont name");
                    Months months = null;
                    try {
                        months = Months.getMonthByString(scanner.next());
                    } catch (RuntimeException e) {
                        System.out.println(e.toString());

                    }
                    if(months.theEven()){
                        System.out.println(months.name+" has even day quantity");
                    }
                    else{
                        System.out.println(months.name+" has odd day quantity");
                    }

                    /*                    counter = 0;
                    for (Months x: Months.values()
                         ) {
                        if(x.name.toUpperCase(Locale.ROOT).equals(input)){

                            if(x.theEven()){
                                System.out.println(x.name + " has even days quantity");
                            }else{
                                System.out.println(x.name + "has odd days quan");
                            }
                            counter++;
                        }

                    }
                    if(!(counter >0)){


                        System.out.println("Somthing is wrong");
                    }*/

                    break;
                case 11:

                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Wrong number");
            }

        }

    }

    static boolean monthExistance(String month) {

        for (Months x : Months.values()
        ) {

            if (month.equals(x.name.toUpperCase(Locale.ROOT))) {
                return true;
            }
        }
        return false;

    }

    static void lessORMore (String lesmore , int daysnumber){

        ArrayList<Months> less = new ArrayList<>(0);
        ArrayList<Months> more = new ArrayList<>(0);
        for (Months x : Months.values()
             ) {
            if (daysnumber > x.dayquantity) {
                more.add(x);

            } else if (daysnumber < x.dayquantity) {
                less.add(x);

            }
        }
            if (lesmore.equals("more")){
                if(less.isEmpty()){
                    System.out.println("the is no  month with days more then " + daysnumber);
                } else {
                    for (Months l : less
                    ) {
                        System.out.println(l);
                    }
                }
            }else if(lesmore.equals("less")) {
                if(more.isEmpty()){
                    System.out.println("the is no  month with days less then " + daysnumber);
                } else {
                for (Months m : more
                     ) {

                    System.out.println(m);
                }
                }
            }else {
                System.out.println("Fuck You");
            }
        }

    }

