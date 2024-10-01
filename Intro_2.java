import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Intro_2 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        Stream<Integer> stream = numbers.stream();
        System.out.println("\n Stream: " + element(stream));
    }

    private static List<Integer> element(Stream<Integer> list) {
        return list.peek(System.out::println)
                        .toList();
        
    }
}
