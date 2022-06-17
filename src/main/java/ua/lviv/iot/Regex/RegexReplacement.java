package ua.lviv.iot.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexReplacement {

    public String replaceHyphens() {

        String regex = ".*[a-zA-Z]+-[a-zA-Z]+.*[a-zA-Z]+-[a-zA-Z]+.*";
        String string = "First sentence!\n"
                + "Second sentence with one-hyphen.\n"
                + "Third sentence with-two hyphen-s !\n"
                + "Another sentence with-one hyphen!\n"
                + "Many many-many many many-many many many-many many hyphens!\n"
                + "Third sentence with-two hyphen-s!\n";

        final String subst = "";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            System.out.println("-----------------------------------------");


            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }

        final String result = matcher.replaceAll(subst);

        System.out.println("Substitution result: " + result);

        return result;

    }


}