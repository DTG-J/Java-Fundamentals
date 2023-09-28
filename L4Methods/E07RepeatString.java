package L4Methods;

import java.util.Scanner;

public class E07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String finalRepeatedText = stringRepeatText(text, n);
        System.out.println(finalRepeatedText);




    }
    public static String stringRepeatText (String textToRepeat, int n){
       String resultText = "";
        for (int i = 0; i < n; i++) {
            resultText += textToRepeat;
            }
        return resultText;
    }
}
