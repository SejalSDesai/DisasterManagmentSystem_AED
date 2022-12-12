package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author wadhwa
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterprise_type;
    private OrganizationDirectory organization_directory;
    
    public Enterprise(String ent_name, EnterpriseType ent_type)
    {
      super(ent_name);
      this.enterprise_type= ent_type;
      organization_directory = new OrganizationDirectory();
    }
    //enums for different types of enterprise
     public enum EnterpriseType
     {
        Community("Community"),
        NGO("NGO"),
        Provider ("Provider"),
        Police("Police"),
        Hospital("Hospital"),
        FireMan("FireMan");
        
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
     }

    public EnterpriseType getEnterprise_type() {
        return enterprise_type;
    }

    public OrganizationDirectory getOrganization_directory() {
        return organization_directory;
    }
