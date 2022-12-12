/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Hospital.HospitalDirectory;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author wadhwa
 */
public class DoctorOrganization extends Organization{
    HospitalDirectory doctor_list;
    //constructor to add doctor list to hospital directory
    public DoctorOrganization()
    {
        super(Organization.Type.Doctor.getValue());
        doctor_list= new HospitalDirectory();
    }

    public HospitalDirectory getHospitallist() {
        return doctor_list;
    }

    public void setHospitallist(HospitalDirectory doctorList) {
        this.doctor_list = doctorList;
    }
    
    //hashmap to support doctor role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DoctorRole());
       return role;
    }
    
}
