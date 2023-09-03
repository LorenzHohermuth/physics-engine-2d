package com.lho.demo.io;

import java.util.HashMap;

public class InputProcessor {

    private static double msInSecond = 0;

    public static void processPressedKeys () {
        msInSecond = (msInSecond + (double) 1000 / 60) % 1000;
        HashMap<Integer, Boolean> keyHash = InputHandler.getKeyDictionary();

        for ( KeyMapping keyAction :KeyMapping.values()) {
            int keyNumber = keyAction.getKey();
            if (keyHash.get(keyNumber)) {
                keyAction.runCommand();
            }
        }
    }

}
