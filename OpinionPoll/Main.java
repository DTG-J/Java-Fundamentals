package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        List <OpinionPoll.Person>peopleList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String data = scanner.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);

            if (age > 30){
                OpinionPoll.Person person = new OpinionPoll.Person(name, age);
                peopleList.add(person);
                //System.out.println(name + " - " + age);
            }
        }
        for (OpinionPoll.Person person: peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
            
        }

    }
}
