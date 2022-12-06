/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.HashSet;

/**
 *
 * @author wadhwa
 */


public abstract class Organization {
    
    private String name;
    private String orgName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationCode;
    private static int count=1;
    public HashSet<Role> role;
    //enums for types of organization
    public enum Type {
        Victim("Victim Organization"),
        EventMaker("EventMaker Organization"),
        Volunteer("Volunteer Organization"),
        NGO("NGO Organization"),
        Provider("Provider"),
        Doctor("Doctor"),
        Police("Police"),
        FireMan("FireMan");
        
        private String value;
        private Type(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    //constructor to update work queues, employee directory and user account
    public Organization (String name)
    {
      this.name = name;
      workQueue = new WorkQueue();
      employeeDirectory = new EmployeeDirectory();
      userAccountDirectory = new UserAccountDirectory();
     
      organizationCode = count;
      role = new HashSet<>();
      ++count;        
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    public abstract HashSet<Role> getSupportedRole();


    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
     public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public int getOrganizationCode() {
        return organizationCode;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}











