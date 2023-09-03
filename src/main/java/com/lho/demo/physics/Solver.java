package com.lho.demo.physics;

import com.lho.demo.assets.Position;
import com.lho.demo.elements.Ball;
import com.lho.demo.ui.FxLoader;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class Solver {

    static Position gravity = new Position(0, 1000);

    public static void updatePosition(double dt) {
        ObservableList<Node> elements = FxLoader.getController().getCanvas().getChildren();
        elements.forEach(item -> {
            if (item instanceof Ball) {
                ((Ball) item).updatePosition(dt);
            }
        });
    }
    public static void applyGravity() {
        ObservableList<Node> elements = FxLoader.getController().getCanvas().getChildren();
        elements.forEach(item -> {
            if (item instanceof Ball) {
                ((Ball) item).accelerate(gravity);
            }
        });
    }

    public static void applyConstraint() {

    }
}
