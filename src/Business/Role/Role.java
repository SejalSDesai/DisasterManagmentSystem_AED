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
import javax.swing.JPanel;

/**
 *
 * @author wadhwa
 */
public abstract class Role {
    //enums for types of roles
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        VictimAdmin("VictimAdmin"),
        Victim("Victim"),
        EventMakerAdmin("EventMakerAdmin"),
        EventMaker("EventMaker"),
        EnterPriseAdmin("EnterpriseAdmin"),
        CommunityAdminRole("CommunityAdminRole"),
        NGOAdminRole("NGOAdminRole"),
        NGOManagerRole("NGOManagerRole"),
        ProviderAdminRole("ProviderAdminRole"),
        ProviderManagerRole("ProviderManagerRole"),
        VolunteerAdminRole("VolunteerAdminRole"),
        VolunteerRole("VolunteerRole"),
        ProviderRole("ProviderRole"),
        PoliceRole("PoliceRole"),
        PoliceAdminRole("PoliceAdminRole"),
        DoctorAdminRole("DoctorAdminRole"),
        Doctor("Doctor"),
        FireManRole("FireManRole"),
        FireManAdminRole("FireManAdminRole");
        
        
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system);
    
    
    
}
