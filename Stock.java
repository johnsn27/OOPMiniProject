
package com.company;

public class Stock
{
    protected double buyprice;
    protected double sellprice;
    protected double weight;

    Stock(String name, double givenBuyprice, double givenSellprice){
        buyprice=givenBuyprice;
        sellprice=givenSellprice;
    }
    public double acceleration()
    {

        double acceleration = (100/buyprice)*sellprice*weight/100;
        return acceleration;

    }
    public double getBuyprice()
    {

        return buyprice;

    }
    public double getsellprice()
    {

        return sellprice;

    }
    public double getWeight()
    {

        return weight;

    }
}