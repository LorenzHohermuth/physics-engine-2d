package com.lho.demo.elements;

import com.lho.demo.ui.FxLoader;
import javafx.scene.shape.Circle;

import com.lho.demo.assets.Position;

public class Ball extends Circle {

    private Position position_current;
    private Position position_old;
    private Position acceleration = new Position(0,0);


    public Ball(double x, double y, double radius, String color) {
        super(x, y, radius);
        position_current = new Position(x, y);
        position_old = new Position(x, y);
        this.setStyle("-fx-fill:" + color);
        FxLoader.getController().getCanvas().getChildren().add(this);
    }

    public void updatePosition(double dt) {
        Position velocity = position_current.minus(position_old);
        position_old = position_current;
        position_current = position_current.plus(velocity).plus(acceleration.multiply(dt * dt));
        acceleration.resetZero();
        setCenterX(position_current.getX());
        setCenterY(position_current.getY());
    }

    public void accelerate(Position acc) {
        acceleration = acceleration.plus(acc);
    }
}
