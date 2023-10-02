package RandomizWords01;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String [] stringArr = inputLine.split(" ");

        Random rnd = new Random();

        for (int i = 0; i < stringArr.length; i++) {
            int rndIndexX = rnd.nextInt(stringArr.length);
            int rndIndexY = rnd.nextInt(stringArr.length);
            String oldWord = stringArr[rndIndexX];
            stringArr [rndIndexX] = stringArr[rndIndexY];
            stringArr [rndIndexY] = oldWord;


        }
        System.out.println(String.join(System.lineSeparator(), stringArr));


        }
    }

