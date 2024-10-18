import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams_1 {
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

        Map<Boolean, List<Person>> members = people.stream()
            .collect(Collectors.partitioningBy(person -> person.age > 27));
        members.forEach((k , v) -> System.out.println(k + ": " + v + "\n"));
        System.out.println();

        members = people.stream()
            .collect(Collectors.partitioningBy(person -> person.firstName.equals("David")));
        members.forEach((k , v) -> System.out.println(k + ": " + v + "\n"));

    }

    private record Person(Integer id, String firstName, String lastName, Integer age) {}
}
