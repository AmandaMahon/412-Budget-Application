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
public class NavigationCntl {
    public String username;
    public NavigationUI theNavigationUI;
    public BudgetCntl theBudgetCntl;
    public CategoryCntl theCategoryCntl;
    
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
        theBudgetCntl = new BudgetCntl(username); //this, 
    }
    
    public void showCategoryNavigationUI()
    {
        System.out.println("NavigationCntl.showCategoryNavigationUI");
        theCategoryCntl = new CategoryCntl(username); //this, 
    }
}
