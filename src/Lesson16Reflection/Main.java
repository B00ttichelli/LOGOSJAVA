package Lesson16Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass("test",777);


        Class reflection = simpleClass.getClass();
        // Get and print all methods for class
        System.out.println("Methods:");
        Method [] methods = reflection.getMethods();
        for (Method m:methods
             ) {
            System.out.println(m);
        }
        //Get and prints all fields
        System.out.println("Fields:");
        Field[] fields = reflection.getFields();

        for (Field field : fields) {
            System.out.println(field);
        }
        //Same for constructors
        System.out.println("Constructors");
        Constructor[] constructors = reflection.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println(simpleClass); //showing class before changes
        //Setting fields via private method using reflection
        try {
            Method method = simpleClass.getClass().getDeclaredMethod("setSimplestring", String.class);
            method.setAccessible(true);
            method.invoke(simpleClass,"Suck");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //Getting same field via private method using reflection

        try {
            Method setmethod = simpleClass.getClass().getDeclaredMethod("getSimplestring");
            setmethod.setAccessible(true);
            setmethod.invoke(simpleClass);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("Same class was changed using reflection !!! I did it ) Its was easy as hell");
        System.out.println(simpleClass);//after changes
    }


}
