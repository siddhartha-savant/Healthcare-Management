/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author siddharthasavant
 */
public class Network {
    private String nameOfNetwork;
    private String nameOfState;
    private String nameOfCountry;
    private EnterpriseDirectory enterpriseList;
    
    public Network(){
        enterpriseList=new EnterpriseDirectory();
    }
    public String getNameOfNetwork() {
        return nameOfNetwork;
    }

    public void setNameOfNetwork(String nameOfNetwork) {
        this.nameOfNetwork = nameOfNetwork;
    }

    public EnterpriseDirectory getEnterpriseList() {
        return enterpriseList;
    }

    public String getNameOfState() {
        return nameOfState;
    }

    public void setNameOfState(String nameOfState) {
        this.nameOfState = nameOfState;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }
       
    @Override
    public String toString(){
        return nameOfNetwork;
    }
}
