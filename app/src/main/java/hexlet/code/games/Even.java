package hexlet.code.games;
import hexlet.code.Engine;
import  java.util.Random;

public final class Even implements Game {
    private String question;
    private String answer;

    public void generate() {
        Random random = new Random();
        final int maxPossibleValue = 100;
        int questionBuild = random.nextInt(maxPossibleValue) + 1;
        String result = questionBuild % 2 == 0 ? "yes" : "no";

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
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.play(description, new Even());
    }
}
