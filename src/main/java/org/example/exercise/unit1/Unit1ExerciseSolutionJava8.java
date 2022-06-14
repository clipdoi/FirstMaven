package org.example.exercise.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("son", "nguyen", 20),
                new Person("thong", "Chan", 21),
                new Person("vu", "Cran", 32),
                new Person("phi", "le", 22)
        );
        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));

        printConditionally(people, p -> true);

        printConditionally(people, p -> p.getLastName().startsWith("C"));

        printConditionally(people, p -> p.getFirstName().startsWith("s"));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for(Person p:people){
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }

}


