import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Ends always with a question mark.
//"Sure.", bob.hey("Does this cryogenic chamber make me look fat?")
//"Sure.", bob.hey("You are, what, like 15?")
//"Sure.", bob.hey("4?")
//"Sure.", bob.hey("Wait! Hang on. Are you going to be OK?")
//
//Has only uppercase words.
//"Whoa, chill out!", bob.hey("WATCH OUT!")
//"Whoa, chill out!", bob.hey("WHAT THE HELL WERE YOU THINKING?")
//"Whoa, chill out!", bob.hey("1, 2, 3 GO!")
//"Whoa, chill out!", bob.hey("ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!")
//"Whoa, chill out!", bob.hey("\u00dcML\u00c4\u00dcTS!")
//"Whoa, chill out!", bob.hey("I HATE YOU")
//
//Contains no letters
//"Fine. Be that way!", bob.hey("")
//"Fine. Be that way!", bob.hey("    ")
//
//Everything else
//"Whatever.", bob.hey("\u00dcML\u00e4\u00dcTS!")
//"Whatever.", bob.hey("Ending with ? means a question.")
//"Whatever.", bob.hey("Tom-ay-to, tom-aaaah-to.")
//"Whatever.", bob.hey("1, 2, 3")
//"Whatever.", bob.hey("Let's go make out behind the gym!")
//"Whatever.", bob.hey("It's OK if you don't want to go to the DMV.")



public class Bob {

//    String pattern = ";(?<foo>\\d{6});(?<bar>\\d{6});";
//    Pattern regex = Pattern.compile(pattern);
//    Matcher matcher = regex.matcher(";123456;123456;");
//    boolean success = matcher.find();
//
//    String foo = success ? matcher.group("foo") : null;
//    String bar = success ? matcher.group("bar") : null;

    //    public final String pattern = "(?<normal>[\\p{Upper}[\\p{Lower}]+ ]+)";//|(?<yelling>[\\p{Upper}+ ]+)|(?<nothing> +)";
//    public final String pattern = "(?<normal>[\\p{Upper}\\p{Lower} ]+)";//|(?<yelling>[\\p{Upper}+ ]+)|(?<nothing> +)";

    public final String pattern = "(?<noLetters> ? *$)|(?<yelling>([\\p{Upper}+ ])+)";//|(?<yelling>[\\p{Upper}+ ]+)|(?<nothing> +)";

    public String hey(String input) {
        Matcher matcher = Pattern.compile(pattern).matcher(input);
        matcher.find();
//        if(input.substring(0, input.length()-2).equals(input.substring(0, input.length()-2).toUpperCase())) return "Whoa, chill out!";
//        if(input.equals(input.toUpperCase()) && input.endsWith("!")) return "Whoa, chill out!";
//        if(input.endsWith("?")) return "Sure.";
//        if(!input.matches("\\W+[.!?]$")) return "Fine. Be that way!";
        System.out.println("==========");
        System.out.println(MessageFormat.format("Group match: {0}, group count: {1}", matcher.group("yelling"), matcher.groupCount()));
        System.out.println(matcher.);
//        System.out.println(matcher.group("nothing"));
        System.out.println(matcher.group("noLetters"));
        System.out.println("==========");
        return "Whatever.";
    }

    public static void main(String[] args) {
//        new Bob().hey("Tom-ay-to, tom-aaaah-to.");
        new Bob().hey("WATCH OUT!");
        new Bob().hey("");
        new Bob().hey("    ");
//        new Bob().hey("Does this cryogenic chamber make me look fat?");
    }
}
