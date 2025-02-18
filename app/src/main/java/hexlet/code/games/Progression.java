package hexlet.code.games;
import hexlet.code.Engine;
import  java.util.Random;

public final class Progression implements Game {
    public String[] generate() {
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
        String question = "";

        for (int num : progression) {
            if (num == result) {
                question += ".. ";
            } else {
                question += num + " ";
            }
        }

        return new String[]{question, String.valueOf(result)};
    }

    public static void startPlay() {
        String description = "What number is missing in the progression?";
        Engine.play(description, new Progression());
    }
}
