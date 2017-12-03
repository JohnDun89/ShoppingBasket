package com.example.johnd.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JohnD on 03/12/2017.
 */
public class CustomerTest {


    @Test
    public void getdoesChustomerhaveLoyaltyCard() throws Exception {
        Customer customer = new Customer();
        customer.setdoesChustomerhaveLoyaltyCard(Boolean.TRUE);
        assertTrue(customer.getdoesChustomerhaveLoyaltyCard());
    }

}