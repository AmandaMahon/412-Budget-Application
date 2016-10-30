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
    
    String name;
    double amount;
    String transactionType;
    String categoryName;
    int month;
    int day;
    int year;
    String purchaseLocation;
    String description;
    
    public Transaction(String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr) 
    {
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
    
    public void setName(String n){ name = n; }
    public void setAmount(double a) { amount = a; }
    public void setTransactionType(String tt) { transactionType = tt; }
    public void setCategoryName(String cn) { categoryName = cn; }
    public void setMonth(int m) { month = m; }
    public void setDay(int d) { day = d; }
    public void setYear(int y) { year = y; }
    public void setPurchaseLocation(String pl) { purchaseLocation = pl; }
    public void setDescription(String descr) { description = descr; }
    
    public String getName(){ return name; }
    public double getAmount() { return amount; }
    public String getTransactionType() { return transactionType; }
    public String getCategoryName() { return categoryName; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }
    public String getPurchaseLocation() {return purchaseLocation; }
    public String getDescription() { return description; }
    
    
}
