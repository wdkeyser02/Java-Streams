import java.util.List;

public class Streams_3 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Long> numbers = List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L);
        List<Long> result = numbers.stream()
            .mapMultiToLong((num, downstream) -> {
                downstream.accept(num);
            })
            .boxed()
            .toList();
        
        result.forEach(System.out::println);
    }
}
