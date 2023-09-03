package com.lho.demo.io;

import com.lho.demo.assets.BufferTimer;

import java.util.HashMap;

public class InputProcessor {

    public static void processPressedKeys () {
        HashMap<Integer, Boolean> keyHash = InputHandler.getKeyDictionary();

        for ( KeyMapping keyAction :KeyMapping.values()) {
            int keyNumber = keyAction.getKey();
            BufferTimer bt = keyAction.getBuffer();
            bt.addTime();
            if (keyHash.get(keyNumber) && bt.checkCounter()) {
                keyAction.runCommand();
            }
        }
    }

}
