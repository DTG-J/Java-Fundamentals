package FundamentalsFinalExam;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String easterEggs = scanner.nextLine();

        String regex = "[@#]+(?<colour>[a-z]{3,})[@#]+[^a-zA-Z0-9]*[\\/]+(?<amount>[0-9]+)[\\/]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(easterEggs);

        while (matcher.find()){
            String colour = matcher.group("colour");
            String amount = matcher.group("amount");

            System.out.printf("You found %s %s eggs!%n", amount, colour);

        }


    }
}
