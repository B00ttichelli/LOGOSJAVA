package lesson9Exeptions;

public class Task3 {
    /*
    3.Створити свій Exception(MyException). Створити клас Methods, Описати в ньому методи , які б
    розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати :
    Якщо a<0 і b<0 викидаємо IllegalArgumentException
    Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
    Якщо a=0 і b=0 викидаємо IllegalAccessException
    Якщо a>0 і b>0 викидаємо MyException
    Протестувати всі можливі варіанти, і вивести все на консоль.*/
    public static void main(String[] args) {

        try {

            myTry(0,0);
        }
        catch (IllegalAccessException e){
            System.out.println(e);

           try {
               myTry(0,5);
           }catch (Exception ex){
               System.out.println(ex);
               try {
                   myTry(-1,-5);
               }catch (Exception exe){
                   System.out.println(exe);
                   try {
                       myTry(10,10);
                   }catch (Exception exep){
                       System.out.println(exep);
                   }
               }
           }
        }

    }
    static void   myTry  (int a,int b) throws IllegalAccessException,ArithmeticException,IllegalArgumentException,MyException {
        Methods methods = new Methods(a,b);
        try {
            methods.Minus();
        }
        catch (IllegalAccessException e){
            throw e;
        }catch (IllegalArgumentException e) {
            throw e;
        }  catch (ArithmeticException e){
            throw e;
        } catch (MyException e){
            throw e;
        }

    }
}
