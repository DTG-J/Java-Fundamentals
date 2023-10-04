package MidExamPrepJune182023;

import java.util.Scanner;

public class Task1MidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experience = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());

        double finalExperience = 0;
        int coutnBattles = 0;

        for (int i = 1; i <= countBattles; i++) {

             int currentExperience = Integer.parseInt(scanner.nextLine());
                if (i % 3 == 0) {
                    finalExperience += currentExperience * 1.15;
                } else if (i % 5 == 0) {
                    finalExperience += currentExperience * 0.9;
                } else if (i % 15 == 0) {
                    finalExperience += currentExperience * 1.05;
                } else {
                    finalExperience += currentExperience;
                }
                coutnBattles ++;
            }
        double diff = experience - finalExperience;
        if (experience <= finalExperience) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", coutnBattles);
        }else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", diff);
        }
     }
 }





