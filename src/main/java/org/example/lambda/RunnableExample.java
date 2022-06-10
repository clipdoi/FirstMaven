package org.example.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        Thread myThread2 = new Thread(() -> System.out.println("Printed"));

        myThread2.run();


    }
}
