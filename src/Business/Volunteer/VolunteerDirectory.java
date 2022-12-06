/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author sej
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volList;

    public VolunteerDirectory() {
        volList= new ArrayList<>();
        
    }

    public ArrayList<Volunteer> getvolList() {
        return volList;
    }

    public void setvolList(ArrayList<Volunteer> volList) {
        this.volList = volList;
    }
    //add a new volunteer
    public Volunteer addVolunteer(){
    
        Volunteer v = new Volunteer();
        volList.add(v);
        return v;
    }
    //remove a volunteer
    public void removeVolunteer(Volunteer v){
        volList.remove(v);
    }

}
