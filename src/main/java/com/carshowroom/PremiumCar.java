package com.carshowroom;

public class PremiumCar extends HigherStandardCar{
    public PremiumCar(boolean steeringWheel, boolean glass, int wheels, boolean airConditioning) {
        super(steeringWheel, glass, wheels, airConditioning);
    }

    public boolean canPark(){
        return true;
    }
}
