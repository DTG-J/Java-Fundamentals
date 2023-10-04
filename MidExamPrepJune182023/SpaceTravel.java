package MidExamPrepJune182023;

import java.util.Scanner;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] travelToTitan = scanner.nextLine().split("||");
        String command = travelToTitan [0];
        int commandValue = Integer.parseInt(travelToTitan [1]);

        int startFuel = Integer.parseInt(scanner.nextLine());
        int startAmmunition = Integer.parseInt(scanner.nextLine());

        int enemyAmunition = 1;

        switch (command){
            case "Travel":
                if (commandValue <= startFuel){
                    System.out.printf("The spaceship travelled %d light-years.%n", commandValue);
                }else {
                    System.out.printf("Mission failed.%n");
                }
                break;
            case "Enemy":
                if (commandValue <= startAmmunition){
                    enemyAmunition += commandValue;
                    System.out.printf("An enemy with %d armour is defeated.%n", commandValue);
                }else if (commandValue <= startFuel/2){
                    System.out.printf("An enemy with %d armour is outmaneuvered.%n",commandValue * 2 );
                }else {
                    System.out.printf("Mission failed.%n");
                }break;
            case "Repair":
                int fuel = commandValue + startFuel;
                int ammunition = enemyAmunition * 2 + startAmmunition;
                System.out.printf("Ammunitions added: %d.%n", ammunition);
                System.out.printf("Fuel added: %d.%n", fuel);
                break;
            case "Titan":
                System.out.println("You have reached Titan, all passengers are safe.");
                break;



        }




    }
}
