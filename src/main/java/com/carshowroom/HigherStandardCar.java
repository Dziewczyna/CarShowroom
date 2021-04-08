package com.carshowroom;

public class HigherStandardCar extends BasicCar{
    private boolean airConditioning;

    public HigherStandardCar(boolean steeringWheel, boolean glass, int wheels, boolean airConditioning) {
        super(steeringWheel, glass, wheels);
        this.airConditioning=airConditioning;
    }

    public boolean canRadioPlay(){
        return true;
    }
}
