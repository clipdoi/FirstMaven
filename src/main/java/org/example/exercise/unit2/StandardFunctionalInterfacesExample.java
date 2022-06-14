package org.example.exercise.unit2;

import org.example.exercise.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("son", "nguyen", 20),
                new Person("thong", "Chan", 21),
                new Person("vu", "Cran", 32),
                new Person("phi", "le", 22)
        );
        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));

        printConditionally(people, p -> true, p -> System.out.println(p));

        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        printConditionally(people, p -> p.getFirstName().startsWith("s"), p -> System.out.println(p.getFirstName()));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p:people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

}

