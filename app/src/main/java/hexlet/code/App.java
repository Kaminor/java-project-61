package hexlet.code;
import hexlet.code.games.*;

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
        String greet = "1";
        String even = "2";
        String calc = "3";
        String gcd = "4";
        String progression = "5";
        String prime = "6";

        showChoice();
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);

        if (choice.equals(greet)) {
            System.out.println(greetingMessage);
            System.out.println("May I have your name? ");
            String userName = scanner.next();
            Cli.greeting(userName);
        }


        if (choice.equals(even)) {
            Even.startPlay();
        }

        if (choice.equals(calc)) {
            Calc.startPlay();
        }

        if (choice.equals(gcd)) {
            GCD.startPlay();
        }

        if (choice.equals((progression))) {
            Progression.startPlay();
        }

        if (choice.equals(prime)) {
            Prime.startPlay();
        }

        scanner.close();
    }
}
