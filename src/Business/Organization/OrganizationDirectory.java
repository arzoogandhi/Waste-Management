/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.HealthDept.ProductGradingCentreOrganization;
import Business.Organization.WasteManagement.WasteSegregatorOrganization;
import Business.Organization.WasteManagement.WasteCollectorOrganization;
import Business.Organization.Organization.Type;
import Business.Organization.RecyclePlant.DistributionCentreOrganization;
import Business.Organization.RecyclePlant.TransformationPlantOrganization;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.WasteCollectorOrganization.getValue())){
            organization = new WasteCollectorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.WasteSegregatorOrganization.getValue())){
            organization = new WasteSegregatorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TransformationPlantOrganization.getValue())){
            organization = new TransformationPlantOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ProductGradingCentreOrganization.getValue())){
            organization = new ProductGradingCentreOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DistributionCentreOrganization.getValue())){
            organization = new DistributionCentreOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}