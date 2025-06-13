package secao21.nivelamento_hibernate_parte_1.application;

import secao21.nivelamento_hibernate_parte_1.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(2, "Joaquim Torres", "joaquim@gmail.com");
        Person p3 = new Person(3, "Ana Maria", "ana@gmail.com");

        List<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        
        persons.forEach(System.out::println);
    }
}
