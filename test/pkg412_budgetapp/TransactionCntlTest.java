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
public class TransactionCntlTest {
    
    public TransactionCntlTest() {
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
     * Test of showTransactionUI method, of class TransactionCntl.
     */
    @Test
    public void testShowTransactionUI() {
        System.out.println("showTransactionUI");
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Category> cAL = new ArrayList<Category>();
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        TransactionCntl instance = new TransactionCntl(p, "aim5627", cAL, bl, "yes");
        instance.showTransactionUI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of newTransaction method, of class TransactionCntl.
     */
    @Test
    public void testNewTransaction() {
        System.out.println("newTransaction");
        String n = "";
        double a = 0.0;
        String tt = "";
        String cn = "Food";
        int m = 0;
        int d = 0;
        int y = 0;
        String pl = "";
        String descr = "";
        
        NavigationCntl p = new NavigationCntl("aim5627");
        ArrayList<Transaction> tAL = new ArrayList<Transaction>();
        Category c = new Category("Food", 1000, "Amanda", tAL);
        ArrayList<Category> cAL = new ArrayList<Category>();
        cAL.add(c);
        Budget i = new Budget("Amanda", 1000.0, 14, cAL);
        ArrayList<Budget> bl = new ArrayList<Budget>();
        bl.add(i);
        TransactionCntl instance = new TransactionCntl(p, "aim5627", cAL, bl);
        instance.newTransaction(n, a, tt, cn, m, d, y, pl, descr);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
