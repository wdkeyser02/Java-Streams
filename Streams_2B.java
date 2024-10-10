import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

public class Streams_2B {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Person> people = Arrays.asList(
            new Person(1,"Alice", "Gates",25, Arrays.asList(
                new Points(1, 95, LocalDate.of(2024,5,25)), 
                new Points(2, 85, LocalDate.of(2024,6,24)))),
            new Person(2,"David", "Smith",30, Arrays.asList(
                new Points(3, 75, LocalDate.of(2024,5,25)), 
                new Points(4, 88, LocalDate.of(2024,6,23))
            )),
            new Person(3,"Charlie", "Jones",22, Arrays.asList(
                new Points(5, 95, LocalDate.of(2024,5,25)), 
                new Points(6, 89, LocalDate.of(2024,6,22))
            )),
            new Person(4,"David", "Williams",35, Arrays.asList(
                new Points(7, 50, LocalDate.of(2024,5,18)), 
                new Points(8, 80, LocalDate.of(2024,6,28))
            )),
            new Person(5,"Eva", "Taylor",28, Arrays.asList(
                new Points(9, 69, LocalDate.of(2024,5,12)), 
                new Points(10, 81, LocalDate.of(2024,6,29))
            )),
            new Person(6,"Frank", "Evans",22, Arrays.asList(
                new Points(11, 99, LocalDate.of(2024,5,9)), 
                new Points(12, 40, LocalDate.of(2024,6,14))
            )),
            new Person(7,"David", "Robinson",21, Arrays.asList(
                new Points(13, 90, LocalDate.of(2024,5,15))
            ))
        );

        List<Points_Result> points_Result = people.stream()
            .flatMap(person -> person.points.stream()
                .map(point -> new Points_Result(point.id, person.id, point.points, point.date))
            )
            .toList();
        points_Result.forEach(System.out::println);
    }

    private record Person(Integer id, String firstName, String lastName, Integer age, List<Points> points) {}
    private record Points(Integer id, Integer points, LocalDate date) {}
    
    private record Points_Result(Integer id, Integer personId, Integer points, LocalDate date) {}
}
