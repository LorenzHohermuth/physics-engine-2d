package com.lho.demo.assets;

import com.lho.demo.Loop;

public class BufferTimer {

    private final double duration;
    private double counter;
    public BufferTimer(double duration) {
        this.duration = duration;
    }

    public void addTime() {
        counter += Loop.deltaTime();
    }

    public boolean checkCounter() {
        boolean isOk = counter >= duration;
        if (isOk) counter = 0;
        return isOk;
    }

}
