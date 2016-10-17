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
public class NavigationCntlTest {
    
    public NavigationCntlTest() {
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
     * Test of showNavigationUI method, of class NavigationCntl.
     */
    @Test
    public void testShowNavigationUI() {
        System.out.println("showNavigationUI");
        NavigationCntl instance = new NavigationCntl("aim5627");
        instance.showNavigationUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showBudgetNavigationUI method, of class NavigationCntl.
     */
    @Test
    public void testShowBudgetNavigationUI() {
        System.out.println("showBudgetNavigationUI");
        NavigationCntl instance = new NavigationCntl("aim5627");
        instance.showBudgetNavigationUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showCategoryNavigationUI method, of class NavigationCntl.
     */
    @Test
    public void testShowCategoryNavigationUI() {
        System.out.println("showCategoryNavigationUI");
        NavigationCntl instance = new NavigationCntl("aim5627");
        instance.showCategoryNavigationUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of budgetToNav method, of class NavigationCntl.
     */
    @Test
    public void testBudgetToNav() {
        System.out.println("budgetToNav");
        NavigationCntl instance = new NavigationCntl("aim5627");
        BudgetCntl bc = new BudgetCntl("aim5627", instance);
        String u = "aim5627";
        ArrayList<Budget> cbl = new ArrayList<Budget>();
        instance.budgetToNav(bc, u, cbl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of categoryToNav method, of class NavigationCntl.
     */
    @Test
    public void testCategoryToNav() {
        System.out.println("categoryToNav");
        NavigationCntl instance = new NavigationCntl("aim5627");
        ArrayList<Transaction> t = new ArrayList<Transaction>();
        t.add(new Transaction());
        Category c = new Category("Category Test 1", 500, "Test Budget 1", t);
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Budget> b = new ArrayList<Budget>();
        ArrayList<Category> list = new ArrayList<Category>();
        list.add(c);
        b.add(new Budget("Budget Test 1", 1000.00, 14, list));
        b.add(new Budget("Budget Test 2", 2000.00, 13, list));
        CategoryCntl cc = new CategoryCntl(p, "aim5627", b);
        String u = "aim5627";
        ArrayList<Category> ccl = new ArrayList<Category>();
        instance.categoryToNav(cc, u, ccl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
