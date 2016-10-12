/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonizoon
 */
public class CategoryTest {
    
    public CategoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setName method, of class Category.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "New Name";
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        instance.setName(n);
        assertEquals(n, instance.getName());
    }

    /**
     * Test of setAmount method, of class Category.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double a = 0.0;
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        instance.setAmount(a);
    }

    /**
     * Test of setCurrentAmount method, of class Category.
     */
    @Test
    public void testSetCurrentAmount() {
        System.out.println("setCurrentAmount");
        double CA = 0.0;
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        instance.setCurrentAmount(CA);
    }

    /**
     * Test of setBudgetName method, of class Category.
     */
    @Test
    public void testSetBudgetName() {
        System.out.println("setBudgetName");
        String BN = "";
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        instance.setBudgetName(BN);
    }

    /**
     * Test of setTransactions method, of class Category.
     */
    @Test
    public void testSetTransactions() {
        System.out.println("setTransactions");
        ArrayList<Transaction> t = null;
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        instance.setTransactions(t);
    }

    /**
     * Test of getName method, of class Category.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        String expResult = "Old";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class Category.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        double expResult = 1.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getCurrentAmount method, of class Category.
     */
    @Test
    public void testGetCurrentAmount() {
        System.out.println("getCurrentAmount");
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        double expResult = 1.0;
        double result = instance.getCurrentAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getBudgetName method, of class Category.
     */
    @Test
    public void testGetBudgetName() {
        System.out.println("getBudgetName");
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        String expResult = "Test";
        String result = instance.getBudgetName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTransactions method, of class Category.
     */
    @Test
    public void testGetTransactions() {
        System.out.println("getTransactions");
        Category instance = new Category("Old", 1.00, "Test", new ArrayList<Transaction>());
        ArrayList<Transaction> expResult = new ArrayList<Transaction>();
        ArrayList<Transaction> result = instance.getTransactions();
        assertEquals(expResult, result);
    }
    
}
