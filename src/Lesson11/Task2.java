package Lesson11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*2) Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на
@gmail.com*/


public class Task2 {
    public static void main(String[] args) {

        EmailDB.addMail("vasya@hotmail.com");
        EmailDB.addMail("anton@gmail.com");
        EmailDB.addMail("oleg@pidrila.org");
        EmailDB.addMail("gavrilo@gmail.com");
        EmailDB.addMail("ivan@zalupan.com");
        EmailDB.addMail("ihor@gmail.com");
        EmailDB.showEmails();



    }

}
