package com.company;

public class miniproject
{
    public static void main(String[] args){
        int numberOfStocks = 3;
        Stock[] stock = new Stock[numberOfStocks];
        stock[0] = new Stock("Apple",200, 0.5);
        stock[1]  = new Stock("IBM",100, 0.5);
        stock[2]  = new Stock("Samsung",135, 0.5);
        for(int i = 0; i<3;i++)
        {
            int j = i+1;
            System.out.println("car " + j + ": " + stock[i].acceleration());
        }
        int numberOfVans = 1;
        Van[] van = new Van[numberOfVans];
        van[0] = new Van(100, 0.9,3500,160.4);
        System.out.println("Van:   " + van[0].acceleration());

    }
}
