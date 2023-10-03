package MidExamPrepJune182023;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] neighbourhood = Arrays.stream(scanner.nextLine()
                .split("@")).mapToInt(Integer::parseInt).toArray();

        int currentIndex = 0;
        String input = scanner.nextLine();
        while (!input.equals("Love")){
           int jumpLength = Integer.parseInt(input.split(" ")[1]);

           currentIndex += jumpLength;
           if (currentIndex >= neighbourhood.length-1){
               currentIndex = 0;
           }
           if (neighbourhood[currentIndex] != 0){
               neighbourhood [currentIndex] -= 2;
               if (neighbourhood [currentIndex] == 0){
                   System.out.printf("Place %d has Valentine's day.%n", currentIndex);
               }
           }else {
               System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
           }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);




    }
}
