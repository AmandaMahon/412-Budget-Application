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
 * @author aim5627
 */
public class BudgetCntlTest {
    
    public BudgetCntlTest() {
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
     * Test of showBudgetNavigationUI method, of class BudgetCntl.
     */
    @Test
    public void testShowBudgetNavigationUI() {
        System.out.println("showBudgetNavigationUI");
        NavigationCntl p = new NavigationCntl("aim5627");
        BudgetCntl instance = new BudgetCntl("aim5627", p);
        instance.showBudgetNavigationUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showNewBudgetUI method, of class BudgetCntl.
     */
    @Test
    public void testShowNewBudgetUI() {
        System.out.println("showNewBudgetUI");
        NavigationCntl p = new NavigationCntl("aim5627");
        BudgetCntl instance = new BudgetCntl("aim5627", p);
        instance.showNewBudgetUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showEditBudgetUI method, of class BudgetCntl.
     */
    @Test
    public void testShowEditBudgetUI() {
        System.out.println("showEditBudgetUI");
        NavigationCntl p = new NavigationCntl("aim5627");
        BudgetCntl instance = new BudgetCntl("aim5627", p);
        instance.showEditBudgetUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addNewBudget method, of class BudgetCntl.
     */
    @Test
    public void testAddNewBudget() {
        System.out.println("addNewBudget");
        ArrayList<Category> c = new ArrayList<Category>();
        Budget b = new Budget("Budget Test 1", 1000.00, 14, c);
        NavigationCntl p = new NavigationCntl("aim5627");
        BudgetCntl instance = new BudgetCntl("aim5627", p);
        instance.addNewBudget(b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editBudget method, of class BudgetCntl.
     */
    @Test
    public void testEditBudget() {
        System.out.println("editBudget");
        ArrayList<Budget> bl = new ArrayList<Budget>();
        ArrayList<Category> c = new ArrayList<Category>();
        Budget b = new Budget("Budget Test 1", 1000.00, 14, c);
        bl.add(b);
        NavigationCntl p = new NavigationCntl("aim5627");
        BudgetCntl instance = new BudgetCntl("aim5627", p);
        instance.editBudget(bl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toNavigationUI method, of class BudgetCntl.
     */
    @Test
    public void testToNavigationUI() {
        System.out.println("toNavigationUI");
        NavigationCntl p = new NavigationCntl("aim5627");
        BudgetCntl instance = new BudgetCntl("aim5627", p);
        instance.toNavigationUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentBudgetList method, of class BudgetCntl.
     */
    @Test
    public void testGetCurrentBudgetList() {
        System.out.println("getCurrentBudgetList");
        NavigationCntl p = new NavigationCntl("aim5627");
        BudgetCntl instance = new BudgetCntl("aim5627", p);
        ArrayList<Budget> expResult = new ArrayList<Budget>();
        ArrayList<Category> c = new ArrayList<Category>();
        Budget b = new Budget("Budget Test 1", 1000.00, 14, c);
        expResult.add(b);
        ArrayList<Budget> result = instance.getCurrentBudgetList();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
