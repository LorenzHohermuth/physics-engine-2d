package com.lho.demo.io;

import com.lho.demo.assets.BufferTimer;
import com.lho.demo.interfaces.functional.Command;

import java.awt.event.KeyEvent;
import com.lho.demo.elements.Ball;
import com.lho.demo.ui.FxLoader;

public enum KeyMapping {

    DevKey(KeyEvent.VK_ESCAPE, () -> System.exit(0), 0),
    TestKey(KeyEvent.VK_Q, () -> System.out.println("Key pressed"), 500),
    SpawnBall(KeyEvent.VK_E, () -> new Ball(FxLoader.getScene().getWidth() / 2,
            FxLoader.getScene().getHeight() / 2, 10,"red"), 200);

    private final int keyNumber;
    private final Command command;
    private BufferTimer buffer;

    KeyMapping(int keyNumber, Command command, double timeBetweenProcessingMs) {
        this.keyNumber = keyNumber;
        this.command = command;
        buffer = new BufferTimer(timeBetweenProcessingMs);

        InputHandler.setNewKey(keyNumber);
    }

    public int getKey() {
        return keyNumber;
    }

    public BufferTimer getBuffer() {
        return buffer;
    }

    public void runCommand() {
        command.execute();
    }
}
