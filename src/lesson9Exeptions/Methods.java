package lesson9Exeptions;

public class Methods {

    private int a;
    private int b;

    public Methods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void Minus() throws IllegalAccessException,ArithmeticException,IllegalArgumentException,MyException {

        checkAB();
        System.out.println(a-b);

    }

    public void Plus() throws IllegalAccessException,ArithmeticException,IllegalArgumentException,MyException  {
        checkAB();
        System.out.println(a+b);

    }
    public void  Multiply () throws IllegalAccessException,ArithmeticException,IllegalArgumentException,MyException  {
        checkAB();
        System.out.println(a*b);
    }
    public void Divide() throws IllegalAccessException,ArithmeticException,IllegalArgumentException,MyException  {
        checkAB();
        System.out.println(a/b);
    }
    void checkAB() throws IllegalAccessException,ArithmeticException,IllegalArgumentException,MyException {
        if(this.a == 0 && this.b==0){
            throw new IllegalAccessException();
        }else if(this.a == 0 && this.b !=0 || this.a !=0 && b==0){
            throw new ArithmeticException();
        }else if(this.a<0 && this.b<0){
            throw new IllegalArgumentException();
        } else if (this.a>0 && this.b>0) {
            throw new MyException("My Super Exeption");
        }
    }
}
