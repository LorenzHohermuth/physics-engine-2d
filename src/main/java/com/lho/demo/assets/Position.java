package com.lho.demo.assets;

import java.util.function.BinaryOperator;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Position() {
        this.x = 0;
        this.y = 0;
    }


    public Position minus(Position  pos) {
        return performCalculationPositions((x, y) -> x - y, this, pos);
    }

    public Position plus(Position  pos) {
        return performCalculationPositions(Double::sum, this, pos);
    }
    public Position multiply(double multiplier) {
        return performCalculation((x,y) -> x * y, this, multiplier);
    }

    private Position performCalculationPositions(BinaryOperator<Double> operator, Position basePos, Position pos) {
        double calculatedX = operator.apply(basePos.getX(), pos.getX());
        double calculatedY = operator.apply(basePos.getY(), pos.getY());
        return new Position(calculatedX, calculatedY);
    }
    private Position performCalculation(BinaryOperator<Double> operator, Position basePos, double number) {
        double calculatedX = operator.apply(basePos.getX(), number);
        double calculatedY = operator.apply(basePos.getY(), number);
        return new Position(calculatedX, calculatedY);
    }

    public void resetZero() {
        x = 0;
        y = 0;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
