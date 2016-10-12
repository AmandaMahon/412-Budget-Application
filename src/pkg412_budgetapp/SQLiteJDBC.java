/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
public class SQLiteJDBC {
    protected Connection c = null;

    public SQLiteJDBC() { // open a database
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public Boolean createTable(String sql) {
        try {
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            return true;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
    }
    
    public Boolean createTables() {
        System.out.println("Creating Categories...");
        String sql = "CREATE TABLE IF NOT EXISTS CATEGORIES " +
                     "(ID INTEGER PRIMARY KEY      NOT NULL," + 
                     "NAME            TEXT," +
                     "DESCRIPTION     TEXT); ";
        
        this.createTable(sql);
        
        System.out.println("Creating Transactions...");
        String transactions_sql = "CREATE TABLE IF NOT EXISTS TRANSACTIONS " +
                     "(ID INTEGER PRIMARY KEY     NOT NULL," +
                     " NAME           TEXT    NOT NULL," + 
                     " VALUE          REAL    NOT NULL," + 
                     " CATEGORY       ID      NOT NULL," + 
                     " LOCATION       TEXT," + 
                     " DESCRIPTION    TEXT," +
                     " FOREIGN KEY(CATEGORY) REFERENCES CATEGORIES(ID) ) ";
        
        this.createTable(transactions_sql);
        
        System.out.println("Creating Budgets...");
        String budgets_sql =       "CREATE TABLE IF NOT EXISTS BUDGETS " +
                     "(ID INTEGER PRIMARY KEY     NOT NULL," +
                     " NAME           TEXT NOT NULL, " +
                     " INTERVAL       INTEGER NOT NULL, " +
                     " DESCRIPTION    TEXT, " + 
                     " CATEGORY       INTEGER" +
                     " FOREIGN KEY(CATEGORY) REFERENCES CATEGORIES(ID) ); ";
        
        this.createTable(budgets_sql);

        System.out.println("Creating Notifications...");
        String notifications_sql = "CREATE TABLE IF NOT EXISTS NOTIFICATIONS " +
                     "(ID INTEGER PRIMARY KEY     NOT NULL," +
                     " NAME           TEXT NOT NULL, " +
                     " DESCRIPTION    TEXT, " + 
                     " READ           BOOLEAN);"; 
        
        return this.createTable(notifications_sql);
    }

    public Boolean insertNotification(String name, String description, Boolean read) {
        try {
            PreparedStatement stmt = c.prepareStatement
      ("INSERT INTO NOTIFICATIONS (NAME,DESCRIPTION,READ) VALUES(?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, description);
            stmt.setBoolean(3, read);
            stmt.close();
            c.commit();
            return true;
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            return false;
        }
    }
    
    public Boolean insertBudget(String name, int interval, String description, String category) {
        try {
            PreparedStatement stmt = c.prepareStatement
      ("INSERT INTO BUDGETS (NAME,INTEGER,DESCRIPTION,CATEGORY) VALUES(?,?,?,?,?)");
            stmt.setString(1, name);
            stmt.setInt(2, interval);
            stmt.setString(3, description);
            stmt.setString(4, category);
            stmt.close();
            c.commit();
            return true;
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            return false;
        }
    }
    
    public Boolean insertTransaction(String name, double value, String category, String location, String description) {
        try {
            PreparedStatement stmt = c.prepareStatement
      ("INSERT INTO TRANSACTIONS (NAME,VALUE,CATEGORY,LOCATION,DESCRIPTION) VALUES(?,?,?,?,?)");
            stmt.setString(1, name);
            stmt.setDouble(2, value);
            stmt.setString(3, category);
            stmt.setString(4, location);
            stmt.setString(5, description);
            stmt.close();
            c.commit();
            return true;
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            return false;
        }
    }
    
    public Boolean delete(String table, int id) {
        try {
            PreparedStatement stmt = c.prepareStatement("DELETE FROM ? WHERE ID=?");
            stmt.setString(1, table);
            stmt.setInt(2, id);
            stmt.close();
            c.commit();
            return true;
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            return false;
        }
    }
    
    public Boolean close() {
        try {
            c.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
    }
}