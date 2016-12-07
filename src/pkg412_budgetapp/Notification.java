/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412_budgetapp;

/**
 *
 * @author aim5627
 */
public class Notification {
    String budgetName;
    String categoryName;
    int ID;
    String message;
    double amount;
    double percent;
    double total;
    boolean read;
    String notificationType;
    
    public Notification(String bn, String cn, int id, double a, 
            double p, double t, boolean r, String nt)
    {
        budgetName = bn;
        categoryName = cn;
        ID = id;
        amount = a;
        percent = p;
        total = t;
        read = r;
        notificationType = nt;
        
        createMessage();
    }
    
    public void createMessage()
    {
        if(notificationType.equals("cat"))
        {
            message = "The category: " + categoryName.toUpperCase() + ", in budget: " + budgetName.toUpperCase()
                    + ", has " + percent + "% left, or $" + amount + " of $" + total + " left.";
        }
        
        else if(notificationType.equals("bud"))
        {
            message = "The budget: " + budgetName.toUpperCase() + ", has " + percent 
                    + "% left, or $" + amount + " of $" + total + " left.";
        }
    }
    
    public void setBudgetName(String bn) { budgetName = bn; }
    public void setCategoryName(String cn) { categoryName = cn; }
    public void setID(int id) { ID = id; }
    public void setMessage(String m) { message = m; }
    public void setAmount(double a) { amount = a; }
    public void setPercent(double p) { percent = p; }
    public void setTotal(double t) { total = t; }
    public void setRead(Boolean r) { read = r; }
    public void setNotificationType(String nt) { notificationType = nt; createMessage(); }
    
    public String getBudgetName() { return budgetName; }
    public String getCategoryName() { return categoryName; }
    public int getID() { return ID; }
    public String getMessage() { return message; }
    public double getAmount() { return amount; }
    public double getPercent() { return percent; }
    public double getTotal() { return total; }
    public Boolean getRead() { return read; }
    public String getNotificationType() { return notificationType; }
    
}
