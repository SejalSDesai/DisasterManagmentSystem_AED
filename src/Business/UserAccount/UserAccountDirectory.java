/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sej
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList=new ArrayList<>();
        
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    //aunthenticaye a user
    public UserAccount authenticateUser(String username, String password){
        for(UserAccount ua:userAccountList){
            if(ua.getUsername().equals(username)&& ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    //create new user 
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    //useername unique check
    public boolean checkIfUsernameIsUnique(String username){
        for(UserAccount ua: userAccountList)
            if(ua.getUsername().equals(username)){
                return false;
            }
        return true;
    }
    
    
}
