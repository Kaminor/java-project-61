package hexlet.code;
import  java.util.Scanner;

public class Engine {
    public static boolean runIteration(String question, String answer, String userName) {
        System.out.println("Question: " + question);
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();
        if (userAnswer.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                    + "'" + answer + "'");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static int getAttempts() {
        final int attempts = 3;
        return attempts;
    }

    public static void play(Game game) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getDescription());
        int countOfWins = 0;

        for (var i = 0; i < getAttempts(); i++) {
            var data = game.generate();
            var question = data[0];
            var answer = data[1];

            if (!runIteration(question, answer, userName)) {
                break;
            } else {
                countOfWins++;
            }

            if (countOfWins == getAttempts()) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
