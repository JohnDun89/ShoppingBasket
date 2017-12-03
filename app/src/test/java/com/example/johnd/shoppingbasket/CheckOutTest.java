package com.example.johnd.shoppingbasket;

import com.example.johnd.shoppingbasket.Item.Brakes;
import com.example.johnd.shoppingbasket.Item.InnerTube;
import com.example.johnd.shoppingbasket.Item.Tyre;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JohnD on 03/12/2017.
 */
public class CheckOutTest {

    Basket largePurchase;

    @Before
    public void setUp(){
        Basket largePurchase = new Basket();

        Tyre maxis = new Tyre();
        maxis.setPrice(40.00);

        Tyre schwalbe = new Tyre();
        schwalbe.setPrice(35.00);

        Brakes shimanoSaintFront = new Brakes();
        shimanoSaintFront.setPrice(130.00);

        largePurchase.addItem(schwalbe);
        largePurchase.addItem(maxis);
        largePurchase.addItem(shimanoSaintFront);



    }
    @Test
    public void getTillFloat() throws Exception {
        Basket basket = new Basket();
        Tyre tyre = new Tyre();
        basket.addItem(tyre);
        CheckOut checkOut = new CheckOut(basket);
        assertEquals(100,checkOut.getTillFloat(),0.01);

    }

    @Test
    public void discountIsAppliedOnItemOverTwentyPounds(){
        Basket basket = new Basket();
        InnerTube tube = new InnerTube();
        tube.setPrice(5.00);
        basket.addItem(tube);
        CheckOut smallTransaction = new CheckOut(basket);
        assertEquals(5.00, smallTransaction.purchase(),0.01);

    }


}