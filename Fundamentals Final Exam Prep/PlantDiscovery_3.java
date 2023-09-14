package FinalExamPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map <String, Integer> plantRarityMap = new HashMap<>();
        Map <String, Double> rateMap = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String plantDetails = scanner.nextLine();
            String plant = plantDetails.split("<->") [0];
            int plantRarity = Integer.parseInt(plantDetails.split("<->") [1]);

            plantRarityMap.put(plant, plantRarity);
            rateMap. put(plant, 0.0);
           }
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Exhibition")){
            String [] tokens = inputLine.split("[: -]+");
            String command = tokens [0];
            String plant = tokens [1];
            boolean isValidCommand = command.equals("Rate") || command.equals("Update") || command.equals("Reset");
            if ( !plantRarityMap.containsKey(plant) || !isValidCommand){
                System.out.println("error");
            }else{
                switch (command){
                    case "Rate":

                }
            }
        }
    }
}
