package E4MethodsExercise;

import java.util.Scanner;

public class E10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 8; i <=n; i++) {
            boolean isValidSumDigits = isCheckSumOfDigitDevisibleTO8( i);
            if (isValidSumDigits ) {
                boolean containsOddN = checkContainsoddDigit(i);
            if (containsOddN) {
                System.out.println(i);
        }

        }
        }
    }
    public static boolean isCheckSumOfDigitDevisibleTO8 (int num){
        int sumOfDigits = 0;
       while (num > 0){
           int lastNum = num % 10;
           sumOfDigits += lastNum;
           num = num / 10;
            
        }
       return (sumOfDigits % 8 == 0);
       /*if (sumOfDigits % 8 == 0){
           return true;
       }else {
           return false;
       }*/
    }
    public static boolean checkContainsoddDigit (int number) {
        while (number > 0) {

            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;

    }
}
