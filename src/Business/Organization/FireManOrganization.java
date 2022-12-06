/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.FireMan.FireManDirectory;
import Business.Role.FireManRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author wadhwa
 */
public class FireManOrganization extends Organization{
    FireManDirectory fireman_list;
    //constructor to add fireman list to fireman directory
    public FireManOrganization(String f_name)
    {
        super(Organization.Type.FireMan.getValue());
        fireman_list=new FireManDirectory();
    }


    public FireManDirectory getFireman_list() {
        return fireman_list;
    }

    public void setFireman_list(FireManDirectory fireman_list) {
        this.fireman_list = fireman_list;
    }
    //hasmap to support fire man role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new FireManRole());
       return role;
       
    } 
}
