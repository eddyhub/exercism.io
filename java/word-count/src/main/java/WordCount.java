import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCount {

    public Map<String, Integer> phrase(String words) {
        return Pattern.compile("\\W+")
                .splitAsStream(words.toLowerCase())
                .collect(Collectors.toMap(i -> i, i -> 1, (j, k) -> j + 1));
    }
}
