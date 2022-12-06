/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author wadhwa
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospital_directory;
    
    public HospitalDirectory() {
    hospital_directory= new ArrayList();
    }

    public ArrayList<Hospital> getHospital_directory() {
        return hospital_directory;
    }

    public void setHospital_directory(ArrayList<Hospital> hospital_directory) {
        this.hospital_directory = hospital_directory;
    }
    //add a new doctor
    public Hospital addHospital(){
        Hospital hosp =new Hospital();
        hospital_directory.add(hosp);
        return hosp;
    }
    //remove a doctor
    public void removeHospital(Hospital hospital){
        hospital_directory.remove(hospital);   
    }
    
}
