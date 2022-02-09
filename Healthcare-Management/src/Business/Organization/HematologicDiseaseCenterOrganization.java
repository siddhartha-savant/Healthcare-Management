/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HematologicCenterCoordinatorRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class HematologicDiseaseCenterOrganization extends Organization{

    public HematologicDiseaseCenterOrganization() {
        super(Organization.HematologicDiseaseCenterType.HematologicDiseaseCenter.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HematologicCenterCoordinatorRole());
        return roles;
    }
     
}