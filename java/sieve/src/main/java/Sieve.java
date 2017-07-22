import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Sieve {
    int maxPrime;
    int[] primes;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
        primes = IntStream.rangeClosed(2, maxPrime).toArray();
    }

    List<Integer> getPrimes() {
        for (int i = 2; i <= (int) Math.sqrt(maxPrime); i++) {
            for (int j = 0; j < primes.length; j++) {
                if (primes[j] != 0 && primes[j] % i == 0 && primes[j] / i != 1) {
                    primes[j] = 0;
                }
            }
        }
        return Arrays.stream(primes).filter(i -> i != 0).boxed().collect(Collectors.toList());
    }
}