package org.example.exercise.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("son", "nguyen", 20),
                new Person("thong", "Cham", 21),
                new Person("vu", "Cran", 32),
                new Person("phi", "le", 22)
        );
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(people);

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person i:people){
            if(condition.test(i)){
                System.out.println(i);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for(Person i:people){
            System.out.println(i);
        }
    }


}

interface Condition {
    boolean test(Person p);
}
