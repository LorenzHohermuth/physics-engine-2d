package com.lho.demo.io;

import com.lho.demo.interfaces.functional.Command;

import java.awt.event.KeyEvent;
import com.lho.demo.elements.Ball;

public enum KeyMapping {

    DevKey(KeyEvent.VK_ESCAPE, () -> new Ball(10, 10, 10, "red"));

    private final int keyNumber;
    private final Command command;

    KeyMapping(int keyNumber, Command command) {
        this.keyNumber = keyNumber;
        this.command = command;

        InputHandler.setNewKey(keyNumber);
    }

    public int getKey() {
        return keyNumber;
    }

    public void runCommand() {
        command.execute();
    }
}
