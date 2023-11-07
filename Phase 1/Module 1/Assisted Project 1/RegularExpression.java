package Phase1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("naresh");

        Matcher matcher = pattern.matcher("naresh is a distance athlete");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
