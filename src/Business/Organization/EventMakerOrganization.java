/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EventMaker.EventMakerDirectory;
import Business.Role.EventMakerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author wadhwa
 */
public class EventMakerOrganization extends Organization {
    
    EventMakerDirectory eventmaker_list;
    //constructor to add event maker list to Event Maker directory
    public EventMakerOrganization()
    {
        super(Organization.Type.EventMaker.getValue());
        eventmaker_list= new EventMakerDirectory();
    }

    public EventMakerDirectory getChangemakerlist() {
        return eventmaker_list;
    }

    public void setChangemakerlist(EventMakerDirectory eventmakerlist) {
        this.eventmaker_list = eventmakerlist;
    }
    
    //hash map to support event maker role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new EventMakerRole());
       return role;
       
    }
}
