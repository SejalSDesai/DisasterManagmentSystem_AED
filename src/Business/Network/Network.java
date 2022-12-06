/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;
import Business.Enterprise.EnterpriseDirectory;



/**
 *
 * @author sej
 */
public class Network {
    private String netName;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network()
    {
     enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getnetName() {
        return netName;
    }

    public void setnetName(String netName) {
        this.netName = netName;
    }
    
    @Override
    public String toString()
    {
        return netName;
    }
    
}
