package org.example.exercise.unit3;

import org.example.exercise.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("son", "nguyen", 20),
                new Person("thong", "Chan", 21),
                new Person("vu", "Cran", 32),
                new Person("phi", "le", 22)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(System.out::println);
        long count = people.stream().filter(p -> p.getLastName().startsWith("C")).count();
        System.out.println(count);

        long count2 = people.parallelStream().filter(p -> p.getLastName().startsWith("l"))
                .count();
    }
}
