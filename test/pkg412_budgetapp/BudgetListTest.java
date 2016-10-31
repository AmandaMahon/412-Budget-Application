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
public class BudgetListTest {
    
    public BudgetListTest() {
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
     * Test of setBudgetList method, of class BudgetList.
     */
    @Test
    public void testSetBudgetList() {
        System.out.println("setBudgetList");
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        BudgetList instance = new BudgetList(bl);
        
        instance.setBudgetList(bl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBudgetList method, of class BudgetList.
     */
    @Test
    public void testGetBudgetList() {
        System.out.println("getBudgetList");
        
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        BudgetList instance = new BudgetList(bl);
        
        ArrayList<Budget> expResult = bl;
        ArrayList<Budget> result = instance.getBudgetList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addBudget method, of class BudgetList.
     */
    @Test
    public void testAddBudget() {
        System.out.println("addBudget");
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget b = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(b);
        BudgetList instance = new BudgetList(bl);
        
        //Budget b = null;
        //BudgetList instance = null;
        instance.addBudget(b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeBudget method, of class BudgetList.
     */
    @Test
    public void testRemoveBudget() {
        System.out.println("removeBudget");
        int position = 0;
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        BudgetList instance = new BudgetList(bl);
        
        //BudgetList instance = null;
        instance.removeBudget(position);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
