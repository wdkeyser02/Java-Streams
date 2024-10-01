import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Streams_11 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Person> people = Arrays.asList(
                new Person(1,"Alice", "Gates",25),
                new Person(2,"David", "Smith",30),
                new Person(3,"Charlie", "Jones",22),
                new Person(4,"David", "Williams",35),
                new Person(5,"Eva", "Taylor",28),
                new Person(6,"Frank", "Evans",22),
                new Person(6,"David", "Robinson",21)
        );
        Optional<String> stream = people.stream()
            .filter(person -> person.firstName.equals("David"))
            .max(Comparator.comparing(Person::age))
            .map(person -> person.firstName + " " + person.lastName);
        
        stream.ifPresent(System.out::println);
    }

    private record Person(Integer id, String firstName, String lastName, Integer age) {
    }
}
