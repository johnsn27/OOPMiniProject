package com.company;
public class DividendStock extends Stock
{
    private double topspeed;
    DividendStock(double givenHorsepower, double givenAerodynamics, double givenWeight, double givenTopspeed){
        super(givenHorsepower, givenAerodynamics, givenWeight);
        topspeed = givenTopspeed;
    }
    public double getTopspeed()
    {
        return topspeed;
    }
}