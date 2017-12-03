package com.example.johnd.shoppingbasket.Item;

import com.example.johnd.shoppingbasket.Buyable;

/**
 * Created by JohnD on 01/12/2017.
 */

public abstract class StockItem implements Buyable {

    private String name;
    private Double price;
    private Boolean getOneFree;

    public String getName(){
        return name;
    }

    public void setName(String input){
        name = input;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double input){
        price = input;
    }

    public void setBuyOneGetOneFree(Boolean state){
        getOneFree = state;
    }

    public Boolean getIsBuyOneFree(){
        return getOneFree;
    }

}
