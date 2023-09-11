package E5ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class E502ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            List <String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get (0);

            switch (command){
                case "Delete":
                    int numToDelete = Integer.parseInt(commandLine.get(1));
                    integerList.removeAll(Collections.singleton(numToDelete));
                    break;
                case "Insert":
                    int element = Integer.parseInt(commandLine.get(1));
                    int position = Integer.parseInt(commandLine.get(2));
                    integerList.add(position, element);
            }
            input = scanner.nextLine();
        }
        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
    }
}
