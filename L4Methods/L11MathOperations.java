package L4Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double finalCalculation = calculation(a, operator, b);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(finalCalculation));
    }
    public static double calculation (int firstNum, String operator, int secondNum){
        double result = 0;
        switch (operator){
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "+":
                result = firstNum + secondNum;

        }
        return result;
    }
}
