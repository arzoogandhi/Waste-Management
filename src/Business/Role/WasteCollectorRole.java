/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.WasteManagement.WasteCollectorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.WasteCollectorRole.WasteCollectorWorkArea;

/**
 *
 * @author raunak
 */
public class WasteCollectorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WasteCollectorWorkArea(userProcessContainer, account, (WasteCollectorOrganization)organization, enterprise);
    }
    
    
}
