import java.util.Arrays;

class TwelveDays {
    static final String base = "On the %s day of Christmas my true love gave to me%s\n";
    static final String[][] verses = {
            {"first", ", a Partridge in a Pear Tree."},
            {"second", ", two Turtle Doves"},
            {"third", ", three French Hens"},
            {"fourth", ", four Calling Birds"},
            {"fifth", ", five Gold Rings"},
            {"sixth", ", six Geese-a-Laying"},
            {"seventh", ", seven Swans-a-Swimming"},
            {"eighth", ", eight Maids-a-Milking"},
            {"ninth", ", nine Ladies Dancing"},
            {"tenth", ", ten Lords-a-Leaping"},
            {"eleventh", ", eleven Pipers Piping"},
            {"twelfth", ", twelve Drummers Drumming"},
    };
    static final String[] song = new String[verses.length];

    static {
        String postfix = "";
        for(int i = 0; i < verses.length; i++) {
            if(i != 0) {
                postfix = verses[i][1] + postfix;
            } else {
                postfix = verses[i][1];
            }
            song[i] = String.format(base, verses[i][0], postfix);
            if(i == 0) {
                postfix = postfix.replace(", ", ", and ");
            }
        }
    }

    String verse(int verseNumber) {
        return song[verseNumber - 1];
    }

    String verses(int startVerse, int endVerse) {
        String[] x = Arrays.copyOfRange(song, startVerse - 1, endVerse);
        return String.join("\n", x);
    }

    String sing() {
        return verses(1, 12);
    }
}
