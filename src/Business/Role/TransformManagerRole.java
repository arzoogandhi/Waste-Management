/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.RecyclePlant.TransformationPlantOrganization;
import Business.Organization.Organization;
import Business.Organization.RecyclePlant.InventoryDirectory;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.TransformManagerRole.TransformManagerWorkArea;

/**
 *
 * @author raunak
 */
public class TransformManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TransformManagerWorkArea(userProcessContainer, account, (TransformationPlantOrganization)organization, enterprise , business);
    }
    
    
}
