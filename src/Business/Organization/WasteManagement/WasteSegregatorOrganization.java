/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.WasteManagement;

import Business.Organization.Organization;
import Business.Role.WasteSegregatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WasteSegregatorOrganization extends Organization{

    public WasteSegregatorOrganization() {
        super(Organization.Type.WasteSegregatorOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WasteSegregatorRole());
        return roles;
    }
     
   
    
    
}
