package E4MethodsExercise;

import java.util.Scanner;

public class E9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")){
            if (isPalindrom(command)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        command = scanner.nextLine();
        }
    }
       public static boolean isPalindrom (String text){
        String reversedText =  "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return text.equals(reversedText);
    }
}
