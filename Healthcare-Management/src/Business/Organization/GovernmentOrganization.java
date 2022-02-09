/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.GovernmentOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siddharthasavant
 */
public class GovernmentOrganization extends Organization{

    public GovernmentOrganization() {
        super(Organization.GovernmentType.Government.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentOfficerRole());
        return roles;
    }
     
}