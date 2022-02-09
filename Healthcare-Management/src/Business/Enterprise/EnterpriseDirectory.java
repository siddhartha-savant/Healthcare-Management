/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAddEnterprises(String name,Enterprise.typeOfEnterprise type){
        Enterprise enterprise=null;
        if(type==Enterprise.typeOfEnterprise.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.typeOfEnterprise.Legal){
            enterprise=new LegalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.typeOfEnterprise.CDC){
            enterprise=new CDCEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.typeOfEnterprise.BoneMarrowCenter){
            enterprise=new BoneMarrowCenterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.typeOfEnterprise.HematologicDiseaseCenter){
            enterprise=new HematologicDiseaseCenterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
