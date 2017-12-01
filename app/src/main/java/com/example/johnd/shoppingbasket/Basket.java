package com.example.johnd.shoppingbasket;

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
}
