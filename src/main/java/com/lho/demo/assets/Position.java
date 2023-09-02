package com.lho.demo.assets;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
        updatePosition(x, y);
    }

    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public void updatePosition(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
