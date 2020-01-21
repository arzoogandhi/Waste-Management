/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthDept.ProductGradingCentreOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.GradingOfficerRole.GradingOfficerWorkArea;

/**
 *
 * @author raunak
 */
public class GradingOfficerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new GradingOfficerWorkArea(userProcessContainer, account, (ProductGradingCentreOrganization)organization, enterprise,business);
    }
    
    
}
