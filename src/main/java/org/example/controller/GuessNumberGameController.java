package org.example.controller;

import org.example.model.GuessNumberGameModel;
import org.example.model.GuessNumberResult;
import org.example.view.GuessNumberGameView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberGameController {

    private static final int START_GAME_CHOICE = 1;
    private static final int EXIT_CHOICE = 0;

    private GuessNumberGameModel model;
    private GuessNumberGameView view;

    private Scanner scanner;

    public GuessNumberGameController(GuessNumberGameModel model, GuessNumberGameView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public GuessNumberGameController() {
    }

    public void startGame() {
        int lowerBound;
        int upperBound;
        int curGuessedNumber;
        GuessNumberResult curGuessedNumberResult;
        view.showWelcomeMessage();
        view.showGameRulesMessage();
        while (true) {
            view.showStartGameOrExitMessage();
            try {
                if (scanner.nextInt() == START_GAME_CHOICE) {
                    view.showCustomizeRangeMessage();
                    while (true) {
                        view.showSetLowerBoundMessage();
                        lowerBound = scanner.nextInt();
                        view.showSetUpperBoundMessage();
                        upperBound = scanner.nextInt();
                        if (model.areNumberBoundsCorrect(lowerBound, upperBound)) {
                            break;
                        } else {
                            view.showUpperAndLowerBoundsIncorrectMessage();
                        }
                    }

                    model.setLowerBound(lowerBound);
                    model.setUpperBound(upperBound);
                    model.initGame();
                    model.generateNumberToGuess();

                    view.showNumberGeneratedMessage();

                    while (true) {
                        view.showGuessNumberMessage();
                        curGuessedNumber = scanner.nextInt();
                        if (!model.isGuessedNumberInsideCorrectRange(curGuessedNumber)) {
                            view.showNumberIsntInCorrectRangeMessage(lowerBound, upperBound);
                        } else if (model.isGuessedNumberAlreadyTried(curGuessedNumber)) {
                            view.showGuessedNumberAlreadyTriedMessage(curGuessedNumber);
                        } else {
                            curGuessedNumberResult = model.guessNumber(curGuessedNumber);
                            switch (curGuessedNumberResult) {
                                case GREATER_THAN:
                                    view.showYourNumberGreaterMessage();
                                    break;
                                case LESS_THAN:
                                    view.showYourNumberLessMessage();
                                    break;
                                case EQUAL:
                                    view.showYourNumberGuessedCorrectMessage();
                                    break;
                            }
                            if (curGuessedNumberResult.equals(GuessNumberResult.EQUAL)) {
                                view.showTotalAttemptsUsedMessage(model.getTotalAttemptsUsed());
                                break;
                            }
                        }
                    }
                } else if (scanner.nextInt() == EXIT_CHOICE) {
                    break;
                } else {
                    view.showNotIntegerInputMessage();
                }
            } catch (InputMismatchException e) {
                view.showNotIntegerInputMessage();
            }
        }
    }

}
