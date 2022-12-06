/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VictimOrganization;
import Business.UserAccount.UserAccount;
import UI.EventSeekerWorkArea.EventSeekerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class VictimRole extends Role{
    //overriding main panel with victim work area whenever victim role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new EventSeekerWorkArea(userProcessContainer,account,(VictimOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.Victim.getValue();
}

}
