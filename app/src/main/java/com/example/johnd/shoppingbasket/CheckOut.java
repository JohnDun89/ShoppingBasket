package com.example.johnd.shoppingbasket;

import com.example.johnd.shoppingbasket.Item.Hubs;
import com.example.johnd.shoppingbasket.Item.StockItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by JohnD on 03/12/2017.
 */

public class CheckOut {

    private ArrayList basket;
    private Double tillFloat;

    public CheckOut(Basket basket) {
        this.tillFloat = 100.00;
        this.basket = basket.getBasket();
    }

    public Double getTillFloat() {
        return this.tillFloat;

    }

    public Double purchase(Boolean customerHasCard) {

        Double total = 0.00;
        ArrayList<Buyable> allItemsList = basket;

//        Double buyOneGetOneFreeDiscount = doesBasketContainBuyOneGetOneFreeItem(basket);
        for (Buyable item : allItemsList) {
            Double price = isBuyableUnderTwenty(item);
            total += price;

        }
//        total -= buyOneGetOneFreeDiscount;
        if (customerHasCard == true){
          Double loyaltyAmount = total *0.98;
          return loyaltyAmount;

        }
        else  return total;
    }


    public Double isBuyableUnderTwenty(Buyable item) {
        if (item.getPrice() == 20.00 || item.getPrice() <= 20.00)
            return item.getPrice();
        else return item.getPrice() * 0.9;
    }


    // following does not work, but this is my attempt thus far. I wanted to map the items that are buy one get one free,
    // then count if they appear twice, then get the items value and return that as a negative double to take of the total amount.
    public Double doesBasketContainBuyOneGetOneFreeItem() {
        ArrayList<Buyable> basket = this.basket;


        HashMap<Buyable, Integer> occurances = new HashMap<>();
        for (Buyable item : basket) {
            if (item.getIsBuyOneFree() == true) {
                occurances.put(item, +1);
            }

                if (occurances.containsValue(2)) {
                    Double reduction = item.getPrice();
                    Double finalAmount = -reduction;
                return finalAmount;
                }
            }

            return null;
        }

    }



