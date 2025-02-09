package hexlet.code;

public class Engine {

    public static void showFail(String userAnswer, String correctAnswer) {

        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'");
    }

    public static void showFail(String userAnswer, int correctAnswer) {

        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'");
    }
}
