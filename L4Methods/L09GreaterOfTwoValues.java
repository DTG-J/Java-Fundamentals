package L4Methods;

import java.util.Scanner;

public class L09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());

                System.out.println(greaterSymbol(firstNum, secondNum));
                break;
            case "char":
                char firstSymbol  = scanner.nextLine().charAt(0);
                char secondSymbol  = scanner.nextLine().charAt(0);

                System.out.println(greaterSymbol(firstSymbol, secondSymbol));
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(greaterSymbol(firstText, secondText));
        }



    }
    public static int greaterSymbol (int firstNum, int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }

    public static char greaterSymbol (char a, char b){
        if (a > b){
            return a;
        }
        return b;
    }

    public static String greaterSymbol (String ab, String cd){
        //if (ab.length() > cd.length()){
        if (ab.compareTo(cd)>0){
            return ab;
        }
        return cd;
    }
}
