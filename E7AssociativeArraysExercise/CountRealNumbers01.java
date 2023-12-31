package E7AssociativeArraysExercise;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numsArr = Arrays.stream(scanner.nextLine().split(" ")). mapToDouble(Double::parseDouble).toArray();
        TreeMap <Double, Integer> counts = new TreeMap<>();
        for (double num: numsArr) {
            if (!counts.containsKey(numsArr)){
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num)+1);
            
        }
        for (Map.Entry<Double, Integer>entry : counts.entrySet())
             {
                 System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
             }
        }



    }

