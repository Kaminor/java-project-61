package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public final class GCD implements Game {
    private String question;
    private String answer;

    public void initialize() {
        Random random = new Random();
        final int smallestNumberMaxValue = 20;
        final int greatestNumberMaxValue = 300;

        int randomNumberOne = random.nextInt(smallestNumberMaxValue) + 1;
        int randomNumberTwo = random.nextInt(greatestNumberMaxValue) + 1;
        String questionBuild = randomNumberOne + " " + randomNumberTwo;
        int result = calculateGCD(randomNumberOne, randomNumberTwo);

        question = questionBuild;
        answer = String.valueOf(result);
    }

    static int calculateGCD(int randomNumberOne, int randomNumberTwo) {
        if (randomNumberTwo == 0) {
            return randomNumberOne;
        } else {
            return calculateGCD(randomNumberTwo, randomNumberOne % randomNumberTwo);
        }
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public static void startPlay() {
        String description = "Find the greatest common divisor of given numbers.";
        Engine.play(description, new GCD());
    }
}
