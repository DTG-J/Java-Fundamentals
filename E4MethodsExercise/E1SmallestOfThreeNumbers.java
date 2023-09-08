package E4MethodsExercise;

import java.util.Scanner;

public class E1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        smallestOfThreeNumbers(a, b, c);



    }

    public static void smallestOfThreeNumbers (int firstNum, int secondNum, int thirdNum){
        if (firstNum <= secondNum && firstNum <thirdNum){
            System.out.println(firstNum);
        }else if (secondNum <= firstNum && secondNum < thirdNum){
            System.out.println(secondNum);
        }else {
            System.out.println(thirdNum);
        }

    }
}
