package E4MethodsExercise;

import java.util.Scanner;

public class E03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);





    }public static void printCharactersInRange (char a, char b){
        if ( a <  b){
            for (int symbol = (char) (a+1); symbol < b; symbol++) {
                System.out.print(symbol + " ");
            }
                }else{
                for (int symbol = (char)(b+1); symbol < a; symbol++){
                
            }
        }
        
    }
}

