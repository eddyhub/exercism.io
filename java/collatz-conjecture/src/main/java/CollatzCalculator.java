/**
 * Created by edi on 25.07.17.
 */
public class CollatzCalculator {
    int steps;

    public int computeStepCount(int i) {
        if (i < 1) throw new IllegalArgumentException("Only natural numbers are allowed");
        
        if (i != 1) {
            steps++;
            if (i % 2 == 0) computeStepCount(i / 2);
            else computeStepCount(3 * i + 1);
        }
        return steps;
    }
}
