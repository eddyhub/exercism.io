public class RotationalCipher {

    int shift;

    public RotationalCipher(int i) {
        this.shift = i;
    }

    public String rotate(String text) {
        return text.chars().map(ch -> {
            if (Character.isLetter(ch)) {
                char a = Character.isUpperCase(ch) ? 'A' : 'a';
                return ((ch - a) + this.shift) % 26 + a;
            }
            return ch;
        }).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
