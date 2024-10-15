import java.util.List;

public class Streams_2 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = numbers.stream()
            .mapMultiToInt((num, downstream) -> {
                downstream.accept(num);
            })
            .boxed()
            .toList();
        System.out.println(result);
        System.out.println("------------------------------------------------");

        List<Integer> result_A = numbers.stream()
            .mapMultiToInt((num, downstream) -> {
                if (num > 5) {
                    downstream.accept(num);
                } else {
                    downstream.accept(0);
                }
            })
            .boxed()
            .toList();
        
        System.out.println(result_A);
        System.out.println("------------------------------------------------");

        List<Integer> result_B = numbers.stream()
            .mapMultiToInt((num, downstream) -> {
                downstream.accept(num);
                downstream.accept(num * num);
                downstream.accept(num * num * num);
                downstream.accept(num * num * num * num);
            })
            .boxed()
            .toList();
        
        System.out.println(result_B);
        System.out.println("------------------------------------------------");
    }
}
