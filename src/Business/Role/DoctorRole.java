/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.DoctorWorkArea.DoctorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public class DoctorRole extends Role{
    //overriding main panel with doctore work area whenever doctor role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new DoctorWorkArea(userProcessContainer,account,(DoctorOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.Doctor.getValue();
}

}
