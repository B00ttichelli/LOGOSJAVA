package lesson9Exeptions;

public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
        System.out.println("Its My Exeption");
    }
}
