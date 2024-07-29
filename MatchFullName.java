import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchFullName {
    public static void main(String[] args) {

        /* Write a Java Program to match full names from a list of names and print them on the console.Write a Java Program to match full names from a list of names and print them on the console.
        A valid full name complies with the following:
       It consists of two words.
       Each word starts with a capital letter.
       After the first letter, it only contains lowercase letters afterward.
       Each of the two words should be at least two letters long.
        The two words are separated by a single space.
         */
        Scanner scan = new Scanner(System.in);
        //String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher = pattern.matcher(input); //шаблона да бъде приложен към входящите данни

        while(matcher.find()){
            System.out.print(matcher.group() + " ");

            /*
           List<String> names = new ArrayList<>();

           while(matcher.find()){
           names.add(matcher.group())
           }
             */
        }
    }
}
