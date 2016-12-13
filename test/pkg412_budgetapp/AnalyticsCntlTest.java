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
public class AnalyticsCntlTest {
    
    public AnalyticsCntlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of showAnalytics_NavigationUI method, of class AnalyticsCntl.
     */
    @Test
    public void testShowAnalytics_NavigationUI() {
        System.out.println("showAnalytics_NavigationUI");
        Transaction t = new Transaction(0, "Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Amanda", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        CategoryList cL = new CategoryList(cAL);
        
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t1 = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t1);
        
        NavigationCntl p = new NavigationCntl("aim5627", true);
        AnalyticsCntl instance = new AnalyticsCntl(p, "test", bl, cAL, tl, true);
        instance.showAnalytics_NavigationUI();
    }

    /**
     * Test of showAnalytics_BudgetUI method, of class AnalyticsCntl.
     */
    @Test
    public void testShowAnalytics_BudgetUI() {
        System.out.println("showAnalytics_BudgetUI");
        Transaction t = new Transaction(0, "Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Amanda", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        CategoryList cL = new CategoryList(cAL);
        
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t1 = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t1);
        
        NavigationCntl p = new NavigationCntl("aim5627", true);
        AnalyticsCntl instance = new AnalyticsCntl(p, "test", bl, cAL, tl, true);
        instance.showAnalytics_BudgetUI();
    }

    /**
     * Test of showAnalytics_CategoryPurchasesUI method, of class AnalyticsCntl.
     */
    @Test
    public void testShowAnalytics_CategoryPurchasesUI() {
        System.out.println("showAnalytics_CategoryPurchasesUI");
        Transaction t = new Transaction(0, "Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Amanda", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        CategoryList cL = new CategoryList(cAL);
        
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t1 = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t1);
        
        NavigationCntl p = new NavigationCntl("aim5627", true);
        AnalyticsCntl instance = new AnalyticsCntl(p, "test", bl, cAL, tl, true);
        instance.showAnalytics_CategoryPurchasesUI();
    }

    /**
     * Test of showAnalytics_ChartsUI method, of class AnalyticsCntl.
     */
    @Test
    public void testShowAnalytics_ChartsUI() {
        System.out.println("showAnalytics_ChartsUI");
        Transaction t = new Transaction(0, "Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Amanda", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        CategoryList cL = new CategoryList(cAL);
        
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t1 = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t1);
        
        NavigationCntl p = new NavigationCntl("aim5627", true);
        AnalyticsCntl instance = new AnalyticsCntl(p, "test", bl, cAL, tl, true);
        instance.showAnalytics_ChartsUI();
    }

    /**
     * Test of backBtnPressed method, of class AnalyticsCntl.
     */
    @Test
    public void testBackBtnPressed() {
        System.out.println("backBtnPressed");
        Transaction t = new Transaction(0, "Burger", 5, "Credit", "Food", 3, 4, 2015, "The Mix", "A burger with no tomato.");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Amanda", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        CategoryList cL = new CategoryList(cAL);
        
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t1 = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t1);
        
        NavigationCntl p = new NavigationCntl("aim5627", true);
        AnalyticsCntl instance = new AnalyticsCntl(p, "test", bl, cAL, tl, true);
        instance.backBtnPressed();
    }
    
}
