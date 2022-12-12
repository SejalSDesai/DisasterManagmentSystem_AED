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
import UI.SystemAdmin.SystemAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class SystemAdminRole extends Role {
    //overriding main panel with system admin work area whenever system admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
       return new SystemAdminWorkArea(userProcessContainer,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SystemAdmin.getValue();
}
}

