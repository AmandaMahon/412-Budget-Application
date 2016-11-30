/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/**
 *
 * @author aim5627
 */
public class CategoryList {
    private final String JSON_FNAME = "categories.json";
    private ArrayList<Category> categories;
    
    public CategoryList(ArrayList<Category> c)
    {
        System.out.println("CategoryList.constructor");
        categories = c;
    }
    
    public void setCategories(ArrayList<Category> c) { 
        System.out.println("CategoryList.setCategories");
        categories = c; 
    }
    public ArrayList<Category> getCategories() { 
        System.out.println("CategoryList.getCategories");
        return categories; 
    }
    
    public void addCategory(Category c)
    {
        System.out.println("CategoryList.addCategory");
        categories.add(c);
    }
    
    public void removeCategory(int position)
    {
        System.out.println("CategoryList.removeCategory");
        categories.remove(position);
    }
    
    // save category list to JSON for later use
    public Boolean saveCategories() {
        try (Writer writer = new FileWriter(JSON_FNAME)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(this.categories, writer);
            return true;
        }
        catch (IOException io) {
            return false;
        }
    }
    
    // load category list from JSON, or return false if not found
    public boolean loadCategories() {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FNAME))) {
            Gson gson = new GsonBuilder().create();
            Type listOfCategories = new TypeToken<ArrayList<Category>>(){}.getType();
            this.categories = gson.fromJson(br, listOfCategories);
            return true;
        }
        catch (IOException io) {
            return false;
        }
    }
}
