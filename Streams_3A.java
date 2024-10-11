import java.util.List;

public class Streams_3A {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Long> result = numbers.stream()
            .mapMultiToLong((num, downstream) -> {
                downstream.accept(num);
            })
            .boxed()
            .toList();
        
        result.forEach(System.out::println);
    }
}
