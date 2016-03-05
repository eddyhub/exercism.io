import java.util.HashMap;

public class DNA {
    final String dna;
    final HashMap<Character, Integer> nucMap;

    public DNA(String dna) {
        nucMap = new HashMap<>();
        nucMap.put('A', 0);
        nucMap.put('C', 0);
        nucMap.put('G', 0);
        nucMap.put('T', 0);

        this.dna = dna;
        dna.chars().forEach(i -> nucMap.merge((char)i, 0, (v1, v2) -> v1 + 1));
    }

    public int count(final char symbol) {
        if(!nucMap.containsKey(symbol)) {
            throw new IllegalArgumentException();
        }
        return nucMap.get(symbol);
    }

    public HashMap<Character, Integer> nucleotideCounts() {
        return nucMap;
    }
}