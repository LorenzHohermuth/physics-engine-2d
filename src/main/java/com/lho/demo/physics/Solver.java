package com.lho.demo.physics;

import com.lho.demo.Settings;
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
        Position position = Settings.POSITION_CONSTRAINT_OBJ;
        double radius = Settings.RADIUS_CONSTRAINT_OBJ;

        ObservableList<Node> elements = FxLoader.getController().getCanvas().getChildren();
        elements.forEach(item -> {
            if (item instanceof Ball) {
                Ball ball = (Ball) item;
                Position to_item = ball.getPosition().minus(position);
                double  distance = to_item.lengthForOrigin();
                // 10 is the hardcoded default
                if (distance > radius - Settings.DEFAULT_BALL_RADIUS) {
                    Position n = to_item.divide(distance);
                    ball.setPosition(position.plus(n.multiply(distance - Settings.DEFAULT_BALL_RADIUS)));
                }
            }
        });
    }
}
