package MidExamPrepJune182023;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3MidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfCards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();
            List<String> commandLine = Arrays.stream(input.split(", ")).collect(Collectors.toList());
            String command = commandLine.get(0);


            switch (command) {
                case "Add":
                    String add = commandLine.get(1);
                    if (listOfCards.contains(add)){
                        System.out.println("Card is already in the deck");
                        continue;
                    }
                    listOfCards.add(add);
                    System.out.println("Card successfully added");
                    break;

                case "Insert":
                    String nameToInsert = commandLine.get(2);
                    int indexToInsert = Integer.parseInt(commandLine.get(1));
                    if (indexToInsert <0 || indexToInsert > listOfCards.size()){
                        System.out.println("Index out of range");
                    }
                    listOfCards.add(indexToInsert, nameToInsert);
                    System.out.println("Card successfully added");

                    break;

                case "Remove":
                    String nameToRemove = commandLine.get(1);
                    if (!listOfCards.contains(nameToRemove)){
                        System.out.println("Card not found");
                        break;
                    }
                    listOfCards.remove(nameToRemove);
                    System.out.println("Card successfully removed");
                    break;

                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandLine.get(1));
                    if (indexToRemove >= 0 && indexToRemove <= listOfCards.size()){

                        listOfCards.remove(indexToRemove);
                        System.out.println("Card successfully removed");
                        break;

                    }else {
                        System.out.println("Index out of range");
                        break;
                    }


            }
        }
        System.out.println(String.join(", ", listOfCards));

        }
    }
