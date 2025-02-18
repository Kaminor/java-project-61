package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String chooseGame() {
        Scanner scanner = new Scanner(System.in);

        App.showChoice();
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        return choice;
    }

    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");

        String userName = scanner.next();
        System.out.print("Hello, " + userName + "!");
    }

    public static void greetUser(String userName) {
        System.out.print("Hello, " + userName + "!");
    }
}
