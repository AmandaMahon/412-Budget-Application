/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aim5627
 */
public class BudgetCntl {
    
    public NavigationCntl parent;
    public String username;
    BudgetNavigationUI theBudgetNavigationUI;
    BudgetUI theBudgetUI;
    BudgetList theBudgetList;
    Budget theBudget;
    
    public BudgetCntl(String u, NavigationCntl p)
    {
        System.out.println("BudgetCntl.constructor1");
        parent = p;
        username = u;
        showBudgetNavigationUI();
        
        if(theBudgetList == null)
        {
            ArrayList<Budget> tempBL = new ArrayList<Budget>();
            ArrayList<Category> tempCat = new ArrayList<Category>();
            theBudget = new Budget("Test Budget 1", 1000, 7, tempCat);
            tempBL.add(theBudget);
            theBudget = new Budget("Test Budget 2", 500, 30, tempCat);
            tempBL.add(theBudget);
            theBudgetList = new BudgetList(tempBL);
        }     
    }
    
    public BudgetCntl(String u, NavigationCntl p, String noShow)
    {
        System.out.println("BudgetCntl.constructor1");
        parent = p;
        username = u;
        
        if(theBudgetList == null)
        {
            ArrayList<Budget> tempBL = new ArrayList<Budget>();
            ArrayList<Category> tempCat = new ArrayList<Category>();
            theBudget = new Budget("Test Budget 1", 1000, 7, tempCat);
            tempBL.add(theBudget);
            theBudget = new Budget("Test Budget 2", 500, 30, tempCat);
            tempBL.add(theBudget);
            theBudgetList = new BudgetList(tempBL);
        }     
    }
    
    public BudgetCntl(String u, int i)
    {
        System.out.println("BudgetCntl.constructor2");
        //parent = p;
        username = u;
    }
    
    public void showBudgetNavigationUI()
    {
        System.out.println("BudgetCntl.showBudgetNavigationUI");
        theBudgetNavigationUI = new BudgetNavigationUI(this, username);
        theBudgetNavigationUI.setVisible(true);
    }
    
    public void showNewBudgetUI()
    {
        System.out.println("BudgetCntl.showNewBudgetUI");
        theBudgetUI = new BudgetUI(this, "new", username, theBudgetList.getBudgetList());
        theBudgetUI.setVisible(true);
    }
    
    public void showEditBudgetUI()
    {
        System.out.println("BudgetCntl.showEditBudgetUI");
        theBudgetUI = new BudgetUI(this, "edit", username, theBudgetList.getBudgetList());
        theBudgetUI.setVisible(true);
    }
    
    public void addNewBudget(Budget b)
    {
        System.out.println("BudgetCntl.addNewBudget");
        theBudgetList.addBudget(b);
        JOptionPane.showMessageDialog(null, "New Budget", "The budget was created", JOptionPane.INFORMATION_MESSAGE);
        toNavigationUI();
    }
    
    public void editBudget(ArrayList<Budget> bl)
    {
        System.out.println("BudgetCntl.editBudget");
        theBudgetList.setBudgetList(bl);
        JOptionPane.showMessageDialog(null, "The budget was edited", "Budget Edit", JOptionPane.INFORMATION_MESSAGE);
        toNavigationUI();
    }
    
    public void toNavigationUI()
    {
        System.out.println("BudgetCntl.toNavigationUI");
        parent.budgetToNav(this, username, theBudgetList.getBudgetList());
    }
    
    public ArrayList<Budget> getCurrentBudgetList()
    {
        System.out.println("BudgetCntl.getCurrentBudgetList");
        return theBudgetList.getBudgetList();
    }
    
    public BudgetCntl setCurrentBudgetList(ArrayList<Budget> bAL)
    {
        theBudgetList.setBudgetList(bAL);
        return this;
    }
    
    public boolean saveBudgets()
    {
        return theBudgetList.saveBudgets();
    }
    
    public boolean loadBudgets()
    {
        return theBudgetList.loadBudgets();
    }
}
