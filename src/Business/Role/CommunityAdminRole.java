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
import UI.CommunityEnterprise.CommunityAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class CommunityAdminRole extends Role{
    //overriding main panel with community admin work area whenever community admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new CommunityAdminWorkArea(userProcessContainer,enterprise,system);
    } 
        @Override
        public String toString()
{
   return Role.RoleType.CommunityAdminRole.getValue();
}

}
