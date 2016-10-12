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
public class BudgetList {
    
    ArrayList<Budget> budgetList;
    
    public BudgetList(ArrayList<Budget> bl)
    {
       System.out.println("BudgetList.constructor");
       budgetList = bl; 
    }
    
    public void setBudgetList(ArrayList<Budget> bl) { budgetList = bl; System.out.println("BudgetList.setBL"); }
    public ArrayList<Budget> getBudgetList() { System.out.println("BudgetList.getBL"); return budgetList; }
    
    public void addBudget(Budget b)
    {
        System.out.println("BudgetList.addBudget");
        budgetList.add(b);
    }
    
    public void removeBudget(int position)
    {
        System.out.println("BudgetList.removeBudget");
        budgetList.remove(position);
    }
        
}
