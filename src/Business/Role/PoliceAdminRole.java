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
import UI.PoliceEnterprise.PoliceAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class PoliceAdminRole extends Role{
    //overriding main panel with police admin work area whenever police admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new PoliceAdminWorkArea(userProcessContainer,enterprise,system);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.PoliceAdminRole.getValue();
}

}
