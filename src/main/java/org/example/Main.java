package org.example;

import org.example.controller.GuessNumberGameController;
import org.example.model.GuessNumberGameModel;
import org.example.view.GuessNumberGameView;

public class Main {
    public static void main(String[] args) {
        GuessNumberGameModel model = new GuessNumberGameModel();
        GuessNumberGameView view = new GuessNumberGameView();
        GuessNumberGameController controller = new GuessNumberGameController(model, view);

        controller.startGame();
    }
}