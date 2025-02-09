package hexlet.code;

public class Engine {

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
    }

    public static void showFail(String userAnswer, String correctAnswer) {

        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'");
    }

    public static void showFail(String userAnswer, int correctAnswer) {

        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'");
    }
}
