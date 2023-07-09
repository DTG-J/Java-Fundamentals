package E8TextProcessingExercise;


import java.util.Scanner;

public class E808LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] dataArr = input.split("\\s+");

        double totalSum = 0;
        for (String data: dataArr) {
        double modifiedNum = getModifiedNumber(data);
                totalSum += modifiedNum;
        }

        System.out.printf("%.2f", totalSum);


    }

    public static double getModifiedNumber (String data){
        char letterBefore = data.charAt(0);
        char letterAfter = data.charAt(data.length()-1);
        double number = Double.parseDouble(data.replace(letterBefore, ' ')
                            .replace(letterAfter, ' ')
                            .trim());
        if (Character.isUpperCase(letterBefore)){
            int positionUpperLetter = (int) letterBefore - 64;
                    number /= positionUpperLetter;
        } else  {
            int positionLowerLetter = (int)letterBefore -96;
            number *= positionLowerLetter;
            
        }
        if (Character.isUpperCase(letterAfter)){
            int positionUpperLetter = (int)letterAfter - 64;
            number -= positionUpperLetter;
        }else {
            int positionLowerLetter = (int) letterAfter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
