package FundamentalsFinalExam;

import java.util.*;

public class WildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Animal> animalsFood = new LinkedHashMap<>();
        Map<String, List<String>> areasWithAnimal = new LinkedHashMap<>();

        while (!input.equals("EndDay")) {

            String[] commandParts = input.split(": ");
            String[] animalDetails = commandParts[1].split("-");

            String command = commandParts [0];


            switch (command) {

                case "Add":

                    String name = animalDetails[0];
                    String area = animalDetails[2];

                    if (animalsFood.containsKey(name)) {
                        int extraFood = Integer.parseInt(animalDetails[1]);
                        animalsFood.get(name).setNeededFood(extraFood + animalsFood.get(name).getNeededFood());

                        if (areasWithAnimal.containsKey(area) && !((areasWithAnimal.get(area).contains(name)))) {
                            areasWithAnimal.get(area).add(name);

                        } else if (!areasWithAnimal.containsKey(area)) {
                            areasWithAnimal.putIfAbsent(area, areasWithAnimal.get(area));
                            areasWithAnimal.get(area).add(name);
                        }

                    } else {
                        animalsFood.putIfAbsent(name, new Animal(Integer.parseInt(animalDetails[1]), animalDetails[2]));
                        areasWithAnimal.putIfAbsent(area, new ArrayList<>());
                        areasWithAnimal.get(animalDetails[2]).add(name);
                    }

                    break;
                case "Feed":
                    name = animalDetails[0];

                    if (animalsFood.containsKey(name)) {

                        int eatenFood = Integer.parseInt(animalDetails[1]);
                        animalsFood.get(name).setNeededFood(animalsFood.get(name).getNeededFood() - eatenFood);

                        if (animalsFood.get(name).getNeededFood() <= 0) {

                            area = animalsFood.get(name).getArea();
                            animalsFood.remove(name);
                            if (animalsFood.containsKey(name)) {

                                if (areasWithAnimal.get(area).contains(name)) {

                                    areasWithAnimal.get(area).remove(name);
                                    if (areasWithAnimal.get(name).size() == 0) {

                                        areasWithAnimal.remove(area);
                                    }
                                }

                            } else {
                                areasWithAnimal.get(area).remove(name);

                                if (areasWithAnimal.get(area).isEmpty()) {
                                    areasWithAnimal.remove(area);
                                }
                            }
                            System.out.println(name + " was successfully fed");
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Animals:");

        printingAMap(animalsFood);
        System.out.println("Areas with hungry animals:");
        printingAStringMap(areasWithAnimal);
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
