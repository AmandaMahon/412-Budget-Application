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
public class NavigationCntl {
    public String username;
    public NavigationUI theNavigationUI;
    public BudgetCntl theBudgetCntl;
    public CategoryCntl theCategoryCntl;
    public ArrayList<Budget> currentBudgetList;
    public ArrayList<Category> currentCategoryList;
    
    public NavigationCntl(String u){
        System.out.println("NavigationCntl.constructor1");
        username = u;
        showNavigationUI();
    }
    
    public NavigationCntl(String u, int i){
        System.out.println("NavigationCntl.constructor2");
        username = u;
    }
    
    public void showNavigationUI()
    {
        System.out.println("CategoryList.showNavigationUI");
        theNavigationUI = new NavigationUI(this, username); // 
        theNavigationUI.setVisible(true);
    }
    
    public void showBudgetNavigationUI()
    {
        System.out.println("NavigationCntl.showBudgetNavigationUI");
        theBudgetCntl = new BudgetCntl(username, this); //this, 
    }
    
    public void budgetToNav(BudgetCntl bc, String u, ArrayList<Budget> cbl)
    {
        System.out.println("NavigationCntl.budgetToNav");
        theBudgetCntl = bc;
        username = u;
        currentBudgetList = cbl;
        showNavigationUI();
    }
    
    public void showCategoryNavigationUI()
    {
        System.out.println("NavigationCntl.showCategoryNavigationUI");
        if(currentBudgetList == null)
        {
            if(theBudgetCntl == null)
            {
                theBudgetCntl = new BudgetCntl(username, this);
            }
            currentBudgetList = theBudgetCntl.getCurrentBudgetList();
        }
        theCategoryCntl = new CategoryCntl(this, username, currentBudgetList); //this, 
    }
    
    public void categoryToNav(CategoryCntl cc, String u, ArrayList<Category> ccl)
    {
        System.out.println("NavigationCntl.categoryToNav");
        theCategoryCntl = cc;
        username = u;
        currentCategoryList = ccl;
        showNavigationUI();
    }
}
