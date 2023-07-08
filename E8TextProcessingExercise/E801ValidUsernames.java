package E8TextProcessingExercise;

import java.util.Scanner;

public class E801ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] userNames = input.split(", ");
        for (String username: userNames) {
            if  (isValidUserName(username)){
                System.out.println(username);
            }


        }




    }
    public static boolean isValidUserName (String username) {
        if (username.length()<3 || username.length()>16){
            return false;
        }
        for (char symbol: username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }
}
//В тази задача се прилага логика за това, че конкретния търсен елемент липсва, а не че е наличен!!!