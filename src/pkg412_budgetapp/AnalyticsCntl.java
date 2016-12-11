package pkg412_budgetapp;

import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public AnalyticsCntl(NavigationCntl p, String u, ArrayList<Budget> bl, 
            ArrayList<Category> cl, ArrayList<Transaction> tl, boolean showUI)
    {
        System.out.println("AnalyticsCntl.constructor1");
        parent = p;
        username = u;
        budgetList = bl;
        categoryList = cl;
        transactionList = tl;
        if(showUI)
        {
            showAnalytics_NavigationUI();
        }
    }
    
    public void showAnalytics_NavigationUI()
    {
        System.out.println("AnalyticsCntl.showAnalytics_NavigationUI");
        theAnalyticsNav = new Analytics_NavigationUI(this, username);
        theAnalyticsNav.setVisible(true);
    }
    
    public void showAnalytics_BudgetUI()
    {
        System.out.println("AnalyticsCntl.showAnalytics_BudgetUI");
        theBudgetUI = new Analytics_BudgetUI(this, username, budgetList, categoryList);
        theBudgetUI.setVisible(true);
    }
    
    public void showAnalytics_CategoryPurchasesUI()
    {
        System.out.println("AnalyticsCntl.showAnalytics_CategoryPurchasesUI");
        theCatPurchUI = new Analytics_CategoryPurchasesUI(this, username, budgetList, categoryList, transactionList);
        theCatPurchUI.setVisible(true);
    }
    
    public void showAnalytics_ChartsUI()
    {
        System.out.println("AnalyticsCntl.showAnalytics_ChartsUI");
        theChartsUI = new Analytics_ChartsUI(this, username);
        theChartsUI.setVisible(true);
    }
    
    public void backBtnPressed()
    {
        System.out.println("AnalyticsCntl.backBtnPressed");
        System.out.println("AnalyticsCntl.backBtnPressed");
        parent.analyticsToNav(this, username, false);
        
    }
    
    public ArrayList<Transaction> sortTransactions()
    {
        System.out.println("AnalyticsCntl.sortTransactions");
        ArrayList<Transaction> tempAL = new ArrayList<Transaction>();
        for(int i = 0; i<transactionList.size(); i++)
        {
            int month = transactionList.get(i).getMonth();
            int day = transactionList.get(i).getDay();
            int year = transactionList.get(i).getYear();
            
            if(i == 0)
            {
                tempAL.add(transactionList.get(i));
            }
            else
            {
                for(int j = 0; j<tempAL.size(); j++)
                {
                    int testInt = j+1;
                    int originalID = transactionList.get(i).getID();
                    int currentID = tempAL.get(j).getID();
                    if(originalID != currentID)
                    {
                        int currentMonth = tempAL.get(j).getMonth();
                        int currentDay = tempAL.get(j).getDay();
                        int currentDay2 = 0;
                        if(testInt != tempAL.size())
                        {
                            currentDay2= tempAL.get(j+1).getDay();
                        }
                        int currentYear = tempAL.get(j).getYear();

                        if(year < currentYear)
                        {
                            tempAL.add(j, transactionList.get(i));
                        }
                        else if(year == currentYear)
                        {
                            if(month < currentMonth)
                            {
                                tempAL.add(j, transactionList.get(i));
                            }
                            else if(month == currentMonth)
                            {
                                if(day < currentDay)
                                {
                                    tempAL.add(j, transactionList.get(i));
                                }
                                else if(day == currentDay)
                                {
                                    tempAL.add(j+1, transactionList.get(i));
                                }
                                else if(day > currentDay && day < currentDay2)
                                {
                                    tempAL.add(j+1, transactionList.get(i));
                                }
                            }
                        }
                        else if(testInt == tempAL.size())
                        {
                            tempAL.add(transactionList.get(i));                       
                        }
//                        else if(year > currentYear)
//                        {
//                            tempAL.add(transactionList.get(i));
//                        }
                    }
                }
            }
        }
        return tempAL;
    }
    
    public void writeHistory()
    {
        System.out.println("AnalyticsCntl.writeHistory");
        try
        {
            //ArrayList<Transaction> sortedList = sortTransactions();
            ArrayList<Transaction> sortedList = transactionList;
            String currentTransaction = "";
            String currentTitle = "";
            PrintWriter pw = new PrintWriter("history.txt");
            for(int i = 0; i<budgetList.size(); i++)
            {
                System.out.println(budgetList.get(i).getName());
                currentTitle = budgetList.get(i).getName() + ":";
                pw.println(currentTitle);
                currentTitle = "";
                for(int j = 0; j<categoryList.size(); j++)
                {
                    String categoryBudgetName = categoryList.get(j).getBudgetName();
                    if(categoryBudgetName.equals(budgetList.get(i).getName()))
                    {
                        currentTitle += "\t" + categoryList.get(j).getName() + ":";
                        pw.println(currentTitle);
                        for(int k = 0; k<sortedList.size(); k++)
                        {
                            String transCategoryName = sortedList.get(k).getCategoryName();
                            if(transCategoryName.equals(categoryList.get(j).getName()))
                            {
                                String Tname = sortedList.get(k).getName();
                                String Tamount = "$" + String.valueOf(sortedList.get(k).getAmount());
                                String Ttype = sortedList.get(k).getTransactionType().toUpperCase();
                                String Tdate = sortedList.get(k).getMonth() + "/"
                                        + sortedList.get(k).getDay() + "/" 
                                        + sortedList.get(k).getYear();
                                String Tlocation = sortedList.get(k).getPurchaseLocation();
                                String Tdescr = sortedList.get(k).getDescription();
                                
                                currentTransaction = "[" + Ttype + "] Date: " + Tdate + ", Name: " 
                                        + Tname + ", Amount: " + Tamount + ", Purchase Location: " + Tlocation
                                        + ", Description: " + Tdescr;
                                pw.println("\t\t" + currentTransaction);
                                currentTransaction = "";
                                currentTitle = "";
                            }
                        }
                    }
                }
            }
            
            pw.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public void closeWindow()
    {
        System.out.println("AnalyticsCntl.closeWindow");
        parent.analyticsToNav(this, username, true);
    }
}
