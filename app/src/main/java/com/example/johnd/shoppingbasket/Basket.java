package com.example.johnd.shoppingbasket;

import com.example.johnd.shoppingbasket.Item.Brakes;

import java.util.ArrayList;

/**
 * Created by JohnD on 01/12/2017.
 */

public class Basket {

    public ArrayList<Buyable> current_items;

    public Basket(){
      this.current_items = new ArrayList<Buyable>();
    }

    public ArrayList getBasket(){
        return this.current_items;
    }

    public void addItem(Buyable buyable) {
        this.current_items.add(buyable);
    }

    public void removeItem(Buyable buyable) {
        this.current_items.remove(buyable);
    }

    public Double returnValueOfBasket(){
        Double total = 0.0;

    }
}
