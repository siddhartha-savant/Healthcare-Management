/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String actualName){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setActualName(actualName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HealthServiceManager.getValue())){
            organization = new HealthServiceManagerOrganization();
            organization.setActualName(actualName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pathologist.getValue())){
            organization = new PathologistOrganization();
            organization.setActualName(actualName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createLegalOrganization(Organization.LegalType legalType, String actualName){
        Organization organization = null;
        if (legalType.getValue().equals(Organization.LegalType.LegalOfficer.getValue())){
            organization = new LegalOfficerOrganization();
            organization.setActualName(actualName);
            organizationList.add(organization);
        }
        return organization;
    }
    
     public Organization createBoneMarrowOrganization(Organization.BoneMarrowBankType bmBankType, String actualName){
        Organization organization = null;
        if (bmBankType.getValue().equals(Organization.BoneMarrowBankType.BoneMarrowCenter.getValue())){
            organization = new BoneMarrowCenterOrganization();
            organization.setActualName(actualName);
            organizationList.add(organization);
        }
        return organization;
    }
     
     public Organization createHematologicDiseaseCenterOrganization(Organization.HematologicDiseaseCenterType cancerType, String actualName){
        Organization organization = null;
        if (cancerType.getValue().equals(Organization.HematologicDiseaseCenterType.HematologicDiseaseCenter.getValue())){
            organization = new HematologicDiseaseCenterOrganization();
            organization.setActualName(actualName);
            organizationList.add(organization);
        }
        return organization;
    }
     
      public Organization createGovernmentOrganization(Organization.GovernmentType govtType, String actualName){
        Organization organization = null;
        if (govtType.getValue().equals(Organization.GovernmentType.Government.getValue())){
            organization = new GovernmentOrganization();
            organization.setActualName(actualName);
            organizationList.add(organization);
        }
        return organization;
    }
     
}