import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Sieve {
    int maxPrime;
    List<Integer> numbers;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
        numbers = IntStream.rangeClosed(2, this.maxPrime).boxed().collect(Collectors.toList());
    }

    List<Integer> getPrimes() {
        IntStream.rangeClosed(2, (int)Math.sqrt(maxPrime)).forEach(i -> numbers.removeIf(j -> j % i == 0 && j / i != 1));
        return numbers;
    }
}