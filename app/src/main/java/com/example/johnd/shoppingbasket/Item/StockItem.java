package com.example.johnd.shoppingbasket.Item;

import com.example.johnd.shoppingbasket.Buyable;

/**
 * Created by JohnD on 01/12/2017.
 */

public abstract class StockItem implements Buyable {

    private String name;
    private Integer price;

    public String getName(){
        return name;
    }

    public void setname(String input){
        name = input;
    }

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer input){
        price = input;
    }
}
