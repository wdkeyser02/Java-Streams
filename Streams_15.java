import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_15 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Integer> numbers1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> numbers2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> numbers3 = Arrays.asList(2, 3, 5, 7, 11);
        List<List<Integer>> numbers = Arrays.asList(numbers1, numbers2, numbers3);
        System.out.println("Start numbers: " + numbers);

        List<Integer> result_map = numbers.stream()
                                    .map(list -> list.stream()
                                                        .mapToInt(x -> x)
                                                        .max()
                                                        .getAsInt())
                                    .collect(Collectors.toList());
        System.out.println("Result: " + result_map);

        Integer result_flatmap = numbers.stream()
                                    .flatMap(list -> list.stream())
                                    .mapToInt(x -> x)
                                    .max()
                                    .getAsInt();
        System.out.println("Result: " + result_flatmap);
    }
}
