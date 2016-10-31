/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aim5627, lvw5264
 */
public class BudgetTest {
    
    public BudgetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Budget.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "Amanda";
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);
        
        instance.setName(n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Budget.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double a = 1000.0;
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);
        
        instance.setAmount(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIntervalPeriod method, of class Budget.
     */
    @Test
    public void testSetIntervalPeriod() {
        System.out.println("setIntervalPeriod");
        int IP = 14;
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);
        
        instance.setIntervalPeriod(IP);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentAmount method, of class Budget.
     */
    @Test
    public void testSetCurrentAmount() {
        System.out.println("setCurrentAmount");
        double CA = 900.0;

        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);

        instance.setCurrentAmount(CA);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCategories method, of class Budget.
     */
    @Test
    public void testSetCategories() {
        System.out.println("setCategories");
        //ArrayList<Category> c = null;

        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category cOb = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> c = new ArrayList<Category>();
        c.add(cOb);
        Budget instance = new Budget("Amanda", 1000.0, 14, c);

        instance.setCategories(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Budget.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");

        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);

        String expResult = "Amanda";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Budget.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
       
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);

        double expResult = 1000.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIntervalPeriod method, of class Budget.
     */
    @Test
    public void testGetIntervalPeriod() {
        System.out.println("getIntervalPeriod");
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);

        int expResult = 14;
        int result = instance.getIntervalPeriod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentAmount method, of class Budget.
     */
    @Test
    public void testGetCurrentAmount() {
        System.out.println("getCurrentAmount");

        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);
        
        double expResult = 1000.0;
        double result = instance.getCurrentAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategories method, of class Budget.
     */
    @Test
    public void testGetCategories() {
        System.out.println("getCategories");

        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget instance = new Budget("Amanda", 1000.0, 14, cAL);

        ArrayList<Category> expResult = cAL;
        ArrayList<Category> result = instance.getCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
