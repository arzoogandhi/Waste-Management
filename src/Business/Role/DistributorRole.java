/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.DistributionCentreOrganization;
import Business.Organization.RecyclePlant.DistributionCentreOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DistributorRole.DistributorWorkArea;

/**
 *
 * @author raunak
 */
public class DistributorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DistributorWorkArea(userProcessContainer, account, (DistributionCentreOrganization)organization, enterprise);
    }
    
    
}
