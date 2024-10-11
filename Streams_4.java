import java.util.List;

public class Streams_4 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        List<Double> result = numbers.stream()
            .mapMultiToDouble((num, downstream) -> {
                downstream.accept(num);
            })
            .boxed()
            .toList();
        
        result.forEach(System.out::println);
    }
}
