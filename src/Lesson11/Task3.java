package Lesson11;

public class Task3 {
    /*3) Вхідним параметром є стрічка :
 String str = "I love Java more than my friend. Java is so beautiful.";
● перевірити чи є в стрічці слово “Java”;
● замінити слово “Java” на “C#”;
● замінити всі слова “Java” на “C#”;
*/
    public static void main(String[] args) {

        String str = "I love Java more than my friend. Java is so beautiful.";


        System.out.println(str.contains("Java"));
        str = str.replaceFirst("Java","C#");
        System.out.println(str);
        str =  str.replaceAll("Java","C#");

        System.out.println(str);

    }

}
