import java.util.stream.IntStream;

public class DifferenceOfSquaresCalculator {
    public int computeSquareOfSumTo(int i) {
        int tmpResult = IntStream.rangeClosed(1, i).sum();
        return tmpResult * tmpResult;
    }

    public int computeSumOfSquaresTo(int i) {
        return IntStream.rangeClosed(1, i).map(x -> x * x).sum();
    }

    public int computeDifferenceOfSquares(int i) {
        return computeSquareOfSumTo(i) - computeSumOfSquaresTo(i);
    }
}
