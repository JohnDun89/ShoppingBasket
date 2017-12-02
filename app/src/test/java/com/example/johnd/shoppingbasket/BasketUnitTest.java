package com.example.johnd.shoppingbasket;

import com.example.johnd.shoppingbasket.Item.Brakes;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by JohnD on 01/12/2017.
 */

public class BasketUnitTest {

    @Test
    public void canGetEmptyArray(){
        Basket basket = new Basket();
        assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void canAddItemTOBasket(){
        Basket basket = new Basket();
        Brakes brake = new Brakes();
        brake.setPrice(75);
        brake.setname("Avid juicy");
        basket.addItem(brake);
        assertEquals(1,basket.getBasket().size());
    }
}
