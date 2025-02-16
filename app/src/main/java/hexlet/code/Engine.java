package hexlet.code;

public class Engine {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
    }

    public static void askQuestionPrimeOrEven(int number) {
        System.out.println("Question: " + number);
    }

    public static void askQuestionProgression(int[] progression, int hiddenValue) {
        System.out.print("Question: ");

        for (int num : progression) {
            if (num == hiddenValue) {
                System.out.print(".. ");
            } else {
                System.out.print(num + " ");
            }
        }
    }

    public static void askQuestionGCD(int numberOne, int numberTwo) {
        System.out.println("Question: " + numberOne + " " + numberTwo);
    }

    public static void askQuestionCalc(int numberOne, String operationSymbol, int numberTwo) {
        System.out.println("Question: " + numberOne + " " + operationSymbol + " " + numberTwo);
    }

    public static boolean check(String correctAnswer, String userAnswer, String userName) {
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            Engine.showFail(userAnswer, correctAnswer);
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static boolean check(int correctAnswer, String userAnswer, String userName) {
        return check(String.valueOf(correctAnswer), userAnswer, userName);
    }

    public static void showFail(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'");
    }

    public static void countWins(int countOfWins, int attempts, String userName) {
        if (countOfWins == attempts) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
