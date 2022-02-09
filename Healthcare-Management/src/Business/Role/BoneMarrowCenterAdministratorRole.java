/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.BoneMarrowCenterOrganization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.BoneMarrowBankCoordinatorRole.BoneMarrowBankCoordinatorWorkAreaJPanel;

/**
 *
 * @author siddharthasavant
 */
public class BoneMarrowCenterAdministratorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new BoneMarrowBankCoordinatorWorkAreaJPanel(account, (BoneMarrowCenterOrganization)organization, enterprise, business, network);
    }
    
}
