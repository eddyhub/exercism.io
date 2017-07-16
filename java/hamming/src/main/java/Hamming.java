import java.util.stream.IntStream;

public class Hamming {
    public static Integer compute(String dnaStrandA, String dnaStrandB) throws IllegalArgumentException {
        if(dnaStrandA.length() != dnaStrandB.length()) throw new IllegalArgumentException();
        return IntStream.rangeClosed(0, dnaStrandA.length() - 1)
                .map(i -> dnaStrandA.charAt(i) == dnaStrandB.charAt(i) ? 0 : 1)
                .sum();
    }
}
