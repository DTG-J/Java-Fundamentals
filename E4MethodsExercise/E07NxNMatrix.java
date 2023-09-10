package E4MethodsExercise;

import java.util.Scanner;

public class E07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num ; j++) {
                System.out.print(num + " ");
            }

            System.out.println();

        }



    }
}
