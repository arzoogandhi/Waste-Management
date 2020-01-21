/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.HealthDept.GradedRawMaterial;
import Business.Organization.WasteManagement.RawMaterial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arzoo
 */
public class GradingOfficerWorkRequest extends WorkRequest {
    List<RawMaterial> GradeRawList = new ArrayList<>();

     private List<GradedRawMaterial> approveRawList = new ArrayList();
     
     private List<GradedRawMaterial> disapproveRawList = new ArrayList();

    public List<GradedRawMaterial> getApproveRawList() {
        return approveRawList;
    }

    public void setApproveRawList(List<GradedRawMaterial> approveRawList) {
        this.approveRawList = approveRawList;
    }

    public List<GradedRawMaterial> getDisapproveRawList() {
        return disapproveRawList;
    }

    public void setDisapproveRawList(List<GradedRawMaterial> disapproveRawList) {
        this.disapproveRawList = disapproveRawList;
    }
    
    public List<RawMaterial> getGradeRawList() {
        return GradeRawList;
    }

    public void setGradeRawList(List<RawMaterial> GradeRawList) {
        this.GradeRawList = GradeRawList;
    }
    
}
