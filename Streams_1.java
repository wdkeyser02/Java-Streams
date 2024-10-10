import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

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
            new Person(7,"David", "Robinson",21));

        List<Points> points = Arrays.asList(    
            new Points(1, 1,95, LocalDate.of(2024,5,25)), 
            new Points(2, 1,85, LocalDate.of(2024,6,24)),
            new Points(3, 2,75, LocalDate.of(2024,5,25)), 
            new Points(4, 2,88, LocalDate.of(2024,6,23)),
            new Points(5, 3,95, LocalDate.of(2024,5,25)), 
            new Points(6, 3,89, LocalDate.of(2024,6,22)),
            new Points(7, 4,50, LocalDate.of(2024,5,18)), 
            new Points(8, 4,80, LocalDate.of(2024,6,28)),
            new Points(9, 5,69, LocalDate.of(2024,5,12)), 
            new Points(10, 5,81, LocalDate.of(2024,6,29)),
            new Points(11, 6,99, LocalDate.of(2024,5,9)), 
            new Points(12, 6,40, LocalDate.of(2024,6,14)),
            new Points(13, 7,90, LocalDate.of(2024,5,15))
        );

        List<Person_Result> result = people.stream()
            .map(person -> {
                List<Points_Result> point_temp = points.stream()
                    .<Points_Result>mapMulti((point, downstream) -> {
                        if (point.personId.equals(person.id)) {
                            downstream.accept(new Points_Result(point.id, point.points, point.date));
                        }
                    })
                    .toList();
                return new Person_Result(person.id, person.firstName, person.lastName, person.age, point_temp);
            })
            .toList();
        result.forEach(System.out::println);

    }

    private record Person(Integer id, String firstName, String lastName, Integer age) {}
    private record Points(Integer id, Integer personId, Integer points, LocalDate date) {}

    private record Person_Result(Integer id, String firstName, String lastName, Integer age, List<Points_Result> points) {}
    private record Points_Result(Integer id, Integer points, LocalDate date) {}
}
