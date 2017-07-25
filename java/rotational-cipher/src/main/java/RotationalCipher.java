public class RotationalCipher {

    int shift;

    public RotationalCipher(int i) {
        this.shift = i;
    }

    public String rotate(String text) {
        return text.chars().map(operand -> {
            if (operand > 64 && operand < 91) {
                return operand + shift > 90 ? operand + shift - 90 + 64 : operand + shift;
            }
            if (operand > 96 && operand < 123) {
                return operand + shift > 122 ? operand + shift - 122 + 96 : operand + shift;
            }
            return operand;
        }).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
