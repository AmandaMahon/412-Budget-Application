/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import java.util.ArrayList;

/**
 *
 * @author aim5627
 */
public class Category {
    private String name;
    private double amount;
    private double currentAmount;
    private String budgetName;
    private ArrayList<Transaction> transactions;
    
    public Category(String n, double a, String BN, ArrayList<Transaction> t)
    {
        System.out.println("Category.constructor");
        name = n;
        amount = a;
        currentAmount = a;
        budgetName = BN;
        transactions = t;
    }
    
    public void setName(String n) { 
        System.out.println("Category.setName"); 
        name = n; 
    }
    public void setAmount(double a) { 
        System.out.println("Category.setAmount"); 
        amount = a; 
    }
    public void setCurrentAmount (double CA) { 
        System.out.println("Category.setCA"); 
        currentAmount = CA; 
    }
    public void setBudgetName(String BN) {
        System.out.println("Category.setBN");
        budgetName = BN;
    }
    public void setTransactions(ArrayList<Transaction> t) { 
        System.out.println("Category.setTransactions"); 
        transactions = t; 
    }
    
    public String getName() { 
        System.out.println("Category.getName"); 
        return name; 
    }
    public double getAmount() { 
        System.out.println("Category.getAmount"); 
        return amount; 
    }
    public double getCurrentAmount() { 
        System.out.println("Category.getCA"); 
        return currentAmount; 
    }
    public String getBudgetName() {
        System.out.println("Category.getBN");
        return budgetName;
    }
    public ArrayList<Transaction> getTransactions() { 
        System.out.println("Category.getTransactions"); 
        return transactions; 
    }
}
