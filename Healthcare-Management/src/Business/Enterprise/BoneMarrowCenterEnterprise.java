/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class BoneMarrowCenterEnterprise extends Enterprise {
    
    public BoneMarrowCenterEnterprise(String name){
        super(name,typeOfEnterprise.BoneMarrowCenter);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
