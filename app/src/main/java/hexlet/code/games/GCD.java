package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public final class GCD implements Game {
    public String[] generate() {
        Random random = new Random();
        final int smallestNumberMaxValue = 20;
        final int greatestNumberMaxValue = 300;

        int randomNumberOne = random.nextInt(smallestNumberMaxValue) + 1;
        int randomNumberTwo = random.nextInt(greatestNumberMaxValue) + 1;
        String question = randomNumberOne + " " + randomNumberTwo;
        int result = calculateGCD(randomNumberOne, randomNumberTwo);

        return new String[]{question, String.valueOf(result)};
    }

    static int calculateGCD(int randomNumberOne, int randomNumberTwo) {
        if (randomNumberTwo == 0) {
            return randomNumberOne;
        } else {
            return calculateGCD(randomNumberTwo, randomNumberOne % randomNumberTwo);
        }
    }

    public void getDescription() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void startPlay() {
        Engine.play(new GCD());
    }
}
