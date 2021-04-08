package com.carshowroom;

public class Runner {
  public static void main(String[] args) {
    BasicCar basicCar = new BasicCar(true,true,4);
    basicCar.canRun();

    HigherStandardCar higherStandardCar = new HigherStandardCar(true,true,4,true);
    higherStandardCar.canRun();
    higherStandardCar.canRadioPlay();

    PremiumCar premiumCar = new PremiumCar(true,true,4,true);
    premiumCar.canRun();
    premiumCar.canRadioPlay();
    premiumCar.canPark();
  }
}
