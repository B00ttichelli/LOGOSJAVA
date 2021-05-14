package lesson10String;
/*
@author Vovvnenko Serhii
а) Ініціалізувати стрічку : String str = "I like Java !!!".
        б) Роздрукувати останній символ рядка. Використовуємо метод
        в) Перевірити, чи закінчується ваша рядок підрядком "!!!".
        г) Перевірити, чи починається ваша рядок підрядком "I like".
        д) Перевірити, чи містить ваша рядок підрядок "Java".
        e) Знайти позицію підрядка "Java" в рядку "I like Java !!!".
        ж) Замінити всі символи "а" на "о".
        з) Перетворіть рядок до верхнього регістру.
        і) Перетворіть рядок до нижнього регістру.
        к) Вирізати рядок Java c допомогою методу String.substring() .
*/

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String str  =  "I like Java !!!" ;
        System.out.println(str.charAt(str.length()-1)); // Print last simbol
        System.out.println(str.endsWith("!!!")); //  Cheking if string ends with !!!
        System.out.println(str.startsWith("I like"));// cheking if string begins with !!
        System.out.println(str.contains("Java")); // cheking if string contains !!
        System.out.println(str.indexOf("Java"));  //Showing index of postion of substring "Java"
        System.out.println(str.replace("a","o")); // replacing o to a in whole string
        System.out.println(str.toUpperCase(Locale.ROOT)); //  Switching string to upper case
        System.out.println(str.toLowerCase(Locale.ROOT)); //  Swithcing string to lower case
        System.out.println(str.substring(7,11)); // Cuting java from string using substring method

    }
}
