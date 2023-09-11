package E5ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E503HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List <String> guests = new ArrayList<>();
            String name = "";
        for (int i = 1; i <= numberOfCommands; i++) {

            String command = scanner.nextLine();
            name = command.split(" ")[0];

            if (command.contains("not")) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!", name);
                }
            }else{
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!", name);
                }else {
                    guests.add(name);
                }
            }

        }
        System.out.println();
        for (String guestName: guests) {
            System.out.println(guestName);
            }

    }
}
