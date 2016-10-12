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
public class CategoryCntlTest {
    
    public CategoryCntlTest() {
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
     * Test of showCategoryNavigationUI method, of class CategoryCntl.
     */
    @Test
    public void testShowCategoryNavigationUI() {
        System.out.println("showCategoryNavigationUI");
        CategoryCntl instance = new CategoryCntl("aim5627");
        instance.showCategoryNavigationUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showNewCategory method, of class CategoryCntl.
     */
    @Test
    public void testShowNewCategory() {
        System.out.println("showNewCategory");
        CategoryCntl instance =  new CategoryCntl("aim5627");
        instance.showNewCategory();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showEditCategory method, of class CategoryCntl.
     */
    @Test
    public void testShowEditCategory() {
        System.out.println("showEditCategory");
        CategoryCntl instance = new CategoryCntl("aim5627");
        instance.showEditCategory();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
