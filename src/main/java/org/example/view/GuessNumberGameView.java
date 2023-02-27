package org.example.view;

public class GuessNumberGameView {

    private static final String WELCOME_MESSAGE = "WELCOME TO THE *GUESS NUMBER* GAME!!!";
    private static final String GAME_RULES_MESSAGE = "The aim of the game is to guess a number from customizable " +
            "range\n randomly generated by a computer. After each number guessing attempt you will be informed if your" +
            " number greater, less or equal to the actual generated number.\n If your number is equal to the actual " +
            "number than you have won.\n Try to use as few attempts as you can. Good luck!";

    private static final String NOT_INTEGER_INPUT_MESSAGE = "The input can't be parsed to integer(s).\n" +
            " Can you reenter the correct integer number input please?";

    private static final String START_GAME_OR_EXIT_MESSAGE = "Press 1 to start the new game. Press 0 to exit.";
    private static final String CUSTOMIZE_RANGE_MESSAGE = "Set upper and lower bounds of number to be guessed.";

    private static final String SET_LOWER_BOUND_MESSAGE = "Enter the lower bound of the number to guess please.";
    private static final String SET_UPPER_BOUND_MESSAGE = "Enter the upper bound of the number to guess please.";

    private static final String UPPER_AND_LOWER_BOUNDS_INCORRECT_MESSAGE = "Incorrect number bounds values. Upper bound " +
            "should be greater than the lower bound.\nTry to enter number bounds values again please.";

    private static final String NUMBER_GENERATED_MESSAGE = "The number has been generated by computer. Let's try to" +
            " guess it.";

    private static final String GUESS_NUMBER_MESSAGE = "Guess the number and enter it.";

    private static final String NUMBER_ISNT_IN_CORRECT_RANGE_MESSAGE = "The number is not inside correct range: from %s " +
            "to %s. Please try to enter the number again.";

    private static final String GUESSED_NUMBER_ALREADY_TRIED_MESSAGE = "You've already tried with number %s. Please try " +
            "another number.";

    private static final String YOUR_NUMBER_GREATER_MESSAGE = "GREATER THAN GENERATED NUMBER.";

    private static final String YOUR_NUMBER_LESS_MESSAGE = "LESS THAN GENERATED NUMBER.";

    private static final String YOUR_NUMBER_GUESSED_CORRECT_MESSAGE = "Congratulations! You've guessed the correct number!";

    private static final String TOTAL_ATTEMPTS_USED_MESSAGE = "You've used %s attempts.";

    private void showMessage(String message, String... args) {
        System.out.println(String.format(message, args));
    }

    public void showWelcomeMessage() {
        showMessage(WELCOME_MESSAGE);
    }

    public void showGameRulesMessage() {
        showMessage(GAME_RULES_MESSAGE);
    }

    public void showNotIntegerInputMessage() {
        showMessage(NOT_INTEGER_INPUT_MESSAGE);
    }

    public void showStartGameOrExitMessage() {
        showMessage(START_GAME_OR_EXIT_MESSAGE);
    }

    public void showCustomizeRangeMessage() {
        showMessage(CUSTOMIZE_RANGE_MESSAGE);
    }

    public void showSetLowerBoundMessage() {
        showMessage(SET_LOWER_BOUND_MESSAGE);
    }

    public void showSetUpperBoundMessage() {
        showMessage(SET_UPPER_BOUND_MESSAGE);
    }

    public void showNumberGeneratedMessage() {
        showMessage(NUMBER_GENERATED_MESSAGE);
    }

    public void showGuessNumberMessage() {
        showMessage(GUESS_NUMBER_MESSAGE);
    }

    public void showNumberIsntInCorrectRangeMessage(int lowerBound, int upperBound) {
        showMessage(NUMBER_ISNT_IN_CORRECT_RANGE_MESSAGE, String.valueOf(lowerBound), String.valueOf(upperBound));
    }

    public void showGuessedNumberAlreadyTriedMessage(int guessedNumber) {
        showMessage(GUESSED_NUMBER_ALREADY_TRIED_MESSAGE, String.valueOf(guessedNumber));
    }

    public void showYourNumberGreaterMessage() {
        showMessage(YOUR_NUMBER_GREATER_MESSAGE);
    }

    public void showYourNumberLessMessage() {
        showMessage(YOUR_NUMBER_LESS_MESSAGE);
    }

    public void showYourNumberGuessedCorrectMessage() {
        showMessage(YOUR_NUMBER_GUESSED_CORRECT_MESSAGE);
    }

    public void showTotalAttemptsUsedMessage(int totalAttemptsUsed) {
        showMessage(TOTAL_ATTEMPTS_USED_MESSAGE, String.valueOf(totalAttemptsUsed));
    }

    public void showUpperAndLowerBoundsIncorrectMessage() {
        showMessage(UPPER_AND_LOWER_BOUNDS_INCORRECT_MESSAGE);
    }
}