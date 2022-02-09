/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.HealthServiceManagerRole;
import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class HealthServiceManagerOrganization extends Organization{

    public HealthServiceManagerOrganization() {
        super(Organization.Type.HealthServiceManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthServiceManagerRole());
        return roles;
    }
     
}