package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String locations = scanner.nextLine();

        String regex = "([=\\/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(locations);

        List <String> validDestinations = new ArrayList<>();

            while (matcher.find()){
            String destination = matcher.group("destination");
            validDestinations.add(destination);
           }
        System.out.println("Destinations: " + String.join(", ", validDestinations));

        int travelPoints = 0;
        for (String destination : validDestinations) {
            travelPoints += destination.length();
        }

        System.out.println("Travel Points: " + travelPoints);
    }
}
