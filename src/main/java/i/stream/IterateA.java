package i.stream;

import i.model.Person;

import java.util.stream.IntStream;

public class IterateA {
    public static void main(String[] args) {
        Person person = new Person();
        IntStream.range(0, person.getSize()).mapToObj(person::get).forEach(System.out::println);
    }
}


