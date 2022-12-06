/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FireMan;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author wadhwa
 */
public class FireMan {
    private String f_name;
    private static int Count=1;
    private String f_id;
    private WorkQueue work_queue;
    //Fire man constructor which automatically generates id
    public FireMan() {
        
        f_id = "FireMan"+(++Count);
        work_queue= new WorkQueue();
    }
    
    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        FireMan.Count = Count;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getF_id() {
        return f_id;
    }

    public void setF_id(String f_id) {
        this.f_id = f_id;
    }

    public WorkQueue getWork_queue() {
        return work_queue;
    }

    public void setWork_queue(WorkQueue work_queue) {
        this.work_queue = work_queue;
    }
       
    
        @Override
    public String toString(){
        return f_name;
    }
}
