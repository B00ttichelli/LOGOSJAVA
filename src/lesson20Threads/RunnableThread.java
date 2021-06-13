package lesson20Threads;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    static private Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {
        System.out.println("How much numbers of reversed Fibonacci sequence you want to see ? ");
        try {
            printReversedSequence(scanner.nextInt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();

    }

   //моя любимая рекурсия ))
    private int fib (int n){
        if(n<=1){
            return n;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }

    // и тут она ))
    private void printReversedSequence(int n) throws InterruptedException {
        if(n<=1){
            System.out.println(fib(n));

        }else {
            System.out.print(fib(n)+" ");
            Thread.sleep(1000);
            printReversedSequence(n-1);
        }
    }

}
