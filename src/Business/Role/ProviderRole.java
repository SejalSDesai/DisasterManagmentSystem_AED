/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ProviderOrganization;
import Business.UserAccount.UserAccount;
import UI.Provider.ProviderWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class ProviderRole extends Role{
    //overriding main panel with provider work area whenever provider role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new ProviderWorkArea(userProcessContainer,account,(ProviderOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.ProviderRole.getValue();
}


}
