/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthDept;

import Business.Organization.Organization;
import Business.Role.GradingOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ProductGradingCentreOrganization extends Organization{

    public ProductGradingCentreOrganization() {
        super(Organization.Type.ProductGradingCentreOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GradingOfficerRole());
        return roles;
    }
     
}