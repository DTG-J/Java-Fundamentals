package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData. split(", ")[1];
        String author = articleData. split(", ")[2];

        Articles articles = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(": ")[0];
            String commandParameters = command.split(": ")[1];

            switch (commandName){
                case "Edit":
                    articles.edit(commandParameters);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(commandParameters);
                    break;
                case "Rename":
                    articles.rename(commandParameters);
                    break;
            }
        }
        System.out.println(articles.getTitle()+ " - " + articles.getContent() + ": " + articles.getAuthor());

//better title - better content: better author

    }
}
