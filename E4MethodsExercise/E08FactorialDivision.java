package E4MethodsExercise;

import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long factFirstNum = factoriaDivision(firstNumber);
        long factSecondNum = factoriaDivision(secondNumber);
        double resultFactDivision = factFirstNum * 1.0 / factSecondNum;
        System.out.printf("%.2f" ,resultFactDivision);


    }
    public static long factoriaDivision (int number){
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
