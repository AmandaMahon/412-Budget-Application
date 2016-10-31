/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonizoon/lvw5264
 */
public class TransactionTest {
    
    public TransactionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setName method, of class Transaction.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "Burger";
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setName(n);
        assertEquals(n, instance.getName());
    }

    /**
     * Test of setAmount method, of class Transaction.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double a = 5;
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setAmount(a);
        assertEquals(a, instance.getAmount(), 0.0);
    }

    /**
     * Test of setTransactionType method, of class Transaction.
     */
    @Test
    public void testSetTransactionType() {
        System.out.println("setTransactionType");
        String tt = "Credit";
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setTransactionType(tt);
        assertEquals(tt, instance.getTransactionType());
    }

    /**
     * Test of setCategoryName method, of class Transaction.
     */
    @Test
    public void testSetCategoryName() {
        System.out.println("setCategoryName");
        String cn = "Food";
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setCategoryName(cn);
        assertEquals(cn, instance.getCategoryName());
    }

    /**
     * Test of setMonth method, of class Transaction.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int m = 3;
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setMonth(m);
        assertEquals(m, instance.getMonth());
    }

    /**
     * Test of setDay method, of class Transaction.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int d = 4;
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setDay(d);
        assertEquals(d, instance.getDay());
    }

    /**
     * Test of setYear method, of class Transaction.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int y = 2015;
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setYear(y);
        assertEquals(y, instance.getYear());
    }

    /**
     * Test of setPurchaseLocation method, of class Transaction.
     */
    @Test
    public void testSetPurchaseLocation() {
        System.out.println("setPurchaseLocation");
        String pl = "The Mix";
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setPurchaseLocation(pl);
        assertEquals(pl, instance.getPurchaseLocation());
    }

    /**
     * Test of setDescription method, of class Transaction.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String descr = "A burger with no tomato.";
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        instance.setDescription(descr);
        assertEquals(descr, instance.getDescription());
    }

    /**
     * Test of getName method, of class Transaction.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        String expResult = "Burger";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        double expResult = 5;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getTransactionType method, of class Transaction.
     */
    @Test
    public void testGetTransactionType() {
        System.out.println("getTransactionType");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        String expResult = "Credit";
        String result = instance.getTransactionType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategoryName method, of class Transaction.
     */
    @Test
    public void testGetCategoryName() {
        System.out.println("getCategoryName");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        String expResult = "Food";
        String result = instance.getCategoryName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class Transaction.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        int expResult = 3;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class Transaction.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        int expResult = 4;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class Transaction.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        int expResult = 2015;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPurchaseLocation method, of class Transaction.
     */
    @Test
    public void testGetPurchaseLocation() {
        System.out.println("getPurchaseLocation");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        String expResult = "The Mix";
        String result = instance.getPurchaseLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Transaction.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Transaction instance = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        String expResult = "A burger with no tomato.";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    
}
