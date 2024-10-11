import java.util.List;

public class Streams_2A {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<String> numbers = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<Integer> result = numbers.stream()
            .mapMultiToInt((num, downstream) -> {
                try {
                    downstream.accept(Integer.valueOf(num));
                } catch (Exception e) {
                    downstream.accept(Integer.valueOf(0));
                }
            })
            .boxed()
            .toList();
        
        result.forEach(System.out::println);
    }
}
