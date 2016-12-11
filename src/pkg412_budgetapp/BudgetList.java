/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author aim5627
 */
public class BudgetList {
    private final String JSON_FNAME = "budget.json";
    ArrayList<Budget> budgetList;
    
    public BudgetList(ArrayList<Budget> bl)
    {
       System.out.println("BudgetList.constructor");
       budgetList = bl; 
    }
    
    public void setBudgetList(ArrayList<Budget> bl) { budgetList = bl; System.out.println("BudgetList.setBL"); }
    public ArrayList<Budget> getBudgetList() { System.out.println("BudgetList.getBL"); return budgetList; }
    
    public void addBudget(Budget b)
    {
        System.out.println("BudgetList.addBudget");
        budgetList.add(b);
    }
    
    public void removeBudget(int position)
    {
        System.out.println("BudgetList.removeBudget");
        budgetList.remove(position);
    }

    // save list to JSON for later use
    public Boolean saveBudgets() {
       System.out.println("BudgetList.saveBudgets");
        try (Writer writer = new FileWriter(JSON_FNAME)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(this.budgetList, writer);
            return true;
        }
        catch (IOException io) {
            return false;
        }
    }
    
    // load list from JSON, or return false if not found
    public boolean loadBudgets() {
        System.out.println("BudgetList.loadBudgets");
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FNAME))) {
            Gson gson = new GsonBuilder().create();
            Type list = new TypeToken<ArrayList<Budget>>(){}.getType();
            this.budgetList = gson.fromJson(br, list);
            return true;
        }
        catch (IOException io) {
            return false;
        }
    }
}
