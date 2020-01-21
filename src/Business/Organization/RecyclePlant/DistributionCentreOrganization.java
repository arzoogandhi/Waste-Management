/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.RecyclePlant;

import Business.Organization.Organization;
import Business.Role.DistributorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DistributionCentreOrganization extends Organization{

    public DistributionCentreOrganization() {
        super(Organization.Type.DistributionCentreOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorRole());
        return roles;
    }
     
}