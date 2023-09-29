package L5Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L502GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List <Integer> numbersList = Arrays.stream(input.split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        int listSize = numbersList.size();
        for (int i = 0; i < listSize / 2; i++) {
            int firstNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size()-1);
            int sum = firstNum + lastNum;

            numbersList.set(i, sum);
            numbersList.remove(numbersList.size()-1);
        }

        for (int items : numbersList){
            System.out.print(items + " ");
        }
    }
}
