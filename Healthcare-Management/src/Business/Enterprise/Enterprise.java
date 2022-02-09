 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author siddharthasavant
 */
public abstract class Enterprise extends Organization{
    
    private long contactNumber;
    private String emailAddress;
    private String zipcode;
    private typeOfEnterprise typeEnterprise;
    private OrganizationDirectory organizationList;
    
    

    public OrganizationDirectory getOrganizationList() {
        return organizationList;
    }
    
    public enum typeOfEnterprise{
        Hospital("Hospital"),
        BoneMarrowCenter("BoneMarrowCenter"),
        Legal("Legal"),
        HematologicDiseaseCenter("HematologicDiseaseCenter"),
        CDC("Government");
                
        private String value;
        
        private typeOfEnterprise(String value){
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

    public typeOfEnterprise getTypeEnterprise() {
        return typeEnterprise;
    }

    public void setTypeEnterprise(typeOfEnterprise typeEnterprise) {
        this.typeEnterprise = typeEnterprise;
    }
    
    public Enterprise(String name,typeOfEnterprise type){
        super(name);
        this.typeEnterprise=type;
        organizationList=new OrganizationDirectory();
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }  
    
}
