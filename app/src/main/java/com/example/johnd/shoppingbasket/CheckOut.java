package com.example.johnd.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by JohnD on 03/12/2017.
 */

public class CheckOut {

    private ArrayList basket;
    private Double tillFloat;

    public CheckOut(Basket basket){
        this.tillFloat = 100.00;
        this.basket = basket.getBasket();
    }

    public Double getTillFloat(){
        return this.tillFloat;

    }

    public Double purchase() {
        ArrayList<Buyable> allItemsList = basket;
        for (Buyable item : allItemsList) {
         Double price = isBuyableUnderTwenty(item);
            return price;
        }
     return null;
    }


    public Double isBuyableUnderTwenty(Buyable item){
      if (item.getPrice() == 20.00 || item.getPrice() <= 20.00)
          return item.getPrice();
      else return item.getPrice() * 0.9;


    }


}
