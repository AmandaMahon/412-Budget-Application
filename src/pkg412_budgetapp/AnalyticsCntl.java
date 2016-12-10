package pkg412_budgetapp;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aim5627
 */
public class AnalyticsCntl {
    
    ArrayList<Budget> budgetList;
    Budget aBudget;
    ArrayList<Category> categoryList;
    Category aCategory;
    ArrayList<Transaction> transactionList;
    Transaction aTransaction;
    NavigationCntl parent;
    String username;
    
    Analytics_NavigationUI theAnalyticsNav;
    Analytics_BudgetUI theBudgetUI;
    Analytics_CategoryPurchasesUI theCatPurchUI;
    Analytics_ChartsUI theChartsUI;
    
    public AnalyticsCntl(NavigationCntl p, String u, ArrayList<Budget> bl, ArrayList<Category> cl, ArrayList<Transaction> tl)
    {
        parent = p;
        username = u;
        budgetList = bl;
        categoryList = cl;
        transactionList = tl;
        showAnalytics_NavigationUI();
    }
    
    public void showAnalytics_NavigationUI()
    {
        theAnalyticsNav = new Analytics_NavigationUI(this, username);
        theAnalyticsNav.setVisible(true);
    }
    
    public void showAnalytics_BudgetUI()
    {
        theBudgetUI = new Analytics_BudgetUI(this, username, budgetList, categoryList);
        theBudgetUI.setVisible(true);
    }
    
    public void showAnalytics_CategoryPurchasesUI()
    {
        theCatPurchUI = new Analytics_CategoryPurchasesUI(this, username, budgetList, categoryList, transactionList);
        theCatPurchUI.setVisible(true);
    }
    
    public void showAnalytics_ChartsUI()
    {
        theChartsUI = new Analytics_ChartsUI(this, username);
        theChartsUI.setVisible(true);
    }
    
    public void backBtnPressed()
    {
        System.out.println("AnalyticsCntl.backBtnPressed");
        parent.analyticsToNav(this, username);
        
    }
}
