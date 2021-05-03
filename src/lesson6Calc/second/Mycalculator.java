package lesson6Calc.second;

import lesson6Calc.first.Numerable;

public class Mycalculator implements Numerable {



    @Override
    public double devide(int a, int b) {
        return (double) a/b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int plus(int a, int b) {
        return a+b;
    }


}
