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
public class Budget {
    private String name;
    private double amount;
    private int intervalPeriod;
    private double currentAmount;
    private ArrayList<Category> categories;
    private String username;
    
    //public Budget(){}
    public Budget(String n, double a, int IP, ArrayList<Category> c)
    {
        System.out.println("Budget.constructor");
        name = n;
        amount = a;
        intervalPeriod = IP;
        currentAmount = a;
        categories = c;
    }
    
    public void setName(String n) { 
        name = n; 
        System.out.println("Budget.setName");
    }
    public void setAmount(double a) { 
        amount = a; 
        System.out.println("Budget.setAmount");
    }
    public void setIntervalPeriod(int IP) { 
        intervalPeriod = IP; 
        System.out.println("Budget.setIP");
    }
    public void setCurrentAmount(double CA) { 
        currentAmount = CA; 
        System.out.println("Budget.setCA");
    }
    public void setCategories(ArrayList<Category> c) { 
        categories = c; 
        System.out.println("Budget.setCategories");
    }
    
    public String getName() { 
        System.out.println("Budget.getName"); 
        return name; 
    }
    public double getAmount() { 
        System.out.println("Budget.getAmount"); 
        return amount; 
    }
    public int getIntervalPeriod() { 
        System.out.println("Budget.getIP"); 
        return intervalPeriod; 
    }
    public double getCurrentAmount() { 
        System.out.println("Budget.getCA"); 
        return currentAmount; 
    }
    public ArrayList<Category> getCategories() { 
        System.out.println("Budget.getCategories"); 
        return categories; 
    }
     
}
