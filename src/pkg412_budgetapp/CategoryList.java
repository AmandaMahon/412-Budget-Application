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
public class CategoryList {
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
}
