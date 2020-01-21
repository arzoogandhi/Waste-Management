/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.HealthDept.GradedRawMaterial;
import Business.Organization.WasteManagement.RawMaterial;
import Business.Organization.WasteManagement.RawmaterialList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANKIT
 */
public class TransformManagerWorkRequest extends WorkRequest{
    private List<RawMaterial> transformRawList = new ArrayList();

    private List<RawMaterial> GradeRawList = new ArrayList<>();
   

    public List<RawMaterial> getGradeRawList() {
        return GradeRawList;
    }

    public void setGradeRawList(List<RawMaterial> GradeRawList) {
        this.GradeRawList = GradeRawList;
    }
    
    
    public List<RawMaterial> getTransformRawList() {
        return transformRawList;
    }

    public void setTransformRawList(List<RawMaterial> transformRawList) {
        this.transformRawList = transformRawList;
    }
 
}
