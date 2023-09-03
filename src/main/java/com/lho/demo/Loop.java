package com.lho.demo;

import com.lho.demo.io.InputHandler;
import com.lho.demo.io.InputProcessor;
import com.lho.demo.physics.Solver;
import javafx.animation.AnimationTimer;

public class Loop extends AnimationTimer {
    @Override
    public void handle(long l) {
        InputHandler.handleInput();
        InputProcessor.processPressedKeys();
        Solver.applyGravity();
        Solver.updatePosition(0.02);
    }
}
