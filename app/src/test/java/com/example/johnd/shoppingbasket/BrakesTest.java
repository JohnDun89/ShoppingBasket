package com.example.johnd.shoppingbasket;

import com.example.johnd.shoppingbasket.Item.Brakes;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by JohnD on 01/12/2017.
 */

public class BrakesTest {

    Brakes brake;

    @Before
    public void setUo(){
        brake = new Brakes();
    }

    @Test
    public void canSetBrakeName(){
        brake.setName("Shimano XT front");
        assertEquals(brake.getName(),"Shimano XT front");
    }

    @Test
    public void canSetPrice(){
        brake.setPrice(75.00);
        assertEquals(brake.getPrice(),75,0.01);
    }
}
