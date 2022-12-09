/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGO;

import java.util.ArrayList;

/**
 *
 * @author ruchi
 */
public class NGODirectory {
    private ArrayList<NGO> ngodirectory;

    public NGODirectory() {
    ngodirectory= new ArrayList<>();
    }

    public ArrayList<NGO> getNgodirectory() {
        return ngodirectory;
    }

    public void setNgodirectory(ArrayList<NGO> ngodirectory) {
        this.ngodirectory = ngodirectory;
    }
    //add a NGO
    public NGO addNGO(){
        NGO ngo =new NGO();
        ngodirectory.add(ngo);
        return ngo;
    }
    //remove a NGO
    public void removeNGO(NGO ngo){
        ngodirectory.remove(ngo);   
    
}
