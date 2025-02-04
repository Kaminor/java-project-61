package hexlet.code;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
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

        Engine.showChoice();
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);

        if (choice.equals(greet)) {
            System.out.println(greetingMessage);
            System.out.println("May I have your name? ");
            String userName = scanner.next();
            Cli.greeting(userName);
        }


        if (choice.equals(even)) {
            Even.gamingEven();
        }

        if (choice.equals(calc)) {
            Calc.count();
        }

        if (choice.equals(gcd)) {
            GCD.findGCD();
        }

        if (choice.equals((progression))) {
            Progression.getProgression();
        }

        if (choice.equals(prime)) {
            Prime.getPrime();
        }

        scanner.close();
    }
}
