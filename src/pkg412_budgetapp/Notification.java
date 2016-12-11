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
        System.out.println("Notification.constructor1");
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
        System.out.println("Notification.createMessage");
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
    
    public void setBudgetName(String bn) { System.out.println("Notification.setBudgetName"); budgetName = bn; }
    public void setCategoryName(String cn) { System.out.println("Notification.setCategoryName"); categoryName = cn; }
    public void setID(int id) { System.out.println("Notification.setID"); ID = id; }
    public void setMessage(String m) { System.out.println("Notification.setMessage"); message = m; }
    public void setAmount(double a) { System.out.println("Notification.setAmount"); amount = a; }
    public void setPercent(double p) { System.out.println("Notification.setPercent"); percent = p; }
    public void setTotal(double t) { System.out.println("Notification.setTotal"); total = t; }
    public void setRead(Boolean r) { System.out.println("Notification.setRead"); read = r; }
    public void setNotificationType(String nt) { System.out.println("Notification.setNotificationType"); notificationType = nt; createMessage(); }
    
    public String getBudgetName() { System.out.println("Notification.getBudgetName"); return budgetName; }
    public String getCategoryName() { System.out.println("Notification.getCategoryName"); return categoryName; }
    public int getID() { System.out.println("Notification.getID"); return ID; }
    public String getMessage() { System.out.println("Notification.getMessage"); return message; }
    public double getAmount() { System.out.println("Notification.getAmount"); return amount; }
    public double getPercent() { System.out.println("Notification.getPercent"); return percent; }
    public double getTotal() { System.out.println("Notification.getTotal"); return total; }
    public Boolean getRead() { System.out.println("Notification.getRead"); return read; }
    public String getNotificationType() { System.out.println("Notification.getNotificationType"); return notificationType; }
    
}
