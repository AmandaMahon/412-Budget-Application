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
public class CategoryCntl {
    
    public NavigationCntl parent;
    public String username;
    CategoryNavigationUI theCatNavUI;
    CategoryUI theCategoryUI;
    
    public CategoryCntl(String u) { //NavigationCntl p,
        System.out.println("CategoryCntl.constructor1");
        //parent = p;
        username = u;
        showCategoryNavigationUI();
    }
    
    public CategoryCntl(String u, int i ) {
        System.out.println("CategoryCntl.constructor2");
        username = u;

    }
    
    public void showCategoryNavigationUI()
    {
        System.out.println("CategoryCntl.showCatNavUI");
        theCatNavUI = new CategoryNavigationUI(username);
        theCatNavUI.setVisible(true);
    }
    
    public void showNewCategory()
    {
        System.out.println("CategoryCntl.showNewCategory");
        theCategoryUI = new CategoryUI("new", username);
        theCategoryUI.setVisible(true);
    }
    
    public void showEditCategory()
    {
        System.out.println("CategoryCntl.showEditCategory");
        theCategoryUI = new CategoryUI("edit", username);
        theCategoryUI.setVisible(true);
    }
    
}
