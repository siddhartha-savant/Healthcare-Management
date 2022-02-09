/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Antigen.AntigenCounter;
import Business.Antigen.AntigenEntity;
import Business.Role.DoctorRole;
import Business.Role.BoneMarrowCenterAdministratorRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author siddharthasavant
 */
public class BoneMarrowCenterOrganization extends Organization{

    AntigenCounter inventory;
    
    public BoneMarrowCenterOrganization() {
        super(Organization.BoneMarrowBankType.BoneMarrowCenter.getValue());
        inventory = new AntigenCounter();
        AntigenEntity antigenEn = new AntigenEntity();
        antigenEn.AntigenUpdationList("HLA_A,HLA_B");
        inventory.addHLACount(antigenEn,6);
        antigenEn = new AntigenEntity();
        antigenEn.AntigenUpdationList("HLA_A");
        inventory.addHLACount(antigenEn,5);
        antigenEn = new AntigenEntity();
        antigenEn.AntigenUpdationList("HLA_A,HLA_B,HLA_C");
        inventory.addHLACount(antigenEn,7);
    }

    public AntigenCounter getInventory() {
        return inventory;
    }
    
    public void setInventory(AntigenCounter inventory) {
        this.inventory = inventory;
    }
    
    public HashMap<String, Integer> getInventoryData() {
        return this.getInventory().getHlaComboCounts();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BoneMarrowCenterAdministratorRole());
        return roles;
    }
     
}