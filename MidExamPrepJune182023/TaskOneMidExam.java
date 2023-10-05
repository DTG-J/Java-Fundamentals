package MidExamPrepJune182023;

import java.util.Scanner;

public class TaskOneMidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needForExperience = Double.parseDouble(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());
        boolean HeWon = false;
        int Battles = 0;
        double allEarnedXP = 0;
        for (int i = 1; i <= battles ; i++) {
            double finalExperience = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0){
                finalExperience += finalExperience * 15 / 100;
            } else if (i % 5 == 0){
                finalExperience -= finalExperience * 10 / 100;
            } else if (i % 15 == 0) {
                finalExperience += finalExperience * 5 / 100;
            }
            allEarnedXP += finalExperience;
            if (allEarnedXP >= needForExperience){
                HeWon = true;
                Battles = i;
                break;
            }
        }
        if (HeWon){
            System.out.printf("Player successfully collected his needed experience for %d battles.", Battles);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", needForExperience - allEarnedXP);
        }
    }
}
