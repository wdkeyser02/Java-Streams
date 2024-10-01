import java.util.List;
import java.util.stream.Stream;

public class Intro_4 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        Stream<String> stream = Stream.of("Bill", "Charly", "Gustaf", "Roland", "David");
        System.out.println("\n Stream: " + element(stream));
    }

    private static List<String> element(Stream<String> list) {
        return list.peek(System.out::println)
                        .toList();
    }
}
