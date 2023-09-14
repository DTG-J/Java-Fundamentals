package FinalExamPrep;

import java.util.Scanner;

public class TheLimitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();

        StringBuilder modifiedMessage = new StringBuilder(encryptedMessage);
        String command = scanner.nextLine();
        String []commandParts = command.split("\\|");
        String finalCommand = commandParts [0];

        while (!command.equals("Decode")){

            if (command.contains("Move")){
                int nLetters = Integer.parseInt(commandParts[1]);
                String firstLetters = modifiedMessage.substring(0, nLetters);
                modifiedMessage.delete(0, nLetters);
                modifiedMessage.append(firstLetters);

            }else if (finalCommand.contains("Insert")){
                int index = Integer.parseInt(commandParts [1]);
                String textToInsert = commandParts [2];
                modifiedMessage.insert(index, textToInsert);

            }else if (finalCommand.contains("ChangeAll")){
                String toReplace = commandParts [1];
                String replacement = commandParts [2];
                String currentMessage = modifiedMessage.toString();
                currentMessage = currentMessage.replace(toReplace, replacement);
                modifiedMessage = new StringBuilder(currentMessage);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + modifiedMessage);
    }
}
