package E8TextProcessingExercise;

import java.util.Scanner;

public class E804CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (char symbol: input.toCharArray()) {
            int symbolFinal = symbol + 3;
            System.out.printf("%c", symbolFinal);
        }
    }
}
