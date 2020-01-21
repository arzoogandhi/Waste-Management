/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WasteManagement.WasteSegregatorOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.WasteSegregatorRole.WasteSegregatorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class WasteSegregatorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WasteSegregatorWorkAreaJPanel(userProcessContainer, account, (WasteSegregatorOrganization)organization, business,enterprise);
    }
    
}
