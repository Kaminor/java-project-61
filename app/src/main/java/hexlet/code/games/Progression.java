package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Game;
import  java.util.Random;

public final class Progression implements Game {
    public String[] generate() {
        Random random = new Random();
        final int maxStartValue = 5;
        final int maxStepValue = 8;
        final int minStepValue = 3;
        final int progressionLength = 10;

        int start = random.nextInt(maxStartValue);
        int step = random.nextInt(maxStepValue) + minStepValue;
        int[] progression = new int[progressionLength];

        for (var j = 0; j < progression.length; j++) {
            progression[j] = start + j * step;
        }

        int hiddenIndex = random.nextInt(progressionLength - 1);
        int result = progression[hiddenIndex];
        String question = "";

        for (int num : progression) {
            question = String.format("%s%s", question, (num == result) ? ".. "
                    : String.format("%d ", num));
        }

        return new String[]{question, String.valueOf(result)};
    }

    public String getDescription() {
        return "What number is missing in the progression?";
    }

    public static void startPlay() {
        Engine.play(new Progression());
    }
}
