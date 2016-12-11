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
public class CategoryCntl {
    
    public NavigationCntl parent;
    public String username;
    CategoryNavigationUI theCatNavUI;
    CategoryUI theCategoryUI;
    ArrayList<Budget> currentBudgetList;
    ArrayList<Category> categoryListAL;
    CategoryList theCategoryList;
    Category theCategory;
    
//    public CategoryCntl(NavigationCntl p, String u, ArrayList<Budget> bl) { //NavigationCntl p,
//        System.out.println("CategoryCntl.constructor1");
//        parent = p;
//        username = u;
//        currentBudgetList = bl;
//        showCategoryNavigationUI();
//        
//        if(theCategoryList == null)
//        {
//            // FIXME: These require two budgets to exist in the budget list! Which breaks if there is no budget list.
//            categoryListAL = new ArrayList<Category>();
//            ArrayList<Transaction> t = new ArrayList<Transaction>();
//            Category theCategory = new Category("Test Category 1", 500, currentBudgetList.get(0).getName(), t);
//            categoryListAL.add(theCategory);
//            theCategory = new Category("Test Category 2", 250, currentBudgetList.get(0).getName(), t);
//            categoryListAL.add(theCategory);
//            theCategory = new Category("Test Category 3", 300, currentBudgetList.get(1).getName(), t);
//            categoryListAL.add(theCategory);
//            theCategoryList = new CategoryList(categoryListAL);
//        }
//    }
//    
//    public CategoryCntl(String u, int i) {
//        System.out.println("CategoryCntl.constructor2");
//        username = u;
//    }
    
    public CategoryCntl(NavigationCntl p, String u, ArrayList<Budget> bl, boolean showUI) { //NavigationCntl p,
        System.out.println("CategoryCntl.constructor1");
        parent = p;
        username = u;
        currentBudgetList = bl;
        
        if(theCategoryList == null)
        {
            // FIXME: These require two budgets to exist in the budget list! Which breaks if there is no budget list.
            categoryListAL = new ArrayList<Category>();
            ArrayList<Transaction> t = new ArrayList<Transaction>();
            Category theCategory = new Category("Test Category 1", 500, currentBudgetList.get(0).getName(), t);
            categoryListAL.add(theCategory);
            theCategory = new Category("Test Category 2", 250, currentBudgetList.get(0).getName(), t);
            categoryListAL.add(theCategory);
            theCategory = new Category("Test Category 3", 300, currentBudgetList.get(1).getName(), t);
            categoryListAL.add(theCategory);
            theCategoryList = new CategoryList(categoryListAL);
        }
        
        if(showUI)
        {
            showCategoryNavigationUI();            
        }
    }
    
    public void showCategoryNavigationUI()
    {
        System.out.println("CategoryCntl.showCatNavUI");
        theCatNavUI = new CategoryNavigationUI(this, username);
        theCatNavUI.setVisible(true);
    }
    
    public void showNewCategory()
    {
        System.out.println("CategoryCntl.showNewCategory");
        theCategoryUI = new CategoryUI(this, "new", username, currentBudgetList, theCategoryList.getCategories());
        theCategoryUI.setVisible(true);
    }
    
    public void showEditCategory()
    {
        System.out.println("CategoryCntl.showEditCategory");
        theCategoryUI = new CategoryUI(this, "edit", username, currentBudgetList, theCategoryList.getCategories());
        theCategoryUI.setVisible(true);
    }
    
    public void toNavigationUI()
    {
        System.out.println("CategoryCntl.toNavigationUI");
        parent.categoryToNav(this, username, theCategoryList.getCategories(), false);
    }
    
    public void addNewCategory(Category c)
    {
        System.out.println("CategoryCntl.addNewCategory");
        theCategoryList.addCategory(c);
        JOptionPane.showMessageDialog(null, "The category was created", "Create Category", JOptionPane.INFORMATION_MESSAGE);
        toNavigationUI();
    }
    
    public void editCategory(ArrayList<Category> c)
    {
        System.out.println("CategoryCntl.addNewCategory");
        theCategoryList.setCategories(c);
        JOptionPane.showMessageDialog(null, "The category was edited", "Category Edited", JOptionPane.INFORMATION_MESSAGE);
        toNavigationUI();
    }
    
    public ArrayList<Category> getCurrentCategoryList()
    {
        System.out.println("CategoryCntl.getCurrentCategoryList");
        return theCategoryList.getCategories();
    }
    
    public void setCurrentCategoryList(ArrayList<Category> cAL)
    {
        System.out.println("CategoryCntl.setCurrentCategoryList");
        theCategoryList.setCategories(cAL);
    }
    
    public boolean saveCategories()
    {
        System.out.println("CategoryCntl.saveCategories");
        return theCategoryList.saveCategories();
    }
    
    public boolean loadCategories()
    {
        System.out.println("CategoryCntl.loadCategories");
        return theCategoryList.loadCategories();
    }
    
    public void closeWindow()
    {
        System.out.println("CategoryCntl.closeWindow");
        parent.categoryToNav(this, username, theCategoryList.getCategories(), true);
    }
        
    
}
