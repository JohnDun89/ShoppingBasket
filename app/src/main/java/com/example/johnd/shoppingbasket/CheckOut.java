package com.example.johnd.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by JohnD on 03/12/2017.
 */

public class CheckOut {

    private ArrayList<Buyable> basket;
    private Double tillFloat;

    public CheckOut(ArrayList<Buyable> basket){
        this.basket = new ArrayList<Buyable>();
        this.tillFloat = 0.0;
    }

    public Double getTillFloat(){
        return this.tillFloat;

    }

    public void setTillFloat(Double amount){
        this.tillFloat = amount;
    }
}
