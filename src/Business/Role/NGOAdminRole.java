/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.NGOEnterprise.NGOAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class NGOAdminRole extends Role{
    //overriding main panel with NGO admin work area whenever NGO admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new NGOAdminWorkArea(userProcessContainer,enterprise,system);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.NGOAdminRole.getValue();
}

  
}
