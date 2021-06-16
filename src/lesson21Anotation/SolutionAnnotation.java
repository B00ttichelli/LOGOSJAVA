package lesson21Anotation;


/*
        1.Створити власну анотацію, яка буде приймати хоча б один параметр. Створити
        клас із певними полями і над декількома полями написати власну анотацію.
        Створити метод який буде записувати поля класу які промарковані анотацією в
        файл(рефлексія).*/


import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;

public class SolutionAnnotation {


    public static void main(String[] args) {

        // создаем обект класа с нашими анотациями
        Foo foo = new Foo();
        // запускаем наш метод с обьектом нашего класса
        try {
            annotationToFile(foo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // сам хуев метод
    public static void annotationToFile(Object o) throws IOException {
        Class clazz = o.getClass(); //это рефлексия детка
        Field[] declaredFields = clazz.getDeclaredFields(); // флексим филды рефлексией в масив филдов
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of("AnnotationToFile")); //опача вот и файл в буферридер как два байта переслать
        // хуле цыклом по филдам валим
        for (Field f : declaredFields
        ) {
            // если у филда есть наша анотация то
            if (f.isAnnotationPresent(MyAnnotation.class)) {
                bufferedWriter.append(f.getName()+" with annotation name  "+f.getAnnotation(MyAnnotation.class).name()); // пишем имя филды и названия анотации в файл
                bufferedWriter.append("\n"); // можна и нюлайн но так олскульнее )))
            }
        }
        bufferedWriter.close();// закрываем буферы и запись в файл
    }
}
