package L4Methods;

import java.util.Arrays;
import java.util.Scanner;

public class L10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = Math.abs(Integer.parseInt(scanner.nextLine()));

        int finalResult = multiplyOddsByEvens(numberInput);
        System.out.println(Math.abs(finalResult));

    }

    public static int getEvenSum (int startNum){
        String intToString = Integer.toString(startNum);
        int [] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;

        for (int n : arr) {
            if (n % 2 == 0) {
                evenSum += n;
            }
        }
        return evenSum;
    }

    public static int getOddSum (int startNumber){
        String intToString = Integer.toString(startNumber);
        int [] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int oddSum = 0;

        for (int n : arr) {
            if (n % 2 != 0) {
                oddSum += n;
            }
        }
        return oddSum;
    }

    public static int multiplyOddsByEvens (int num){
       return getEvenSum(num) * getOddSum(num);
    }
}
