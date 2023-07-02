package E7AssociativeArraysExercise;

import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E7Orders03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        String input = scanner.nextLine();


              while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input. split(" ")[1]);
            int quantity = Integer.parseInt(input. split(" ")[2]);

            if (!productPrice.containsKey(product)){
                productQuantity.put(product, quantity);
            }else {
                int currentQuantity = productQuantity.get(product);
                productQuantity.put(product, currentQuantity + quantity);
            }

            productPrice.put(product, price);
           input = scanner.nextLine();
        }
        for (Map.Entry < String, Integer> entry : productQuantity.entrySet()){
            String productName = entry.getKey();
            double finalSum = productQuantity.get(productName) * productPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }

    }
}
