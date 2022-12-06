/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventMakerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.EventMakerWorkArea.EventMakerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class EventMakerRole extends Role{
    //overriding main panel with event maker work area whenever event maker role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new EventMakerWorkArea(userProcessContainer,account,(EventMakerOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.EventMaker.getValue();
}

}
