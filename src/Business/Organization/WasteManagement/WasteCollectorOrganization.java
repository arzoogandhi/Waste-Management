/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.WasteManagement;

import Business.Organization.Organization;
import Business.Role.WasteCollectorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WasteCollectorOrganization extends Organization{

    public WasteCollectorOrganization() {
        super(Organization.Type.WasteCollectorOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WasteCollectorRole());
        return roles;
    }
     
}