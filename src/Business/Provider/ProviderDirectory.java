/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Provider;

import java.util.ArrayList;

/**
 *
 * @author wadhwa
 */
public class ProviderDirectory {
    private ArrayList<Provider> providerList;
    
    
    public ProviderDirectory() {
        providerList=new ArrayList<>();
        
    }

    public ArrayList<Provider> getProviderList() {
        return providerList;
    }

    public void setProviderList(ArrayList<Provider> providerList) {
        this.providerList = providerList;
    }
    //add a new provider
    public Provider addSupplier(){
        Provider s= new Provider();
        providerList.add(s);
        return s;
    }
    //remove a provider
    public void removeSupplier(Provider s){
        providerList.remove(s);
    }
}
