/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author wadhwa
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    //creates new organizations and adds them to directory
    public Organization createOrganization(Organization.Type type,String name)
    {
    Organization organization = null;
        if (type.getValue().equals(Organization.Type.EventMaker.getValue())){
            
            organization = new EventMakerOrganization();
            organization.setOrg_name(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Victim.getValue())){
            organization = new VictimOrganization();
            organization.setOrg_name(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.NGO.getValue())){
            organization = new NGOOrganization();
            organization.setOrg_name(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Provider.getValue())){
            organization = new ProviderOrganization(name);
            organization.setOrg_name(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Volunteer.getValue())){
            organization = new VolunteerOrganization(name);
            organization.setOrg_name(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Police.getValue())){
            organization = new PoliceOrganization(name);
            organization.setOrg_name(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setOrg_name(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FireMan.getValue())){
            organization = new FireManOrganization(name);
            organization.setOrg_name(name);
            organizationList.add(organization);
        }
        
        return organization;
    }

    
}
