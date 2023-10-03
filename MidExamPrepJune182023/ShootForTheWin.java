package MidExamPrepJune182023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();


        int countShotTargets = 0;
        while (!command.equals("End")){
            int shotIndex = Integer.parseInt(command);

                if (shotIndex >= 0 && shotIndex <= numbers.size()-1){
                    int shotTarget = numbers.get(shotIndex);

                    for (int i = 0; i <= numbers.size()-1; i++) {
                        int currentTarget = numbers.get(i);

                        if (i != shotIndex && currentTarget != -1){
                            if (currentTarget > shotTarget){
                                currentTarget -= shotTarget;
                                }else {
                                currentTarget += shotTarget;
                            }
                            i = currentTarget;
                        }
                        numbers.set(shotIndex, -1);
                        countShotTargets ++;
                    }
                }
            command = scanner.nextLine();
        }

        System.out.print("Shot targets: " + countShotTargets + "->");
        for (int target: numbers) {
            System.out.print(target + " ");
        }
   }
}
