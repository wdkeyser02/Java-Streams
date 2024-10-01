import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intro_1 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        List<Integer> list = Arrays.asList(8,4,6,1,2,5,3,7,9);
        Stream<Integer> stream = list.stream();
        System.out.println("\n Stream: " + element(stream));
    }

    private static List<Integer> element(Stream<Integer> list) {
        return list.peek(System.out::println)
                        .toList();
        
    }
}
