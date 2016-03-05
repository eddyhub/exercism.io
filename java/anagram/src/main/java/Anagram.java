import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    final String anagram;

    public Anagram(String anagram) {
        this.anagram = anagram.toLowerCase();
    }

    public List<String> match(List<String> stringList) {
        return stringList.stream()
                .filter(i -> anagram.length() == i.length())
                .filter(i -> !anagram.equalsIgnoreCase(i))
                .filter(i -> anagram.chars().sum() == i.toLowerCase().chars().sum())
                .collect(Collectors.<String>toList());
    }
}
