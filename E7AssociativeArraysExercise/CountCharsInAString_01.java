package E7AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine().replaceAll(" ", "");
        Map<Character, Integer> symbolCount = new LinkedHashMap<>();

        for (char symbol: input. toCharArray()) {
            if (symbol == ' '){
                continue;
            }
            if (symbolCount.containsKey(symbol)){
                int currentCount = symbolCount.get(symbol);
                symbolCount.put(symbol, currentCount + 1);

            }else {
                symbolCount.put(symbol, 1);
            }

        }
        //for (Map.Entry<Character, Integer> entry : symbolCount.entrySet()) {
           // System.out.println(entry.getKey() + " -> " + entry.getValue());
        //}
        symbolCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
