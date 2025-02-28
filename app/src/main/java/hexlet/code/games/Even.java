package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Game;

import  java.util.Random;

public final class Even implements Game {
    public String[] generate() {
        Random random = new Random();
        final int maxPossibleValue = 100;
        int question = random.nextInt(maxPossibleValue) + 1;
        String result = question % 2 == 0 ? "yes" : "no";

        return new String[]{String.valueOf(question), result};
    }

    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void startPlay() {
        Engine.play(new Even());
    }
}
