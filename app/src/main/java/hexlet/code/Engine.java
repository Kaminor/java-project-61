package hexlet.code;

public class Engine {

    public static void showChoice() {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("0 - Exit");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
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