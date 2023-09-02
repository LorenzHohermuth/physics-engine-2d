package com.lho.demo.io;

import com.lho.demo.ui.FxLoader;

import java.util.HashMap;

public class InputHandler {
    private static final HashMap<Integer, Boolean> keyHash = new HashMap<>();

    public static void handleInput() {
        FxLoader.getScene().setOnKeyPressed(keyEvent -> {
            int keyCode = keyEvent.getCode().getCode();
            if (keyHash.containsKey(keyCode)) {
                keyHash.put(keyCode, true);
            }
        });

        FxLoader.getScene().setOnKeyReleased(keyEvent -> {
            int keyCode = keyEvent.getCode().getCode();
            if (keyHash.containsKey(keyCode)) {
                keyHash.put(keyCode, false);
            }
        });
    }

    public static void setNewKey(int keyNumber) {
        keyHash.put(keyNumber, false);
    }

    public static HashMap<Integer, Boolean> getKeyDictionary() {
        return keyHash;
    }
}
