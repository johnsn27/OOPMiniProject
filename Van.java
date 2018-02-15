package com.company;

public class Van extends Vehicle
{
    private double carryweight;
    Van(double givenHorsepower, double givenAerodynamics, double givenWeight, double givenCarryweight){
        super(givenHorsepower, givenAerodynamics, givenWeight);
        carryweight = givenCarryweight;

    }

    public double acceleration()
    {
        double acceleration = (100/horsepower)*(aerodynamics/2)*weight/100;
        return acceleration;
    }
    public double getCarryweight()
    {
        return carryweight;
    }
}