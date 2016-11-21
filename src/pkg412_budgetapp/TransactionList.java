/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author aim5627
 */
public class TransactionList {
    
    ArrayList<Transaction> transactionList;
    
    public TransactionList(ArrayList<Transaction> tl)
    {
        transactionList = tl;
    }
    
    public void setTransactionList(ArrayList<Transaction> tl)
    {
        transactionList = tl;
    }
    
    public ArrayList<Transaction> getTransactionList()
    {
        return transactionList;
    }
    
    public void addTransaction(Transaction t)
    {
        transactionList.add(t);
    }
    
    public void removeTransaction(int position)
    {
        transactionList.remove(position);
    }
    
    // public void importTransactionList() { } // get a transaction list unless the file doesn't exist
    
    public void dumpTransactionList() // save whole transaction list
    {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(transactionList));
    }
}
