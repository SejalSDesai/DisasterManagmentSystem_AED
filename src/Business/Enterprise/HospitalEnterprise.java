/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author wadhwa
 */
public class HospitalEnterprise extends Enterprise{
    public HospitalEnterprise(String ent_name){
        super(ent_name,Enterprise.EnterpriseType.Hospital);
    }
    //hash map to for Doctor role addition
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new DoctorRole());
     
        return role;
        
    }
}
