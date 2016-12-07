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
public class NotificationList {
    
    ArrayList<Notification> theNotificationList;
    ArrayList<Notification> newNotificationList;
    ArrayList<Notification> readNotificationList;
    
    public NotificationList(ArrayList<Notification> nl)
    { 
        theNotificationList = nl; 
        sortList();
    }
    
    public void sortList()
    {
        ArrayList<Notification> tempNew = new ArrayList<Notification>();
        ArrayList<Notification> tempRead = new ArrayList<Notification>();
        
        for(int i = 0; i<theNotificationList.size(); i++)
        {
            if(theNotificationList.get(i).getRead() == false)
            {
                tempNew.add(theNotificationList.get(i));
            }
            else
            {
                tempRead.add(theNotificationList.get(i));
            }
        }
        
        newNotificationList = tempNew;
        readNotificationList = tempRead;
    }
      
    //main
    public void setNotificationList(ArrayList<Notification> nl)
    { 
        theNotificationList = nl; 
        sortList();
    }
        
    public void addNotification(Notification n)
    { 
        theNotificationList.add(n); 
        sortList();
    }
    
    public void deleteNotification(int position)
    { 
        theNotificationList.remove(position); 
        sortList();
    }
    
    public ArrayList<Notification> getNotificationList(){ return theNotificationList; }
    public int getNewSize() { return newNotificationList.size(); }
    
//    //new
//    public void setNotificationList_New(ArrayList<Notification> nnl){ newNotificationList = nnl; }        
    public ArrayList<Notification> getNotificationList_New(){ return newNotificationList; }
//    public void addNotification_New(Notification n){ newNotificationList.add(n); }
//    public void deleteNotification_New(int position){ newNotificationList.remove(position); }
//    
//    //read
//    public void setNotificationList_Read(ArrayList<Notification> nl){ readNotificationList = nl; }        
    public ArrayList<Notification> getNotificationList_Read(){ return readNotificationList; } 
//    public void addNotification_Read(Notification n){ readNotificationList.add(n); }    
//    public void deleteNotification_Read(int position){ readNotificationList.remove(position); }
}
