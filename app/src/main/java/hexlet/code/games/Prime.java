package hexlet.code.games;
import hexlet.code.Engine;
import  java.util.Random;

public final class Prime implements Game {
    public String[] generate() {
        Random random = new Random();
        final int randomNumberMaxValue = 30;
        int question = random.nextInt(randomNumberMaxValue) + 2;
        String result = "yes";

        for (var j = 2; j * j <= question; j++) {
            if (question % j == 0) {
                result = "no";
                break;
            }
        }


        return new String[]{String.valueOf(question), result};
    }

    public void getDescription() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void startPlay() {
        Engine.play(new Prime());
    }
}
