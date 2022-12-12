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
import UI.ProviderEnterprise.ProviderAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class ProviderAdminRole extends Role{
    //overriding main panel with provier admin work area whenever provider admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new ProviderAdminWorkArea(userProcessContainer,enterprise,system);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.ProviderAdminRole.getValue();
}
}
