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
public class TransactionCntl {
    
    NavigationCntl parent;
    String username;
    Transaction theTransaction;
    TransactionList theTransactionList;
    TransactionUI theTransactionUI;
    ArrayList<Category> categoryList;
    ArrayList<Budget> budgetList;
    int currentPosition;
    Category currentCategory;
    //Budget currentBudget;
    
    
    public TransactionCntl(NavigationCntl p, String u, ArrayList<Category> cAL, ArrayList<Budget> bAL, String noShow)
    {
        System.out.println("TransactionCntl.constructor1");
        parent = p;
        username = u;
        categoryList = cAL;
        budgetList = bAL;
        
        
        if(theTransactionList == null)
        {
            ArrayList<Transaction> tempTL = new ArrayList<Transaction>();
            //(String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr)
            theTransaction = new Transaction("Test Transaction 1", 51.25, "withdraw", "Test Category 1", 10, 28, 2016, "Target", "bought clothing");
            tempTL.add(theTransaction);
            theTransaction = new Transaction("Test Transaction 2", 25.75, "withdraw", "Test Category 2", 10, 28, 2016, "Walmart", "bought food");
            tempTL.add(theTransaction);
            theTransaction = new Transaction("Test Transaction 3", 10.00, "return", "Test Category 2", 10, 29, 2016, "Walmart", "returned food");
            tempTL.add(theTransaction);
            theTransactionList = new TransactionList(tempTL);
        }
    }
    
    public TransactionCntl(NavigationCntl p, String u, ArrayList<Category> cAL, ArrayList<Budget> bAL)
    {
        System.out.println("TransactionCntl.constructor1");
        parent = p;
        username = u;
        categoryList = cAL;
        budgetList = bAL;
        
        if(theTransactionList == null)
        {
            ArrayList<Transaction> tempTL = new ArrayList<Transaction>();
            //(String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr)
            theTransaction = new Transaction("Test Transaction 1", 51.25, "withdraw", "Test Category 1", 10, 28, 2016, "Target", "bought clothing");
            tempTL.add(theTransaction);
            theTransaction = new Transaction("Test Transaction 2", 25.75, "withdraw", "Test Category 2", 10, 28, 2016, "Walmart", "bought food");
            tempTL.add(theTransaction);
            theTransaction = new Transaction("Test Transaction 3", 10.00, "return", "Test Category 2", 10, 29, 2016, "Walmart", "returned food");
            tempTL.add(theTransaction);
            theTransactionList = new TransactionList(tempTL);
        }
        
        showTransactionUI();
    }
    
    public void showTransactionUI()
    {
        System.out.println("TransactionCntl.showTransaction");
        theTransactionUI = new TransactionUI(this, username, categoryList);
        theTransactionUI.setVisible(true);
    }
    
    public void hideTransactionUI()
    {
        theTransactionUI.setVisible(true);
    }
    
    public void newTransaction(String n, double a, String tt, String cn, int m, int d, int y, String pl, String descr)
    {
        theTransaction = new Transaction(n, a, tt, cn, m, d, y, pl, descr);
        theTransactionList.addTransaction(theTransaction);
        currentPosition = 0;
        
        for(int i = 0; i<categoryList.size(); i++)
        {
            if(cn.equals(categoryList.get(i).getName()))
            {
                currentPosition = i;
                double catAmount = categoryList.get(i).getCurrentAmount();
                if(tt.equals("return"))
                {
                    catAmount = catAmount + a;
                }
                else if(tt.equals("withdraw"))
                {
                    catAmount = catAmount - a;
                }
                
                categoryList.get(i).setCurrentAmount(catAmount);
                if(catAmount < 0)
                {
                    JOptionPane.showMessageDialog(null, "The category amount is less than 0", "Category Amount", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "New Transaction Created", "Transaction Created", JOptionPane.INFORMATION_MESSAGE);
        checkForNotifications();
        //parent.TransactionToNavigation(this, categoryList, theTransactionList.getTransactionList());
    }
    
    public void checkForNotifications()
    {
        //get category percent
        currentCategory = categoryList.get(currentPosition);
        double categoryPercentage = (currentCategory.getCurrentAmount() / currentCategory.getAmount()) * 100;
        if(categoryPercentage < 50)
        {
            parent.createNotifications(this, currentCategory.getBudgetName(), currentCategory.getName(),
                    currentCategory.getCurrentAmount(), categoryPercentage, currentCategory.getAmount(),
                    "cat", budgetList, categoryList, theTransactionList.getTransactionList());
        }
        
        //get budget percent
        Budget currentBudget = budgetList.get(0);
        double budgetAmountSaved = 0;
        for(int i = 0; i<budgetList.size(); i++)
        {
            String budgetName = budgetList.get(i).getName();
            String categoryBudget = currentCategory.getBudgetName();
            if(budgetName.equals(categoryBudget))
            {
                currentBudget = budgetList.get(i);
            }
        }
        for(int i = 0; i<categoryList.size(); i++)
        {
           if(categoryList.get(i).getBudgetName().equals(currentBudget.getName()))
           {
               budgetAmountSaved += categoryList.get(i).getCurrentAmount();
           }
        }
        currentBudget.setCurrentAmount(budgetAmountSaved);
        double budgetSpent = currentBudget.getAmount() - budgetAmountSaved;
        double budgetPercentage = (budgetSpent / currentBudget.getAmount())*100;
        if(budgetPercentage < 50)
        {
            parent.createNotifications(this, currentBudget.getName(), currentCategory.getName(),
                    currentBudget.getCurrentAmount(), budgetPercentage, currentBudget.getAmount(),
                    "bud", budgetList, categoryList, theTransactionList.getTransactionList());
        }
        
    }
    
    public ArrayList<Transaction> getCurrentTransactionList()
    {
        return theTransactionList.getTransactionList();
    }
    
    public void backToMain()
    {
        parent.TransactionToNavigation(this, categoryList, theTransactionList.getTransactionList());
    }
    
    public boolean saveTransactions()
    {
        return theTransactionList.saveTransactions();
    }
    
    public boolean loadTransactions()
    {
        return theTransactionList.loadTransactions();
    }
}
