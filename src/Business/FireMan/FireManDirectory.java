/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FireMan;

import java.util.ArrayList;

/**
 *
 * @author wadhwa
 */
public class FireManDirectory {
    private ArrayList<FireMan> fireman_list;

    public FireManDirectory() {
        fireman_list=new ArrayList();
        
    }

    public ArrayList<FireMan> getFireman_list() {
        return fireman_list;
    }

    public void setPoliceList(ArrayList<FireMan> fireManList) {
        this.fireman_list = fireManList;
    }
    
    //add new fire man
    public FireMan addFireMan(){
        FireMan l= new FireMan();
        fireman_list.add(l);
        return l;
    }
    //remove a fire man
    public void removeFireMan(FireMan l){
        fireman_list.remove(l);
    }
}
