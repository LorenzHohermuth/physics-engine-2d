package com.lho.demo;

import com.lho.demo.assets.Position;
import com.lho.demo.io.InputHandler;
import com.lho.demo.ui.FxLoader;
import javafx.scene.shape.Circle;

public class App {

    static Loop loop = new Loop();
    public static void main(String[] args) {
        FxLoader.launchFx();
    }

    public static void start() {
        loop.start();
    }
}
