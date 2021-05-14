package lesson10String;

import java.util.Scanner;

/*2)Ввести n слів з консолі. Знайти найдовше і найкоротше слово та вказати яким воно було
        введено(порядковий номер).*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type word with spaces");
        String input = scanner.nextLine();

        while (input.contains("  ")){                 //cleaning string from double spaces
            input = input.replace("  ", " ");

        }
         String [] arr = input.split(" "); // creating an array from string using space as spliter
         int smallestindex = 0;
         int bigestindex  =  0;
         int bigestnumbers = arr[0].length();
         int smalestnumbers =  arr[0].length();
         for (int i = 0; i<arr.length; i++){   // founding bigest and smallest
             if(arr[i].length()>bigestnumbers){
                 bigestnumbers  = arr[i].length();
                 bigestindex = i;

             }
             if(arr[i].length()<smalestnumbers){
                 smalestnumbers = arr[i].length();
                 smallestindex = i;
             }
         }

        System.out.println("Smalest word and  index: " + arr[smallestindex] + " , index  " + smallestindex);
         System.out.println("Bigest word and index: " + arr[bigestindex] + " , index " + bigestindex);


    }
}
