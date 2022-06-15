package org.example.exercise.unit3;

import org.example.exercise.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("son", "nguyen", 20),
                new Person("thong", "Chan", 21),
                new Person("vu", "Cran", 32),
                new Person("phi", "le", 22)
        );

        // print all person
        printConditionally(people, p -> true, System.out::println); // p -> method(p);

        Thread t = new Thread(MethodReferenceExample::printMessage); // p -> method()
        t.run();
    }

    private static void printMessage() {
        System.out.println("hello");
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p:people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
