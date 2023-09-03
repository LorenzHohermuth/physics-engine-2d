package com.lho.demo;

import com.lho.demo.io.InputHandler;
import com.lho.demo.io.InputProcessor;
import com.lho.demo.physics.Solver;
import javafx.animation.AnimationTimer;

public class Loop extends AnimationTimer {

    private static double deltaTimeMs;

    @Override
    public void handle(long l) {
        // to get form nano to milliseconds
        deltaTimeMs = (double) l / 1000 / 1000 / 1000 / 10000;
        InputHandler.handleInput();
        InputProcessor.processPressedKeys();
        Solver.applyGravity();
        Solver.updatePosition(deltaTimeMs / 1000);
    }

    public static double deltaTime() {
        return (double) deltaTimeMs;
    }
}
