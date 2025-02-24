package hexlet.code.games;
import hexlet.code.Engine;
import  java.util.Random;

public final class Progression implements Game {
    private String question;
    private String answer;

    public void initialize() {
        Random random = new Random();
        final int maxStartValue = 5;
        final int maxStepValue = 8;
        final int minStepValue = 3;
        final int progressionLength = 10;
        final int hiddenIndexValue = 9;

        int start = random.nextInt(maxStartValue);
        int step = random.nextInt(maxStepValue) + minStepValue;
        int[] progression = new int[progressionLength];

        for (var j = 0; j < progression.length; j++) {
            progression[j] = start + j * step;
        }

        int hiddenIndex = random.nextInt(hiddenIndexValue);
        int result = progression[hiddenIndex];
        String questionBuild = "";

        for (int num : progression) {
            if (num == result) {
                questionBuild += ".. ";
            } else {
                questionBuild += num + " ";
            }
        }

        question = questionBuild;
        answer = String.valueOf(result);
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public static void startPlay() {
        String description = "What number is missing in the progression?";
        Engine.play(description, new Progression());
    }
}
