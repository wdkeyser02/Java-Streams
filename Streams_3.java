import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_3 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Person> people = Arrays.asList(
            new Person(1,"Alice", "Gates",25),
            new Person(2,"David", "Smith",30),
            new Person(3,"Charlie", "Jones",22),
            new Person(4,"David", "Williams",35),
            new Person(5,"Eva", "Taylor",28),
            new Person(6,"Frank", "Evans",22),
            new Person(7,"David", "Robinson",21)
        );

        List<String> name = people.stream()
            .collect(Collectors.mapping(Person::firstName, Collectors.toList()));
            name.forEach(System.out::println);
        System.out.println();

        name = people.stream()
            .collect(Collectors.mapping(person -> person.firstName + " " + person.lastName + " is " + person.age + " years old.", Collectors.toList()));
            name.forEach(System.out::println);
        System.out.println();

        List<Integer> age = people.stream()
            .collect(Collectors.mapping(Person::age, Collectors.toList()));
            age.forEach(System.out::println);
    }

    private record Person(Integer id, String firstName, String lastName, Integer age) {}
}
