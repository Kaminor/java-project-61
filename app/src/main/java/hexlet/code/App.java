package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void showChoice() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

    public static String chooseGame() {
        Scanner scanner = new Scanner(System.in);

        App.showChoice();
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        return choice;
    }

    public static void main(String[] args) {
        String choice = App.chooseGame();

        switch (choice) {
            case "1":
                Cli.greet();
                Engine.getUserName();
                break;
            case "2":
                Cli.greet();
                Even.startPlay();
                break;
            case "3":
                Cli.greet();
                Calc.startPlay();
                break;
            case "4":
                Cli.greet();
                GCD.startPlay();
                break;
            case "5":
                Cli.greet();
                Progression.startPlay();
                break;
            case "6":
                Cli.greet();
                Prime.startPlay();
                break;
            default:
                break;
        }
    }
}
