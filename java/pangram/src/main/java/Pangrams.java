import java.util.stream.IntStream;

public class Pangrams {
    public static boolean isPangram(String sentence) {
        return IntStream.rangeClosed('a', 'z').allMatch(i -> sentence.toLowerCase().indexOf(i) != -1);
    }
}
