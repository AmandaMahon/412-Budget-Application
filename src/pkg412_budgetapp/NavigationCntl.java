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
    public TransactionCntl theTransactionCntl;
    public ArrayList<Transaction> currentTransactionList;
    public AnalyticsCntl theAnalyticsCntl;
    public int notificationSize;
    public NotificationCntl notificationCntl;
    
    public NavigationCntl(String u){
        System.out.println("NavigationCntl.constructor1");
        username = u;
        getNewNotificationsNum();
        showNavigationUI();
    }
    
    public NavigationCntl(String u, int i){
        System.out.println("NavigationCntl.constructor2");
        username = u;
        getNewNotificationsNum();
    }
    
    public void showNavigationUI()
    {
        System.out.println("CategoryList.showNavigationUI");
        //getNewNotificationsNum();
        theNavigationUI = new NavigationUI(this, username, notificationSize); // 
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
    
    public void showTransactionUI()
    {
        System.out.println("NavigationCntl.showTransactionUI");
        
        if(currentBudgetList == null)
        {
            if(theBudgetCntl == null)
            {
                theBudgetCntl = new BudgetCntl(username, this);
            }
            currentBudgetList = theBudgetCntl.getCurrentBudgetList();
        }

        if(currentCategoryList == null)
        {
            if(theCategoryCntl == null)
            {
                theCategoryCntl = new CategoryCntl(this, username, currentBudgetList);
            }
            currentCategoryList = theCategoryCntl.getCurrentCategoryList();
        }
        
        theTransactionCntl = new TransactionCntl(this, username, currentCategoryList, currentBudgetList);
    }
    
    public void TransactionToNavigation(TransactionCntl transCntl, ArrayList<Category> cAL, ArrayList<Transaction> tAL)
    {
        theTransactionCntl = transCntl;
        currentCategoryList = cAL;
        theCategoryCntl.setCurrentCategoryList(cAL);
        currentTransactionList = tAL;
        //getNewNotificationsNum();
        showNavigationUI();
    }
    
    public void createNotifications(TransactionCntl tc, String b, String c, double currentA, 
            double p, double a, String type, ArrayList<Budget> bAL, ArrayList<Category> cAL, 
            ArrayList<Transaction> tAL)
    {
        currentBudgetList = bAL;
        theBudgetCntl = theBudgetCntl.setCurrentBudgetList(bAL);
        notificationCntl.createNotification(this, b, c, currentA, p, a, type);
        TransactionToNavigation(tc, cAL, tAL);
    }
    
    public void showAnalytics()
    {
        System.out.println("NavigationCntl.showAnalytics");
        if(currentBudgetList == null)
        {
            if(theBudgetCntl == null)
            {
                theBudgetCntl = new BudgetCntl(username, this, "NoShow");
            }
            currentBudgetList = theBudgetCntl.getCurrentBudgetList();
        }
        if(currentCategoryList == null)
        {
            if(theCategoryCntl == null)
            {
                theCategoryCntl = new CategoryCntl(this, username, currentBudgetList, "NoShow");
            }
            currentCategoryList = theCategoryCntl.getCurrentCategoryList();
        }
        
        if(currentTransactionList == null)
        {
            if(theTransactionCntl == null)
            {
                theTransactionCntl = new TransactionCntl(this, username, currentCategoryList, currentBudgetList, "noShow");
            }
            currentTransactionList = theTransactionCntl.getCurrentTransactionList();
        }
        theAnalyticsCntl = new AnalyticsCntl(this, username, currentBudgetList, currentCategoryList, currentTransactionList);
    }
    
    public void analyticsToNav(AnalyticsCntl ac, String u)
    {
        System.out.println("NavigationCntl.budgetToNav");
        theAnalyticsCntl = ac;
        username = u;
        showNavigationUI();
    }
    
    
    //notifications
    public void getNewNotificationsNum()
    {
        notificationCntl = new NotificationCntl(this, false);
        notificationSize = notificationCntl.numNew();

    }
    
    public void showNotifications()
    {
        notificationCntl.showNotificationNavUI(this);
    }
    
    public void notificationToNav(NotificationCntl nc, int ns)
    {
        notificationCntl = nc;
        notificationSize = ns;
        showNavigationUI();
    }
}
