package E4MethodsExercise;

import java.util.Scanner;

public class E05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractTwoDigits(number1, number2, number3));



    }
    public static int sumTwoDigits (int n1, int n2){
        return n1 + n2;
    }
    public static int subtractTwoDigits (int num1, int num2,  int num3){
        return sumTwoDigits( num1 , num2 ) - num3;
    }
}
