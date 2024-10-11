import java.util.List;

public class Streams_1 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<String> numbers = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> result = numbers.stream()
            .<String>mapMulti((num, downstream) -> {
                downstream.accept(num);
            })
            .toList();
        
        result.forEach(System.out::println);
        System.out.println("------------------------------------------------");

        List<Integer> result_integer = numbers.stream()
            .<Integer>mapMulti((num, downstream) -> {
                try {
                    downstream.accept(Integer.valueOf(num));
                } catch (Exception e) {
                    downstream.accept(Integer.valueOf(0));
                }
            })
            .toList();
        
        result_integer.forEach(System.out::println);
    }
}
