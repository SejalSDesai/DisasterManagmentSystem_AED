/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.NGOManager.NGOManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class NGOManagerRole extends Role{
    //overriding main panel with NGO Manager work area whenever NGO Manager role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new NGOManagerWorkArea(userProcessContainer,account,(NGOOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.NGOManagerRole.getValue();
}

}
