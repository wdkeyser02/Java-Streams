import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intro_5 {
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
        Stream<Person> stream = people.stream();
        System.out.println("\n Stream: " + element(stream));
    }

    private static List<Person> element(Stream<Person> list) {
        return list.peek(System.out::println)
                        .filter(a -> a.age > 25)
                        .map(a -> new Person(a.id, a.firstName.toUpperCase(),a.lastName.toUpperCase(),a.age))
                        .toList();
    }

    private record Person(Integer id, String firstName, String lastName, Integer age) {
    }
}
