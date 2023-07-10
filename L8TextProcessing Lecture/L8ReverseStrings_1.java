package L8TextProcessing;

import java.util.Scanner;

public class L8ReverseStrings_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        String reversed = "";
        while (!input.equals("end")){
            String text = input;
            for (int i = input.length()-1; i >= 0 ; i--) {
                reversed += input.charAt(i);

                }
            System.out.printf("%n%s = %s", input, reversed);
            input = scanner.nextLine();
            reversed = "";

        }

    }
}
