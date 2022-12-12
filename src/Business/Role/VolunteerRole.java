/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.UserAccount;
import UI.VolunteerOrganization.DashboardVolunteer;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class VolunteerRole extends Role{
    //overriding main panel with volunteer work area whenever volunteer role is called
        @Override
        public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system)
        {
            return new DashboardVolunteer(userProcessContainer,account,(VolunteerOrganization)organization,enterprise,system);
        }   
        @Override
        public String toString()
{
   return Role.RoleType.VolunteerRole.getValue();
}
}
