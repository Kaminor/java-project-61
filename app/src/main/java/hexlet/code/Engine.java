package hexlet.code;
import  java.util.Scanner;
import hexlet.code.games.Game;

public class Engine {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static boolean roundIteration(String question, String answer, String userName) {
        System.out.println("Question: " + question);
        String userAnswer = getUserAnswer();
        return check(answer, userAnswer, userName);
    }

    public static int getAttempts() {
        final int attempts = 3;
        return attempts;
    }

    public static String getUserAnswer() {
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static boolean check(String correctAnswer, String userAnswer, String userName) {
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            Engine.showFail(userAnswer, correctAnswer);
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void showFail(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'");
    }

    public static void countWins(int countOfWins, int attempts, String userName) {
        if (countOfWins == attempts) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void play(String description, Game game) {
        String userName = Engine.getUserName();
        System.out.println(description);

        int countOfWins = 0;

        for (var i = 0; i < getAttempts(); i++) {
            game.generate();
            String question = game.getQuestion();
            String answer = game.getAnswer();
            if (!roundIteration(question, answer, userName)) {
                break;
            } else {
                countOfWins++;
            }

            countWins(countOfWins, getAttempts(), userName);
        }
    }
}
