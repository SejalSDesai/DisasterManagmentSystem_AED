/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Police;

import java.util.ArrayList;

/**
 *
 * @author ruchi
 */
public class PoliceDirectory {
     private ArrayList<Police> policeList;

    public PoliceDirectory() {
        policeList=new ArrayList();
        
    }

    public ArrayList<Police> getPoliceList() {
        return policeList;
    }

    public void setPoliceList(ArrayList<Police> policeList) {
        this.policeList = policeList;
    }
    
    //add a new police 
    public Police addPolice(){
        Police l= new Police();
        policeList.add(l);
        return l;
    }
    //remove police
    public void removePolice(Police l){
        policeList.remove(l);
    }
}
