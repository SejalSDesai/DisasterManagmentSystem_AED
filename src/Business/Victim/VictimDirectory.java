/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Victim;

import java.util.ArrayList;

/**
 *
 * @author ruchi
 */
public class VictimDirectory {
    private ArrayList<Victim> vicDirectory;

    public VictimDirectory() {
        vicDirectory=new ArrayList<>();
        
    }

    public ArrayList<Victim> getVictimDirectory() {
        return vicDirectory;
    }

    public void setVictimDirectory(ArrayList<Victim> vicDirectory) {
        this.vicDirectory = vicDirectory;
    }
    //add a new victim
    public Victim addVictim(){
        Victim cs= new Victim();
        vicDirectory.add(cs);
        return cs;
    }
    //remove a victim
    public void removeVictim(Victim cs){
        vicDirectory.remove(cs);
    }
}
