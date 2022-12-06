/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.EventMakerAdminRole;
import Business.Role.Role;
import Business.Role.VolunteerAdminRole;
import java.util.HashSet;
import Business.Role.VictimAdminRole;

/**
 *
 * @author wadhwa
 */
public class CommunityEnterprise extends Enterprise{
    public CommunityEnterprise(String ent_name){
        super(ent_name,Enterprise.EnterpriseType.Community);
    }
    //Hash map to add rolesss
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new EventMakerAdminRole());
              
        role.add(new VictimAdminRole());
        
        role.add(new VolunteerAdminRole());
       
        return role;
        
    }
}
