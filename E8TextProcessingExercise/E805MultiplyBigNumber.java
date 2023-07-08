package E8TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class E805MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput= scanner.nextLine();

        BigInteger firstNum = new BigInteger(firstInput);
        BigInteger secondNum = new BigInteger(secondInput);
        BigInteger finalNum = firstNum.multiply(secondNum);
        System.out.println(finalNum);
    }
}
