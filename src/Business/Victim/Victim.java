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
    private String name;
    private String id;
    private WorkQueue workqueue;
    
    private static int count=1;
    //victim class constructor to autogenerate id
     public Victim(){
         
        id= "Victim"+(++count);
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }
 
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
     @Override
     public String toString(){
         return name;
     }
}
