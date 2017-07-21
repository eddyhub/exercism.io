public class LargestSeriesProductCalculator {

    String s;

    public LargestSeriesProductCalculator(String s) {
        if(s == null) throw new IllegalArgumentException("String to search must be non-null.");
        if(s.matches(".*\\D+.*")) throw new IllegalArgumentException("String to search may only contains digits.");
        this.s = s;
    }

    public long calculateLargestProductForSeriesLength(int n) {
        if(n < 0) throw new IllegalArgumentException("Series length must be non-negative.");
        if(s.length() < n) throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        long max = 0;
        for (int i = 0; i <= s.length() - n; i++) {
            String substring = s.substring(i, i + n);
            long tmp = substring.chars().map(Character::getNumericValue).mapToLong(Long::valueOf).reduce(1, (k,l) -> k * l);
            if (max < tmp) max = tmp;
        }
        return max;
    }
}