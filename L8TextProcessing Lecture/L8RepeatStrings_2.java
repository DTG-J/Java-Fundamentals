package L8TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class L8RepeatStrings_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputText = scanner.nextLine().split(" ");

        StringBuilder resultText = new StringBuilder();
        for (String word : inputText) {
            int count = word.length ();
            for (int i = 0; i < count; i++) {
                resultText .append(word);
            }
        }
        System.out.println(resultText);
    }
}
