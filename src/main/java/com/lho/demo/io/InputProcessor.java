package com.lho.demo.io;

import com.lho.demo.Loop;

import java.util.HashMap;

public class InputProcessor {

    private static double msInSecond = 0;

    public static void processPressedKeys () {
        msInSecond = (msInSecond + Loop.deltaTime()) % 1000;
        System.out.println(msInSecond);
        HashMap<Integer, Boolean> keyHash = InputHandler.getKeyDictionary();

        for ( KeyMapping keyAction :KeyMapping.values()) {
            int keyNumber = keyAction.getKey();
            if (keyHash.get(keyNumber)) {
                keyAction.runCommand();
            }
        }
    }

}
