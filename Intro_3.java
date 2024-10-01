import java.util.List;
import java.util.stream.Stream;

public class Intro_3 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        Stream<Integer> stream = Stream.of(8,4,5,1,2,5,3,7,9);
        System.out.println("\n Stream: " + element(stream));
    }

    private static List<Integer> element(Stream<Integer> list) {
        return list.peek(System.out::println)
                        .toList();
        
    }
}
