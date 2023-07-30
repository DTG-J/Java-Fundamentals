package FundamentalsFinalExam;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String commandData = scanner.nextLine();


        while (!commandData.equals("End")){
            String [] commandParts = commandData.split("\\s+");
            String command = commandParts [0];

            switch (command){
                case "Translate":
                    String toReplace = commandParts [1];
                    String replacement = commandParts [2];
                    input = input.replaceAll(toReplace, replacement);
                    System.out.println(input);
                    break;

                case "Includes":
                    String substring = commandParts [1];
                    if (input.contains(substring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;

                case "Start":
                    String substring1 = commandParts [1];
                    if (input.startsWith(substring1)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;

                case"Lowercase":
                    input = input.toLowerCase();
                    System.out.println(input);
                    break;

                case"FindIndex":
                    String symbol = commandParts [1];
                    int index1=input.lastIndexOf(symbol);
                    System.out.println(index1);
                    break;

                case"Remove":
                    int startIndex = Integer.parseInt(commandParts [1]);
                    int toRemove = Integer.parseInt(commandParts [2]);
                    String subString = input.substring(startIndex, toRemove);
                    input = input.replaceAll(subString, "");
                    System.out.println(input);

                    break;

            }

            commandData = scanner.nextLine();
        }
    }
}
