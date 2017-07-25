public class PrimeCalculator {
    public int nth(int number) {
        if(number < 1) throw new IllegalArgumentException();
        int[] primes = new int[number];
        int nth = 0;
        primes[nth] = 2;
        boolean prime = true;
        for (int i = 3; i <= number * number; i++) {
            for (int j = 0; j <= nth; j++) {
                if (i % primes[j] == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) { nth++; primes[nth] = i;}
            prime = true;
            if(nth + 1 == number) break;
        }
        return primes[number - 1];
    }
}
