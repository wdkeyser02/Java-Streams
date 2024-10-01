import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Intro_6 {
    public static void main(String[] args) {
        System.out.println("Java Streams");
        IntStream stream = IntStream.range(1, 10);
        System.out.println("\n Stream: " + element(stream));
    }

    private static List<Integer> element(IntStream list) {
        return list.boxed()
                        .filter(predicate_1.and(predicate_2))
                        .map(function_1)
                        .toList();
    }

    private static Predicate<Integer> predicate_1 = new Predicate<Integer>() {

        @Override
        public boolean test(Integer t) {
            System.out.println("Predicate one: " + t);
            if (t > 3) {
                return true;
            }
            return false;
        }
    };

    private static Predicate<Integer> predicate_2 = new Predicate<Integer>() {

        @Override
        public boolean test(Integer t) {
            System.out.println("Predicate two: " + t);
            if (t < 8) {
                return true;
            }
            return false;
        }
    };

    private static Function<Integer, Integer> function_1 = new Function<Integer, Integer>() {

        @Override
        public Integer apply(Integer t) {
            System.out.println("Function: " + t);
            return t * 2;
        }
    };
}
