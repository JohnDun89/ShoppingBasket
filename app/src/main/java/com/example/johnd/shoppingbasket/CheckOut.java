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
        this.tillFloat = 100.00;
    }

    public Double getTillFloat(){
        return this.tillFloat;

    }


}
