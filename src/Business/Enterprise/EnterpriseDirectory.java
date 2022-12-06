/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author wadhwa
 */
public class EnterpriseDirectory {
    
private ArrayList<Enterprise> enterprise_list;
    
    public EnterpriseDirectory()
    {
        enterprise_list = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterprise_list() {
        return enterprise_list;
    }
    //Creaye and add new enterprises
    public Enterprise createAndAddEnterprise(String ent_name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Community){
            enterprise = new CommunityEnterprise(ent_name);
            enterprise_list.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Provider){
            enterprise= new ProviderEnterprise(ent_name);
            enterprise_list.add(enterprise);
        }
         else if(type == Enterprise.EnterpriseType.NGO){
            enterprise= new NGOEnterprise(ent_name);
            enterprise_list.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Police){
            enterprise= new PoliceEnterprise(ent_name);
            enterprise_list.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Hospital){
            enterprise= new HospitalEnterprise(ent_name);
            enterprise_list.add(enterprise);
         } 
            else if(type == Enterprise.EnterpriseType.FireMan){
            enterprise= new FireManEnterprise(ent_name);
            enterprise_list.add(enterprise);
         }
        return enterprise;
        
    }
   
    
}


