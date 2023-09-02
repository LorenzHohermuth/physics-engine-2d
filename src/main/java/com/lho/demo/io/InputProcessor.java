package com.lho.demo.io;

import java.util.HashMap;

public class InputProcessor {

    public static void processPressedKeys () {
        HashMap<Integer, Boolean> keyHash = InputHandler.getKeyDictionary();

        for ( KeyMapping keyAction :KeyMapping.values()) {
            int keyNumber = keyAction.getKey();
            if (keyHash.get(keyNumber)) {
                keyAction.runCommand();
            }
        }
    }

}
