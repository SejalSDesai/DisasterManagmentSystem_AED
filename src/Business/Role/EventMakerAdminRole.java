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
import UI.EventMaker.EventMakerAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class EventMakerAdminRole extends Role{
    //overriding main panel with event maker admin work area whenever event maker admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new EventMakerAdminWorkArea(userProcessContainer,/*account,(ChangeMakerOrganization)organization,*/enterprise/*,system*/);
    }
        @Override
        public String toString()
{
   return Role.RoleType.EventMakerAdmin.getValue();
}

}
