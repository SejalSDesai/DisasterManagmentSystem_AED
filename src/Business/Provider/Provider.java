/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Provider;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author wadhwa
 */
public class Provider {
    private String s_name;
    private static int sCount=1;
    private String supplier_id;
    private WorkQueue workQueue;
    private ItemDirectory itemDirectory;
    private Item item;
    //provider class constructor to update ids, work queue and item directory
    public Provider() {
        
        supplier_id = "SUP"+(++sCount);
        workQueue= new WorkQueue();
        itemDirectory = new ItemDirectory();
        item = new Item();
    }
    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public ItemDirectory getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(ItemDirectory itemDirectory) {
        this.itemDirectory = itemDirectory;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    @Override
    public String toString(){
        return s_name;
    }
}
