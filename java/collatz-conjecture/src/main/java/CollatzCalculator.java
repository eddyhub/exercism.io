public class CollatzCalculator {
    public int computeStepCount(int i) {
        if (i < 1) throw new IllegalArgumentException("Only natural numbers are allowed");
        int steps = 0;
        for(; i != 1; steps++) {
            i = i % 2 == 0 ? i / 2 : 3*i+1;
        }
        return steps;
    }
}
