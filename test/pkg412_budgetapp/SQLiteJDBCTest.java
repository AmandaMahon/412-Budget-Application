/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonizoon
 */
public class SQLiteJDBCTest {
    
    public SQLiteJDBCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createTable method, of class SQLiteJDBC.
     */
    @Test
    public void testCreateTable() {
        System.out.println("createTable");
        String sql = "";
        SQLiteJDBC instance = new SQLiteJDBC();
        Boolean expResult = true;
        Boolean result = instance.createTable(sql);
        assertEquals(expResult, result);
    }

    /**
     * Test of createTables method, of class SQLiteJDBC.
     */
    @Test
    public void testCreateTables() {
        System.out.println("createTables");
        SQLiteJDBC instance = new SQLiteJDBC();
        Boolean expResult = true;
        Boolean result = instance.createTables();
        assertEquals(expResult, result);
    }

    /**
     * Test of insertNotification method, of class SQLiteJDBC.
     */
    @Test
    public void testInsertNotification() {
        System.out.println("insertNotification");
        String name = "Added a notification.";
        String description = "You are now notified";
        Boolean read = false;
        SQLiteJDBC instance = new SQLiteJDBC();
        Boolean expResult = true;
        Boolean result = instance.insertNotification(name, description, read);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertBudget method, of class SQLiteJDBC.
     */
    @Test
    public void testInsertBudget() {
        System.out.println("insertBudget");
        String name = "New Budget";
        int interval = 1;
        String description = "stuff";
        String category = "Food";
        SQLiteJDBC instance = new SQLiteJDBC();
        Boolean expResult = true;
        Boolean result = instance.insertBudget(name, interval, description, category);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertTransaction method, of class SQLiteJDBC.
     */
    @Test
    public void testInsertTransaction() {
        System.out.println("insertTransaction");
        String name = "";
        double value = 0.0;
        String category = "";
        String location = "";
        String description = "";
        SQLiteJDBC instance = new SQLiteJDBC();
        Boolean expResult = true;
        Boolean result = instance.insertTransaction(name, value, category, location, description);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class SQLiteJDBC.
     
    @Test
    public void testDelete() {
        System.out.println("delete");
        String table = "CATEGORIES";
        int id = 1;
        SQLiteJDBC instance = new SQLiteJDBC();
        Boolean expResult = true;
        Boolean result = instance.delete(table, id);
        assertEquals(expResult, result);
    } */

    /**
     * Test of close method, of class SQLiteJDBC.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        SQLiteJDBC instance = new SQLiteJDBC();
        Boolean expResult = true;
        Boolean result = instance.close();
        assertEquals(expResult, result);
    }
    
}
