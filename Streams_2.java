import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Streams_2 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Person> people = Arrays.asList(
                new Person(1,"Alice", "Gates",25),
                new Person(2,"Bob", "Smith",30),
                new Person(3,"Charlie", "Jones",22),
                new Person(4,"David", "Williams",35),
                new Person(5,"Eva", "Taylor",28),
                new Person(6,"Frank", "Evans",22)
        );
        List<Person> stream = people.stream()
            .sorted(Comparator.comparing(Person::age))
            .toList();
        stream.forEach(System.out::println);
    }

    private record Person(Integer id, String firstName, String lastName, Integer age) {
    }
}
