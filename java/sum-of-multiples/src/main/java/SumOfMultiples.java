import java.util.Arrays;
import java.util.stream.IntStream;

class SumOfMultiples {

    int sum;

    SumOfMultiples(int number, int[] set) {
        sum = Arrays
                .stream(set)
                .mapToObj(i -> IntStream.rangeClosed(1, number / i).parallel().map(j -> j * i).boxed().toArray(Integer[]::new))
                .flatMap(i -> Arrays.stream(i))
                .distinct()
                .filter(i -> i < number)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    int getSum() {
        return sum;
    }

}
