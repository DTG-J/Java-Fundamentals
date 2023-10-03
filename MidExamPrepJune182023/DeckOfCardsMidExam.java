package MidExamPrepJune182023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCardsMidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfCards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {

        List<String> commandLine = Arrays.stream(scanner.nextLine().split(", ")).toList();

            String command = commandLine.get(0);
            String card = commandLine.get(1);
            switch (command) {

                case "Add":
                    if (listOfCards.contains(card)) {
                        System.out.println("Card is already in the deck");
                        continue;
                    } else {
                        listOfCards.add(card);
                        System.out.println("Card successfully added");
                        break;
                    }
                case "Remove":
                    if (listOfCards.contains(card)) {
                        listOfCards.remove(card);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int indexToRemove = Integer.parseInt(commandLine.get(1));;
                    if (indexToRemove > listOfCards.size() - 1) {
                        System.out.println("Index out of range");
                        continue;
                    } else {
                        listOfCards.remove(indexToRemove);
                        System.out.println("Card successfully removed");
                    }
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(commandLine.get(1));
                    String nameToInsert = commandLine.get(2);
                    if (indexToInsert > listOfCards.size() - 1 || indexToInsert < 0) {
                        System.out.println("Index out of range");
                        continue;
                    } else if (listOfCards.contains(nameToInsert)) {

                        System.out.println("Card is already added");
                    } else {

                        listOfCards.add(indexToInsert, nameToInsert);
                        System.out.println("Card successfully added");
                    }
            }

        }
        System.out.println(String.join(", ", listOfCards));
    }
}
    