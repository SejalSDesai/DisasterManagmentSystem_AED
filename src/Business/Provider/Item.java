/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Provider;

/**
 *
 * @author wadhwa
 */
public class Item {
    private String item_id;
    private static int sCount=1;
    private int quantity;
    private String requirement_type;
    private String requirement;
    //item class constructor to autogenerate id
    public Item(){
        item_id="Item"+(+sCount);        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
    
    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
    
    public String getRequirement_type() {
        return requirement_type;
    }

    public void setRequirement_type(String requirement_type) {
        this.requirement_type = requirement_type;
    }
    
    @Override
    public String toString(){
        return getRequirement_type();
    }
    
}
