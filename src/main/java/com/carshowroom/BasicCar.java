package com.carshowroom;

public class BasicCar {
    private boolean steeringWheel;
    private boolean glass;
    private int wheels;

    public BasicCar(boolean steeringWheel, boolean glass, int wheels) {
        this.steeringWheel = steeringWheel;
        this.glass = glass;
        this.wheels = wheels;
    }

    public boolean canRun(){
        return true;
    }
}
