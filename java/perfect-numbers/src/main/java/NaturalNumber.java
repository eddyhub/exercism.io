import java.util.stream.IntStream;

class NaturalNumber {

    private int number;

    public NaturalNumber(int i) {
        if (i < 1) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        number = i;
    }

    public Classification getClassification() {
        int aliquotSum = IntStream.rangeClosed(1, number/2).parallel().filter(i -> number % i == 0).sum();
        if (aliquotSum > number) return Classification.ABUNDANT;
        else if (aliquotSum < number) return Classification.DEFICIENT;
        return Classification.PERFECT;
    }
}
