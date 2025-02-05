package hexlet.code;
import  java.util.Random;
import  java.util.Scanner;

public class Even {
    public static void gamingEven() {

        Scanner scanner = new Scanner(System.in);
        String greetingMessage = "Welcome to the Brain Games!";
        Random random = new Random();


        System.out.println(greetingMessage);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        Cli.greeting(userName);
        System.out.println();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int countOfWinners = 0;
        final int attempts = 3;
        final int maxPossibleValue = 100;

        for (var i = 0; i < attempts; i++) {
            int randomNumber = random.nextInt(maxPossibleValue) + 1;
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");

            String isEvenAnswer = scanner.next();
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            if (isEvenAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countOfWinners++;
            } else {
                Engine.showFail(isEvenAnswer, correctAnswer);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (countOfWinners == attempts) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
