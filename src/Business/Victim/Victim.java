/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Victim;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author ruchi
 */
public class Victim {
    private String vicName;
    private String vicId;
    private WorkQueue workqueue;
    
    private static int c=1;
    //victim class constructor to autogenerate vicId
     public Victim(){
         
        vicId= "Victim"+(++c);
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }
 
     
    public String getName() {
        return vicName;
    }
}
