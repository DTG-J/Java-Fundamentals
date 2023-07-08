package E8TextProcessingExercise;

import java.util.Scanner;

public class E803ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String [] inputArr = input.split("\\\\");
        //String fileData = inputArr[3];
        String fileName = inputArr[inputArr.length -1].split("\\.")[0];
        String fileExtension = inputArr [inputArr.length -1].split("\\.")[1];

        System.out.printf("%nFile name: %s", fileName);
        System.out.printf("%nFile extension: %s", fileExtension);


    }
}
