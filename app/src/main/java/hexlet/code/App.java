package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        String greetingMessage = "Welcome to the Brain Games!";

        showChoice();
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case "1":
                System.out.println(greetingMessage);
                System.out.println("May I have your name? ");
                String userName = scanner.next();
                System.out.print("Hello, " + userName + "!");
                break;
            case "2":
                Even.startPlay();
                break;
            case "3":
                Calc.startPlay();
                break;
            case "4":
                GCD.startPlay();
                break;
            case "5":
                Progression.startPlay();
                break;
            case "6":
                Prime.startPlay();
                break;
            default:
                break;
        }

        scanner.close();
    }
}
