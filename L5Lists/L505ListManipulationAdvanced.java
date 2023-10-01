package L5Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L505ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){

            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            switch (command){
                case "Contains":
                    int isNumberInContains = Integer.parseInt(commandLine.get(1));
                    if (numbersList.contains(isNumberInContains)){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    String secondCommand = commandLine.get(1);
                    if (secondCommand.equals("even")){
                        List<Integer> evenNumList = getEvenNumbers(numbersList);
                        System.out.println(evenNumList.toString().replaceAll("[\\[\\],]" , ""));
                    }else {
                        List <Integer> oddNumList = getOddNumbers(numbersList);
                        System.out.println(oddNumList.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;

                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbersList.size(); i++) {
                        sum += numbersList.get(i);
                        }
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = commandLine.get(1);
                    int numberToFilter = Integer.parseInt(commandLine.get(2));
                    List <Integer> conditionalNumList = getConditionNumbers(numbersList, condition, numberToFilter);
                    System.out.println(conditionalNumList.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }

            input = scanner.nextLine();
        }
    }

    public static List <Integer> getEvenNumbers (List <Integer> initList) {
        List <Integer> evenNumbersList = new ArrayList<>();
        for (int i = 0; i < initList.size() ; i++) {
            int currentItem = initList.get(i);

            if (currentItem % 2 == 0) {
                evenNumbersList.add(currentItem);

            }
        }
        return evenNumbersList;
    }
        public static List <Integer> getOddNumbers (List <Integer> initList) {
        List <Integer> oddNumbersList = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentItem = initList.get(i);

            if (currentItem %2 != 0) {
                oddNumbersList.add(currentItem);
            }
        }
        return oddNumbersList;
    }

    public static List <Integer> getConditionNumbers (List <Integer> initList, String condition, int numberToFilter){
        List <Integer> resultList = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentNum = initList.get(i);

            if (condition.equals("<")){
                if (currentNum < numberToFilter){
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">")) {
                if (currentNum > numberToFilter){
                    resultList.add(currentNum);
                }
            }else if (condition.equals(">=")) {
                if (currentNum >= numberToFilter) {
                    resultList.add(currentNum);
                }
            }else if (condition.equals("<=")) {
                if (currentNum <= numberToFilter) {
                    resultList.add(currentNum);
                }
            }
        }
        return resultList;
    }
}
