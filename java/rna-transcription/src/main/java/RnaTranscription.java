import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        return Arrays.asList(dnaStrand.split("")).stream().map(this::transcribeNucleotide).collect(Collectors.joining());
    }

    public String transcribeNucleotide(String nucleotide) {
        switch (nucleotide) {
            case "G":
                return "C";
            case "C":
                return "G";
            case "T":
                return "A";
            case "A":
                return "U";
        }
        return "";
    }
}