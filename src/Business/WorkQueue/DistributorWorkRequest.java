/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.HealthDept.endpro;
import Business.Organization.WasteManagement.RawMaterial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANKIT
 */
public class DistributorWorkRequest extends WorkRequest {
    List<endpro> recycledList = new ArrayList<>();

    public List<endpro> getRecycledList() {
        return recycledList;
    }

    public void setRecycledList(List<endpro> recycledList) {
        this.recycledList = recycledList;
    }
    
    
}
