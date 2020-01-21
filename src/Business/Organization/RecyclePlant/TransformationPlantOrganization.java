/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.RecyclePlant;

import Business.Organization.Organization;
import Business.Role.WasteCollectorRole;
import Business.Role.Role;
import Business.Role.TransformManagerRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TransformationPlantOrganization extends Organization{

    public TransformationPlantOrganization() {
        super(Organization.Type.TransformationPlantOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransformManagerRole());
        return roles;
    }
     
}