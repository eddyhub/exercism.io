import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {

    String acronym;

    Acronym(String phrase) {
        acronym = Arrays.stream(phrase.toUpperCase().split(" |-"))
                .map(s -> String.valueOf(s.charAt(0)))
                .collect(Collectors.joining());
    }

    String get() {
        return acronym;
    }

}
