/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

/**
 *
 * @author aim5627
 */
public class Transaction {
    
    int ID;
    String name;
    double amount;
    String transactionType;
    String categoryName;
    int month;
    int day;
    int year;
    String purchaseLocation;
    String description;
    
    public Transaction(int id, String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr) 
    {
        System.out.println("Transaction.constructor1");
        ID = id;
        name = n;
        amount = a;
        transactionType = tt;
        categoryName = cn;
        month = m;
        day = d;
        year = y;
        purchaseLocation = pl;
        description = descr;
    }
    
    public void setID(int id) { System.out.println("Transaction.setID"); ID = id; }
    public void setName(String n){ System.out.println("Transaction.setName"); name = n; }
    public void setAmount(double a) { System.out.println("Transaction.setAmount"); amount = a; }
    public void setTransactionType(String tt) { System.out.println("Transaction.setTransactionType"); transactionType = tt; }
    public void setCategoryName(String cn) { System.out.println("Transaction.setCategoryName"); categoryName = cn; }
    public void setMonth(int m) { System.out.println("Transaction.setMonth"); month = m; }
    public void setDay(int d) { System.out.println("Transaction.setDay"); day = d; }
    public void setYear(int y) { System.out.println("Transaction.setYear"); year = y; }
    public void setPurchaseLocation(String pl) { System.out.println("Transaction.setPurchaseLocation"); purchaseLocation = pl; }
    public void setDescription(String descr) { System.out.println("Transaction.setDescription"); description = descr; }
    
    public int getID() { System.out.println("Transaction.getID"); return ID; }
    public String getName(){ System.out.println("Transaction.getName"); return name; }
     public String getTransactionType() { System.out.println("Transaction.getTransactionType"); return transactionType; }
    public double getAmount() { System.out.println("Transaction.getAmount"); return amount; }
    public String getCategoryName() { System.out.println("Transaction.getCategoryName"); return categoryName; }
    public int getMonth() { System.out.println("Transaction.getMonth"); return month; }
    public int getDay() { System.out.println("Transaction.getDay"); return day; }
    public int getYear() { System.out.println("Transaction.getYear"); return year; }
    public String getPurchaseLocation() { System.out.println("Transaction.getPurchaseLocation"); return purchaseLocation; }
    public String getDescription() { System.out.println("Transaction.getDescription"); return description; }
    
    
}
