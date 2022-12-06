/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FireManOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.FireManWorkArea.FireManWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class FireManRole extends Role{
    //overriding main panel with fireman work area whenever fireman role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new FireManWorkArea(userProcessContainer,account,(FireManOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.FireManRole.getValue();
}

}
