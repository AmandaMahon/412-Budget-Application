/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;

/**
 *
 * @author aim5627
 */
public class TransactionList {
    private final String JSON_FNAME = "transactions.json";
    ArrayList<Transaction> transactionList;
    
    public TransactionList(ArrayList<Transaction> tl)
    {
        System.out.println("TransactionList.constructor1");
        transactionList = tl;
    }
    
    public void setTransactionList(ArrayList<Transaction> tl)
    {
        System.out.println("TransactionList.setTransactionList");
        transactionList = tl;
    }
    
    public ArrayList<Transaction> getTransactionList()
    {
        System.out.println("TransactionList.getTransactionList");
        return transactionList;
    }
    
    public void addTransaction(Transaction t)
    {
        System.out.println("TransactionList.addTransaction");
        transactionList.add(t);
    }
    
    public void removeTransaction(int position)
    {
        System.out.println("TransactionList.removeTransaction");
        transactionList.remove(position);
    }

    // save list to JSON for later use
    public Boolean saveTransactions() {
        System.out.println("TransactionList.saveTransactions");
        try (Writer writer = new FileWriter(JSON_FNAME)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(this.transactionList, writer);
            return true;
        }
        catch (IOException io) {
            return false;
        }
    }
    
    // load list from JSON, or return false if not found
    public boolean loadTransactions() {
        System.out.println("TransactionList.loadTransactions");
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FNAME))) {
            Gson gson = new GsonBuilder().create();
            Type list = new TypeToken<ArrayList<Budget>>(){}.getType();
            this.transactionList = gson.fromJson(br, list);
            return true;
        }
        catch (IOException io) {
            return false;
        }
    }
}
