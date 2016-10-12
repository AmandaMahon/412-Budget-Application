/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

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
        BudgetCntl instance = new BudgetCntl("aim5627");
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
        BudgetCntl instance = new BudgetCntl("aim5627");
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
        BudgetCntl instance = new BudgetCntl("aim5627");
        instance.showEditBudgetUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
