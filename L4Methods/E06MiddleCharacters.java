package E4MethodsExercise;

import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleCharacters(text);

    }public static  void printMiddleCharacters (String text){
        if (text.length() % 2 != 0){
            int indexOfMiddleSymbol = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleSymbol));

        }else {
        int indexMiddleFirstSymbol = text.length()/2 - 1;
        int indexMiddleSecondSymbol = text.length()/2;
            System.out.print(text.charAt(indexMiddleFirstSymbol));
            System.out.print(text.charAt(indexMiddleSecondSymbol));
        }
    }
}
