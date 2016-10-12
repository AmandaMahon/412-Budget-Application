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
public class BudgetCntl {
    
    public NavigationCntl parent;
    public String username;
    BudgetNavigationUI theBudgetNavigationUI;
    BudgetUI theBudgetUI;
    
    public BudgetCntl(String u)
    {
        System.out.println("BudgetCntl.constructor1");
        //parent = p;
        username = u;
        showBudgetNavigationUI();
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
        theBudgetNavigationUI = new BudgetNavigationUI();
        theBudgetNavigationUI.setVisible(true);
    }
    
    public void showNewBudgetUI()
    {
        System.out.println("BudgetCntl.showNewBudgetUI");
        theBudgetUI = new BudgetUI("new", username);
        theBudgetUI.setVisible(true);
    }
    
    public void showEditBudgetUI()
    {
        System.out.println("BudgetCntl.showEditBudgetUI");
        theBudgetUI = new BudgetUI("edit", username);
        theBudgetUI.setVisible(true);
    }
}
