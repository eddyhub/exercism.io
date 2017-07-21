import java.util.stream.IntStream;

public class LargestSeriesProductCalculator {

    String str;

    public LargestSeriesProductCalculator(String s) {
        if (s == null) throw new IllegalArgumentException("String to search must be non-null.");
        if (s.matches(".*\\D+.*")) throw new IllegalArgumentException("String to search may only contains digits.");
        this.str = s;
    }

    public long calculateLargestProductForSeriesLength(int n) {
        if (n < 0) throw new IllegalArgumentException("Series length must be non-negative.");
        return IntStream
                .rangeClosed(0, str.length() - n)
                .mapToObj(index -> str.substring(index, index + n))
                .mapToLong(s -> s
                        .chars()
                        .map(Character::getNumericValue)
                        .mapToLong(Long::valueOf)
                        .reduce(1, (k, l) -> k * l))
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Series length must be less than or equal to the length of the string to search."));
    }
}