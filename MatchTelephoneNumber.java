import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchTelephoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex  = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(input);
        List<String> matchedPhones = new LinkedList<>();

        while(phoneMatcher.find()){
            matchedPhones.add(phoneMatcher.group());

        }
        System.out.println(String.join(", ",matchedPhones));

    }

}
