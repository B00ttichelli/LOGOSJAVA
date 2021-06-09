package Lesson19InputOutput;

import java.io.*;
import java.util.List;

public class Methods  {


    public static <T extends Serializable> void serialize(T t) {

        try (FileOutputStream fileOutputStream = new FileOutputStream("serialized.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(t);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static <T extends Serializable> String  deserealize (T t) {
            String result = "";
        try (FileInputStream fileInputStream = new FileInputStream("serialized.txt")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            t = (T) objectInputStream.readObject();
            return t.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;

    }

}

