package hexlet.code.games;
import hexlet.code.Engine;
import  java.util.Random;

public final class Prime implements Game {
    private String question;
    private String answer;

    public void initialize() {
        Random random = new Random();
        final int randomNumberMaxValue = 30;
        int questionBuild = random.nextInt(randomNumberMaxValue) + 2;
        String result = "yes";

        for (var j = 2; j * j <= questionBuild; j++) {
            if (questionBuild % j == 0) {
                result = "no";
                break;
            }
        }

        question = String.valueOf(questionBuild);
        answer = result;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public static void startPlay() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.play(description, new Prime());
    }
}
