package L4Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseNum = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = numOnPower(baseNum, power);

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(result));

    }
    public static double numOnPower (double baseNumber, double numPower){

        double resultNumber = 1;
        for (int i = 0; i < numPower; i++) {
            resultNumber *= baseNumber;
            }
        return resultNumber;
    }
}
