package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Juan Parra", Gender.MALE),
                new Person("John", Gender.MALE),
                new Person("George", Gender.MALE),
                new Person("Sofia", Gender.FEMALE),
                new Person("Marta", Gender.FEMALE)
        );

        //Imperativo
        for (Person p : people) {System.out.println(p.getName());}

        //Declarative way
        System.out.println("/Declarrtive way");
        people.forEach( person -> System.out.println(person.getName()));
        }






    }

    class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }
    }

    enum Gender {
        MALE, FEMALE
    }

