package Lesson11;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDB {
    private static ArrayList<String>  emailDB  = new ArrayList<String>();


    static void addMail (String mail) {
        Pattern pattern = Pattern.compile("@gmail.com$");
        Matcher matcher = pattern.matcher(mail);
         if(matcher.find()){
             emailDB.add(mail);
         }
    }

    static void showEmails (){
        for (String x: emailDB
             ) {
            System.out.println(x);
        }

    }

}
