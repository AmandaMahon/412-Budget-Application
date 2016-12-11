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
    
    public NavigationCntl(String u, boolean startUp){
        System.out.println("NavigationCntl.constructor1");
        username = u;
        
        theBudgetCntl = new BudgetCntl(username, this, false, false);
        currentBudgetList = theBudgetCntl.getCurrentBudgetList();
        theCategoryCntl = new CategoryCntl(this, username, currentBudgetList, false, false); 
        currentCategoryList = theCategoryCntl.getCurrentCategoryList();
        theTransactionCntl = new TransactionCntl(this, username, currentCategoryList, currentBudgetList, false, false);
        currentTransactionList = theTransactionCntl.getCurrentTransactionList();
        theAnalyticsCntl = new AnalyticsCntl(this, username, currentBudgetList, currentCategoryList, currentTransactionList, false);
        
        if(startUp)
        {
            getNewNotificationsNum();        
            loadSavedData();
            showNavigationUI();
        }
        
    }
    
//    public NavigationCntl(String u, int i){
//        System.out.println("NavigationCntl.constructor2");
//        username = u;
//        getNewNotificationsNum();
//        loadSavedData();
//    }
    
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
        theBudgetCntl = new BudgetCntl(username, this, true, true); //this, 
    }
    
    public void loadSavedData()
    {
        System.out.println("NavigationCntl.loadSavedData");
        
        boolean isBudget = theBudgetCntl.loadBudgets();
        currentBudgetList = theBudgetCntl.getCurrentBudgetList();
        boolean isCategory = theCategoryCntl.loadCategories();
        currentCategoryList = theCategoryCntl.getCurrentCategoryList();
        boolean isTransaction = theTransactionCntl.loadTransactions();
        currentTransactionList = theTransactionCntl.getCurrentTransactionList();
        boolean isNotification = notificationCntl.loadNotifications();
        
        
        if(isBudget && isCategory && isTransaction && isNotification)
        {
            JOptionPane.showMessageDialog(null, "Your data has been loaded", 
                    "Loading", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Your data has NOT been loaded", 
                    "Loading Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void saveUpdates()
    {
        System.out.println("NavigationCntl.saveUpdates");
        boolean isBudget = theBudgetCntl.saveBudgets();
        boolean isCategory = theCategoryCntl.saveCategories();
        boolean isTransaction = theTransactionCntl.saveTransactions();
        boolean isNotification = notificationCntl.saveNotifications();
        
        if(isBudget && isCategory && isTransaction && isNotification)
        {
            JOptionPane.showMessageDialog(null, "Your data has been saved", 
                    "Saving", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Your data has NOT been saved", 
                    "Saving Error", JOptionPane.INFORMATION_MESSAGE);
        } 
    }
    
    public void budgetToNav(BudgetCntl bc, String u, ArrayList<Budget> cbl, boolean save)
    {
        System.out.println("NavigationCntl.budgetToNav");
        theBudgetCntl = bc;
        username = u;
        currentBudgetList = cbl;
        if(save)
        {
            saveUpdates();
        }
        else
        {
            showNavigationUI();
        }
    }
    
    public void showCategoryNavigationUI()
    {
        System.out.println("NavigationCntl.showCategoryNavigationUI");
//        if(currentBudgetList == null)
//        {
//            if(theBudgetCntl == null)
//            {
//                theBudgetCntl = new BudgetCntl(username, this, false);
//            }
//            currentBudgetList = theBudgetCntl.getCurrentBudgetList();
//        }
        theCategoryCntl = new CategoryCntl(this, username, currentBudgetList, true, true); //this, 
    }
    
    public void categoryToNav(CategoryCntl cc, String u, ArrayList<Category> ccl, boolean save)
    {
        System.out.println("NavigationCntl.categoryToNav");
        theCategoryCntl = cc;
        username = u;
        currentCategoryList = ccl;
        if(save)
        {
            saveUpdates();
        }
        else
        {
            showNavigationUI();
        }
    }
    
    public void showTransactionUI()
    {
        System.out.println("NavigationCntl.showTransactionUI");
        
//        if(currentBudgetList == null)
//        {
//            if(theBudgetCntl == null)
//            {
//                theBudgetCntl = new BudgetCntl(username, this, false);
//            }
//            currentBudgetList = theBudgetCntl.getCurrentBudgetList();
//        }
//
//        if(currentCategoryList == null)
//        {
//            if(theCategoryCntl == null)
//            {
//                theCategoryCntl = new CategoryCntl(this, username, currentBudgetList, false);
//            }
//            currentCategoryList = theCategoryCntl.getCurrentCategoryList();
//        }
        
        theTransactionCntl = new TransactionCntl(this, username, currentCategoryList, currentBudgetList, true, true);
    }
    
    public void TransactionToNavigation(TransactionCntl transCntl, ArrayList<Category> cAL, 
            ArrayList<Transaction> tAL, boolean save)
    {
        System.out.println("NavigationCntl.TransactionToNavigation");
        theTransactionCntl = transCntl;
        currentCategoryList = cAL;
        theCategoryCntl.setCurrentCategoryList(cAL);
        currentTransactionList = tAL;
        //getNewNotificationsNum();
        if(save)
        {
            saveUpdates();
        }
        else
        {
            showNavigationUI();
        }
    }
    
    public void createNotifications(TransactionCntl tc, String b, String c, double currentA, 
            double p, double a, String type, ArrayList<Budget> bAL, ArrayList<Category> cAL, 
            ArrayList<Transaction> tAL)
    {
        System.out.println("NavigationCntl.createNotifications");
        currentBudgetList = bAL;
        theBudgetCntl = theBudgetCntl.setCurrentBudgetList(bAL);
        notificationCntl.createNotification(this, b, c, currentA, p, a, type);
        TransactionToNavigation(tc, cAL, tAL, false);
    }
    
    public void showAnalytics()
    {
        System.out.println("NavigationCntl.showAnalytics");
//        if(currentBudgetList == null)
//        {
//            if(theBudgetCntl == null)
//            {
//                theBudgetCntl = new BudgetCntl(username, this, false);
//            }
//            currentBudgetList = theBudgetCntl.getCurrentBudgetList();
//        }
//        if(currentCategoryList == null)
//        {
//            if(theCategoryCntl == null)
//            {
//                theCategoryCntl = new CategoryCntl(this, username, currentBudgetList, false);
//            }
//            currentCategoryList = theCategoryCntl.getCurrentCategoryList();
//        }
//        
//        if(currentTransactionList == null)
//        {
//            if(theTransactionCntl == null)
//            {
//                theTransactionCntl = new TransactionCntl(this, username, currentCategoryList, currentBudgetList, false);
//            }
//            currentTransactionList = theTransactionCntl.getCurrentTransactionList();
//        }
        theAnalyticsCntl = new AnalyticsCntl(this, username, currentBudgetList, currentCategoryList, currentTransactionList, true);
    }
    
    public void analyticsToNav(AnalyticsCntl ac, String u, boolean save)
    {
        System.out.println("NavigationCntl.budgetToNav");
        theAnalyticsCntl = ac;
        username = u;
        if(save)
        {
            saveUpdates();
        }
        else
        {
            showNavigationUI();
        }
    }
    
    
    //notifications
    public void getNewNotificationsNum()
    {
        System.out.println("NavigationCntl.getNewNotificationsNum");
        notificationCntl = new NotificationCntl(this, false, true);
        notificationSize = notificationCntl.numNew();
    }
    
    public void showNotifications()
    {
        System.out.println("NavigationCntl.showNotifications");
        notificationCntl.showNotificationNavUI(this);
    }
    
    public void notificationToNav(NotificationCntl nc, int ns, boolean save)
    {
        System.out.println("NavigationCntl.notificationToNav");
        notificationCntl = nc;
        notificationSize = ns;
        if(save)
        {
            saveUpdates();
        }
        else
        {
            showNavigationUI();
        }
    }
}
