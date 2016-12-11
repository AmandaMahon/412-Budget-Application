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
public class NotificationCntl {
    NavigationCntl parent;
    NotificationNavUI notificationNavUI;
    NotificationList theNotificationList;
    NotificationListUI notificationListUI;
    NotificationUI notificationUI;
    Notification theNotification;
    String notificationType;
    double percent;
    Budget budget;
    Category category;
    
    //constructor new notifcation
//    public NotificationCntl(NavigationCntl p, String nt, double pt, Budget b, Category c)
//    {
//        parent = p;
//        notificationType = nt;
//        percent = pt;
//        budget = b;
//        category = c;
//        
//        if(theNotificationList == null) { createTestData(); }
//    }
    
    //constructor show notifcation UI
    public NotificationCntl(NavigationCntl p, boolean showUI, boolean createTests)
    {
        System.out.println("NotificationCntl.constructor1");
        parent = p;
        
        if(createTests)
        {
            if(theNotificationList == null) { createTestData(); }
        }
        if(showUI == true) { showNotificationNavUI(parent); }
        if(showUI == false) { numNew(); }
    }
    
    public void createNotification(NavigationCntl p, String b, String c, double currentA, 
            double percent, double a, String type)
    {
        System.out.println("NotificationCntl.createNotification");
        int size = theNotificationList.getNotificationList().size() + 1;
        theNotification = new Notification(b, c, size, currentA, percent, a, false, type);
        theNotificationList.addNotification(theNotification);
    }
    
    public int numNew()
    {
        System.out.println("NotificationCntl.numNew");
        return theNotificationList.getNewSize();
    }
    
    //test data
    public void createTestData()
    {
        System.out.println("NotificationCntl.createTestData");
        
        ArrayList<Notification> tempAL = new ArrayList<Notification>();
        int tempSize = tempAL.size()+1;
        theNotification = new Notification("Test Budget 1", "Test Category 1", tempSize, 0.00, 0, 1000.00, false, "bud");
        tempAL.add(theNotification);
        
        tempSize++;
        theNotification = new Notification("Test Budget 1", "Test Category 1", tempSize, 50.00, 10, 500.00, false, "cat");
        tempAL.add(theNotification);
        
        tempSize++;
        theNotification = new Notification("Test Budget 1", "Test Category 2", tempSize, 125.00, 50, 250.00, true, "cat");
        tempAL.add(theNotification);
        
        tempSize++;
        theNotification = new Notification("Test Budget 2", "Test Category 3", tempSize, 100.00, 33.33, 300.00, true, "cat");
        tempAL.add(theNotification);
        
        tempSize++;
        theNotification = new Notification("Test Budget 2", "Test Category 3", tempSize, 100.00, 20, 500.00, false, "bud");
        tempAL.add(theNotification);
        
        theNotificationList = new NotificationList(tempAL);
    }
    
    public void showNotificationNavUI(NavigationCntl p)
    {
        System.out.println("NotificationCntl.showNotificationNavUI");
        parent = p;
        notificationNavUI = new NotificationNavUI(this, theNotificationList.getNewSize());
        notificationNavUI.setVisible(true);
    }
    
    public void showNotificationListUI(String type)
    {
        System.out.println("NotificationCntl.showNotificationListUI");
        if(type.equals("new"))
        {
            notificationListUI = new NotificationListUI(this, "new", theNotificationList.getNotificationList_New());
            notificationListUI.setVisible(true);
        }
        else if(type.equals("read"))
        {
            notificationListUI = new NotificationListUI(this, "read", theNotificationList.getNotificationList_Read());
            notificationListUI.setVisible(true);        
        }
        
    }
    
    public void showSelectedNotification(NotificationListUI nl, int idNumber)
    {
        System.out.println("NotificationCntl.showSelectedNotification");
        notificationListUI = nl;
        ArrayList<Notification> tempAL = theNotificationList.getNotificationList();
        for(int i = 0; i<tempAL.size(); i++)
        {
            if(idNumber == tempAL.get(i).getID())
            {
                tempAL.get(i).setRead(true);
                theNotificationList.setNotificationList(tempAL);
                notificationUI = new NotificationUI(this, theNotificationList.getNotificationList().get(i));
                notificationUI.setVisible(true);
            }
        }
    }
    
    public void toNavigationUI()
    {
        System.out.println("NotificationCntl.toNavigationUI");
        parent.notificationToNav(this, theNotificationList.getNewSize(), false);
    }
    
    public boolean saveNotifications()
    {
        System.out.println("NotificationCntl.saveNotifications");
        return theNotificationList.saveNotifications();
    }
    
    public boolean loadNotifications()
    {
        System.out.println("NotificationCntl.loadNotifications");
        return theNotificationList.loadNotifications();
    }
    
    public void closeWindow()
    {
        System.out.println("NotificationCntl.closeWindow");
        parent.notificationToNav(this, theNotificationList.getNewSize(), true);
    }
}
