package E5ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E501Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            List <String> commandLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            switch (command) {
                case "Add":
                    int passengersToAdd = Integer.parseInt(commandLine.get(1));
                    for (int i = 0; i < wagons.size(); i++) {
                        if (passengersToAdd + wagons.get (i) < maxCapacity) {
                            wagons.add(passengersToAdd);
                        } else {
                            wagons.add(i + 1, passengersToAdd);
                        }
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println(wagons);
    }
}
