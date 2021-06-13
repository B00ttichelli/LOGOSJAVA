package lesson20Threads;

import java.util.Scanner;

public class MyThread extends Thread{

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("How much numbers of Fibonacci sequence you want to see ?");
        try {
            fibonacci(scanner.nextInt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ");

    }
    // А тут без рекурсии тупым цыклом
    public void  fibonacci (int n) throws InterruptedException {

        int fib1=1;
        int fib2=1;
        int fibsum;

        if (n<=1){
            System.out.println("expect at least 2 terms for a Fibonacci sequence");
        }else {
            System.out.print(fib1+" ");
            Thread.sleep(1000);
            System.out.print(fib2+" ");
            Thread.sleep(1000);

            for (int i = 2; i < n; i++) {

                fibsum = fib1 + fib2;
                System.out.print(fibsum + " ");
                fib1 = fib2;
                fib2 = fibsum;
                Thread.sleep(1000);

            }
        }

    }
}
