package com.example.johnd.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by JohnD on 03/12/2017.
 */

public class Customer {

    private Double cash;
    private ArrayList<Buyable> purchasedGoods;
    private Boolean LoyaltyCard;

    public Customer(){
        this.LoyaltyCard = false;
    }

    public void setdoesChustomerhaveLoyaltyCard(Boolean status){
        this.LoyaltyCard = status;
    }

    public boolean getdoesChustomerhaveLoyaltyCard(){
        return this.LoyaltyCard;
    }
}


