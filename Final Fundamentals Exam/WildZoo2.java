package FundamentalsFinalExam;

import java.util.*;

public class WildZoo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        Map<String, Animal> animalFood = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> areas = new LinkedHashMap<>();

        while (!input.equals("EndDay")) {
            String[] commandParts = input.split(": ");
            String command = commandParts[0];
            String[] animalDetails = commandParts[1].split("-");

            switch (command) {
                case "Add":
                    String animalName = animalDetails[0];
                    String area = animalDetails[2];
                    if (animalFood.containsKey(animalName)) {
                        int extraFood = Integer.parseInt(animalDetails[1]);
                        animalFood.get(animalName).setNeededFood(extraFood + animalFood.get(animalName).getNeededFood());
                        if (areas.containsKey(area) && !((areas.get(area).contains(animalName)))) {
                            areas.get(area).add(animalName);
                        } else if (!areas.containsKey(area)) {
                            areas.putIfAbsent(area, areas.get(area));
                            areas.get(area).add(animalName);
                        }


                    } else {
                        animalFood.putIfAbsent(animalName, new Animal(Integer.parseInt(animalDetails[1]), animalDetails[2]));
                        areas.putIfAbsent(area, new ArrayList<>());
                        areas.get(animalDetails[2]).add(animalName);
                    }
                    break;


                case "Feed":
                    animalName = animalDetails[0];
                    if (animalFood.containsKey(animalName)) {
                        int reducedFood = Integer.parseInt(animalDetails[1]);
                        animalFood.get(animalName).setNeededFood(animalFood.get(animalName).getNeededFood() - reducedFood);
                        if (animalFood.get(animalName).getNeededFood() <= 0) {
                            area = animalFood.get(animalName).getArea();


                            if (animalFood.containsKey(animalName)) {
                                if (areas.get(area).contains(animalName)) {
                                    areas.get(area).remove(animalName);
                                    if (areas.get(animalName).size() == 0) {
                                        areas.remove(area);
                                    }
                                }

                            } else {
                                areas.get(area).remove(animalName);
                                if (areas.get(area).isEmpty()) {
                                    areas.remove(area);
                                }
                            }

                            System.out.println(animalName + " was successfully fed");
                        }
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Animals:");

        printingAMap(animalFood);
        System.out.println("Areas with hungry animals:");
        printingAStringMap(areas);
    }

    static class Animal {
        int neededFood;
        String area;

        public Animal(int neededFood, String area) {
            this.neededFood = neededFood;
            this.area = area;

        }

        public int getNeededFood() {

            return neededFood;
        }

        public void setNeededFood(int neededFood) {

            this.neededFood = neededFood;
        }

        public String getArea() {
            return area;
        }

    }

    static void printingAMap(Map<String, Animal> animals) {
        for (Map.Entry<String, Animal> entry : animals.entrySet()) {
            System.out.println(" " + entry.getKey() + " -> " + entry.getValue().getNeededFood() + "g");


        }

    }

    static void printingAStringMap(Map<String, List<String>> area) {
        for (Map.Entry<String, List<String>> entry : area.entrySet()) {

            System.out.println(" " + entry.getKey() + ": " + entry.getValue().size());


        }

    }
}
