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
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Transaction> t = new ArrayList<Transaction>();
        t.add(new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato."));
        Category c = new Category("Category Test 1", 500, "Test Budget 1", t);
        ArrayList<Budget> b = new ArrayList<Budget>();
        ArrayList<Category> list = new ArrayList<Category>();
        list.add(c);
        b.add(new Budget("Budget Test 1", 1000.00, 14, list));
        b.add(new Budget("Budget Test 2", 2000.00, 13, list));
        CategoryCntl instance = new CategoryCntl(p, "aim5627", b);
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
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Transaction> t = new ArrayList<Transaction>();
        t.add(new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato."));
        Category c = new Category("Category Test 1", 500, "Test Budget 1", t);
        ArrayList<Budget> b = new ArrayList<Budget>();
        ArrayList<Category> list = new ArrayList<Category>();
        list.add(c);
        b.add(new Budget("Budget Test 1", 1000.00, 14, list));
        b.add(new Budget("Budget Test 2", 2000.00, 13, list));
        CategoryCntl instance = new CategoryCntl(p, "aim5627", b);
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
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Transaction> t = new ArrayList<Transaction>();
        t.add(new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato."));
        Category c = new Category("Category Test 1", 500, "Test Budget 1", t);
        ArrayList<Budget> b = new ArrayList<Budget>();
        ArrayList<Category> list = new ArrayList<Category>();
        list.add(c);
        b.add(new Budget("Budget Test 1", 1000.00, 14, list));
        b.add(new Budget("Budget Test 2", 2000.00, 13, list));
        CategoryCntl instance = new CategoryCntl(p, "aim5627", b);
        instance.showEditCategory();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toNavigationUI method, of class CategoryCntl.
     */
    @Test
    public void testToNavigationUI() {
        System.out.println("toNavigationUI");
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Transaction> t = new ArrayList<Transaction>();
        t.add(new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato."));
        Category c = new Category("Category Test 1", 500, "Test Budget 1", t);
        ArrayList<Budget> b = new ArrayList<Budget>();
        ArrayList<Category> list = new ArrayList<Category>();
        list.add(c);
        b.add(new Budget("Budget Test 1", 1000.00, 14, list));
        b.add(new Budget("Budget Test 2", 2000.00, 13, list));
        CategoryCntl instance = new CategoryCntl(p, "aim5627", b);
        instance.toNavigationUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addNewCategory method, of class CategoryCntl.
     */
    @Test
    public void testAddNewCategory() {
        System.out.println("addNewCategory");
        ArrayList<Transaction> t = new ArrayList<Transaction>();
        Category c = new Category("Category Test 1", 500, "Test Budget 1", t);
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Budget> b = new ArrayList<Budget>();
        ArrayList<Category> list = new ArrayList<Category>();
        list.add(c);
        b.add(new Budget("Budget Test 1", 1000.00, 14, list));
        b.add(new Budget("Budget Test 2", 2000.00, 13, list));
        CategoryCntl instance = new CategoryCntl(p, "aim5627", b);
        instance.addNewCategory(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editCategory method, of class CategoryCntl.
     */
    @Test
    public void testEditCategory() {
        System.out.println("editCategory");
        ArrayList<Transaction> t = new ArrayList<Transaction>();
        t.add(new Transaction("Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato."));
        Category c = new Category("Category Test 1", 500, "Test Budget 1", t);
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Budget> b = new ArrayList<Budget>();
        ArrayList<Category> list = new ArrayList<Category>();
        list.add(c);
        b.add(new Budget("Budget Test 1", 1000.00, 14, list));
        b.add(new Budget("Budget Test 2", 2000.00, 13, list));
        CategoryCntl instance = new CategoryCntl(p, "aim5627", b);
        instance.editCategory(list);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
