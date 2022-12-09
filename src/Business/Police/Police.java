/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Police;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author ruchi
 */
public class Police {
    private String polName;
    private static int c=1;
    private String polId;
    private WorkQueue workQueue;
    //Police class constructor to autogenerate id
    public Police() {
        
        polId = "police"+(++c);
        workQueue= new WorkQueue();
    }
    
    public static int getCount() {
        return c;
    }

    public static void setCount(int c) {
        Police.c = c;
    }
    
    public String getName() {
        return polName;
    }

    public void setName(String polName) {
        this.polName = polName;
    }

    public String getPoliceId() {
        return polId;
    }

    public void setPoliceId(String polId) {
        this.polId = polId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
          
    @Override
    public String toString(){
        return polName;
    }
}
