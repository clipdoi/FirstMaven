package org.example.lambda;

public class Greater {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greater greater = new Greater();



        Greeting lambdaGreeting = () -> {
            System.out.println("hello world");
        };

        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello world");
            }
        };

        greater.greet(lambdaGreeting);
    }
}