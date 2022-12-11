/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ProviderManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidhi
 */
public class ProviderEnterprise extends Enterprise{
    public ProviderEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Provider);
        
    } 
    //hash map to for Provider role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        new ProviderManagerRole();
        return role;
        
    }
}
