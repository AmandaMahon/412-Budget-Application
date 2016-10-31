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
public class CategoryListTest {
    
    public CategoryListTest() {
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
     * Test of setCategories method, of class CategoryList.
     */
    @Test
    public void testSetCategories() {
        System.out.println("setCategories");
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category cOb = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> c = new ArrayList<Category>();
        c.add(cOb);
        //Budget instance = new Budget("Amanda", 1000.0, 14, c);
        
        //ArrayList<Category> c = null;
        CategoryList instance = new CategoryList(c);
        instance.setCategories(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategories method, of class CategoryList.
     */
    @Test
    public void testGetCategories() {
        System.out.println("getCategories");
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category cOb = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> c = new ArrayList<Category>();
        c.add(cOb);
        //Budget instance = new Budget("Amanda", 1000.0, 14, c);
        
        //ArrayList<Category> c = null;
        CategoryList instance = new CategoryList(c);
        
        
        //CategoryList instance = null;
        ArrayList<Category> expResult = c;
        ArrayList<Category> result = instance.getCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCategory method, of class CategoryList.
     */
    @Test
    public void testAddCategory() {
        System.out.println("addCategory");
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        //Budget instance = new Budget("Amanda", 1000.0, 14, c);
        
        //ArrayList<Category> c = null;
        CategoryList instance = new CategoryList(cAL);
        
        //Category c = null;
        ///CategoryList instance = null;
        instance.addCategory(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeCategory method, of class CategoryList.
     */
    @Test
    public void testRemoveCategory() {
        System.out.println("removeCategory");
        
        Transaction t = new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category cOb = new Category("Food", 1000, "Home", tAL);
        ArrayList<Category> c = new ArrayList<Category>();
        c.add(cOb);
        //Budget instance = new Budget("Amanda", 1000.0, 14, c);
        
        //ArrayList<Category> c = null;
        CategoryList instance = new CategoryList(c);
        
        int position = 0;
        //CategoryList instance = null;
        instance.removeCategory(position);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
