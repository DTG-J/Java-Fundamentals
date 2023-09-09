package E4MethodsExercise;

import java.util.Scanner;

public class E02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        printCountVowels(text);



    }public static void printCountVowels (String text){
        int countVowels = 0;
        for (char symbol : text.toCharArray ()){
            if (symbol == 'a' || symbol == 'e'|| symbol == 'i' || symbol=='o' || symbol == 'u'){
                countVowels++;

            }
        }
        System.out.println(countVowels);
    }
}
