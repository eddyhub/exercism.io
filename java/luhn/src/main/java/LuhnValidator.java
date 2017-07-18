import java.util.stream.IntStream;

class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replace(" ", "");
        if(candidate.length() < 2) return false;
        int sum = 0;
        int currentNumber = 0;
        int length = candidate.length();
        for(int i = 1; i <= length; i++) {
            currentNumber = Character.digit(candidate.charAt(length - i), 10);
            if (currentNumber < 0) return false;
            if(i%2 == 0) {
                currentNumber = (currentNumber * 2 > 9) ? (currentNumber * 2) - 9 : currentNumber * 2;
            }
            sum += currentNumber;
        }
        return sum % 10 == 0;
    }
}
