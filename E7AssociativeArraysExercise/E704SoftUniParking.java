package E7AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E704SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> userCar = new LinkedHashMap<>();
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfCommands ; i++) {

            String data = scanner.nextLine();
            String command = data.split(" ")[0];
            String userName = data.split(" ")[1];


            if (command.equals("register")){
                String licencePlate = data.split(" ")[2];
                if (!userCar.containsKey(userName)) {
                    userCar.put(userName, licencePlate);
                    System.out.printf("%s registered %s successfully%n", userName, licencePlate);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licencePlate);
                }

            }else if (command.equals("unregister")){
                if (userCar.containsKey(userName)){
                    userCar.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                }else {
                    System.out.printf("ERROR: user %s not found%n", userName);
                }
            }
        }

        userCar.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
