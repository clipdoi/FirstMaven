package org.example.exercise.unit3;

import org.example.exercise.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("son", "nguyen", 20),
                new Person("thong", "Chan", 21),
                new Person("vu", "Cran", 32),
                new Person("phi", "le", 22)
        );

        people.forEach(System.out::println);
    }
}
