package com.example.johnd.shoppingbasket;

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
}
