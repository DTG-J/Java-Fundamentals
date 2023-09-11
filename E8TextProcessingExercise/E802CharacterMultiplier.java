package E8TextProcessingExercise;

import java.util.Scanner;

public class E802CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String string1 = input.split(" ") [0];
        String string2 = input.split(" ")[1];

        int symbol = 0;
        int symbolSt2 = 0;
        int sum = 0;

        while (string1.equals(string2)) {
            for (char symbolString1 : string1.toCharArray()) {
                symbol = symbolString1;
            }
            for (char symbolString2 : string2.toCharArray()) {
                symbolSt2 = symbolString2;
            }
            int symbolMultiply = symbol*symbolSt2;
            sum += symbolMultiply;
        }
        System.out.println(sum);


    }
}
