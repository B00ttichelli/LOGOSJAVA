package Lesson11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        /*1) Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”.*/

        System.out.println("Type a word or type EXIT if u wish to stop the program");
        Scanner scanner  = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        String input;
        boolean exitflag = true;


        while (exitflag){
            input = scanner.next();
            if (input.equals("EXIT")){
                break;
            }
            Pattern pattern = Pattern.compile("^a");
            Matcher matcher  =  pattern.matcher(input);
            if (matcher.find()){
                array.add(input);
            }


        }


    }
}
