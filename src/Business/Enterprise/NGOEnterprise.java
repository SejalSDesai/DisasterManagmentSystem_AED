/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.NGOManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author ruchi
 */
public class NGOEnterprise extends Enterprise {
    public NGOEnterprise(String name){
        super(name,Enterprise.EnterpriseType.NGO);
    }
    //hash map to for NGO role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new NGOManagerRole());
        return role;
    }
}
