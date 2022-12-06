/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.NGO.NGODirectory;
import Business.Role.NGOManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author wadhwa
 */
public class NGOOrganization extends Organization{
    NGODirectory ngolist;
    //constructor to add NGO list to NGO directory
    public NGOOrganization()
    {
        super(Organization.Type.NGO.getValue());
        ngolist=new NGODirectory();
    }

    public NGODirectory getNgolist() {
        return ngolist;
    }

    public void setNgolist(NGODirectory ngolist) {
        this.ngolist = ngolist;
    }
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new NGOManagerRole());
       return role;
       
    }
}
