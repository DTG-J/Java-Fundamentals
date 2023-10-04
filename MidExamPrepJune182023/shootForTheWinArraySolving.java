package MidExamPrepJune182023;

import java.util.Arrays;
import java.util.Scanner;

public class shootForTheWinArraySolving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] targets = Arrays.stream (scanner.nextLine()
                .split(" ")). mapToInt(e->Integer.parseInt(e))
                .toArray();

        String input = scanner.nextLine();
        int coutShotTargets = 0;
        while (!input.equals("End")){
            int shotIndex = Integer.parseInt(input);
            if (shotIndex >=0 && shotIndex <=targets.length-1 ){
                int shotTarget = targets [shotIndex];
                for (int i = 0; i <= targets.length-1; i++) {
                    int currentTarget = targets [i];
                    if (i != shotIndex && currentTarget != -1){
                        if (currentTarget > shotTarget){
                            currentTarget -= shotTarget;
                        }else {
                            currentTarget += shotTarget;
                        }
                        targets [i] = currentTarget;
                    }
                }
                targets [shotIndex] = -1;
                coutShotTargets ++;
            }
            input = scanner.nextLine();
        }
        System.out.print("Shot targets: " + coutShotTargets + " -> ");
        for (int target: targets) {
            System.out.print(target + " ");
        }
    }
}
