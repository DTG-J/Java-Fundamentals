package FinalExamPrep;

import java.util.Scanner;

public class ActivationKeys_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String input = scanner.nextLine();

        String [] commandArr = input.split(">>>");
        String command = commandArr [0];

        while (!input.equals("Generate")){



            switch (command){
                case "Contains":
                    String substring = commandArr [1];
                    if (activationKey.contains(substring)){
                        System.out.printf("%s contains %s.", activationKey, substring);
                    }else {
                        System.out.print("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = commandArr [1];
                    int startIndex = Integer.parseInt(commandArr [2]);
                    int endIndex = Integer.parseInt(commandArr [3]);
                    substring = activationKey.substring(startIndex, endIndex);
                    if (upperOrLower.equals("Upper")){
                        activationKey = activationKey.replace(substring, substring.toUpperCase());
                        }else {
                        activationKey = activationKey.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int startIndexSl = Integer.parseInt(commandArr [1]);
                    int endIndexSl = Integer.parseInt(commandArr [2]);
                    substring = activationKey.substring(startIndexSl, endIndexSl);
                    activationKey = activationKey.replace(substring, "");
                    System.out.println(activationKey);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
