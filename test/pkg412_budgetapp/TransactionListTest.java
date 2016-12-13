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
public class TransactionListTest {
    
    public TransactionListTest() {
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
     * Test of setTransactionList method, of class TransactionList.
     */
    @Test
    public void testSetTransactionList() {
        System.out.println("setTransactionList");
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t);
        TransactionList instance = new TransactionList(tl);
        instance.setTransactionList(tl);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionList method, of class TransactionList.
     */
    @Test
    public void testGetTransactionList() {
        System.out.println("getTransactionList");
        
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t);
        TransactionList instance = new TransactionList(tl);
        
        ArrayList<Transaction> expResult = tl;
        ArrayList<Transaction> result = instance.getTransactionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addTransaction method, of class TransactionList.
     */
    @Test
    public void testAddTransaction() {
        System.out.println("addTransaction");
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t);
        TransactionList instance = new TransactionList(tl);
        instance.addTransaction(t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeTransaction method, of class TransactionList.
     */
    @Test
    public void testRemoveTransaction() {
        System.out.println("removeTransaction");
        int position = 0;
        
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t);
        TransactionList instance = new TransactionList(tl);
        
        instance.removeTransaction(position);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of saveTransactions and loadTransactions method, of class TransactionList.
     */
    @Test
    public void testSaveTransactions() {
        System.out.println("saveTransactions");
        int position = 0;
        
        ArrayList<Transaction> tl = new ArrayList<Transaction>();
        //String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr
        Transaction t = new Transaction(0, "Test Transaction 1", 10.00, "withdraw", "Test Category 1", 10, 25, 2016, "Target", "bought clothes");
        tl.add(t);
        TransactionList instance = new TransactionList(tl);
        
        // returns false if there are failures serializing
        assertTrue(instance.saveTransactions());
        System.out.println("loadCategory");
        assertTrue(instance.loadTransactions());
    }
    
}
