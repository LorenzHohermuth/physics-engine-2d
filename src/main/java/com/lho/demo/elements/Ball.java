package com.lho.demo.elements;

import com.lho.demo.ui.FxLoader;
import javafx.scene.shape.Circle;

public class Ball extends Circle {

    public Ball(double x, double y, double radius, String color) {
        super(x, y, radius);
        this.setStyle("-fx-fill:" + color);
        FxLoader.getController().getCanvas().getChildren().add(this);
    }
}
