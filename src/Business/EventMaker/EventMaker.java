/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EventMaker;

/**
 *
 * @author sej
 */
public class EventMaker {
    private String evenName;
    private String evenid;
    private WorkQueue workQueue;
    
    private static int c=1;
    //Event maker class constructor
     public EventMaker(){
         
        evenid= "EM"+(++c);
        workQueue=new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getevenid() {
        return evenid;
    }

    public void setevenid(String evenid) {
        this.evenid = evenid;
    }
     
    public String getevenName() {
        return evenName;
    }

    public void setevenName(String evenName) {
        this.evenName = evenName;
    }

     @Override
     public String toString(){
         return evenName;
     }
    
}
