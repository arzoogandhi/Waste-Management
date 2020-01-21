/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthDept;

import Business.Organization.WasteManagement.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author singh
 */
public class GradedRawmaterialList {
    
    private  List<GradedRawMaterial> appprovedrawList = new ArrayList();
 private  List<GradedRawMaterial> disappprovedrawList = new ArrayList();

    public List<GradedRawMaterial> getDisappprovedrawList() {
        return disappprovedrawList;
    }

    public void setDisappprovedrawList(List<GradedRawMaterial> disappprovedrawList) {
        this.disappprovedrawList = disappprovedrawList;
    }

    public List<GradedRawMaterial> getAppprovedrawList() {
        return appprovedrawList;
    }

    public void setAppprovedrawList(List<GradedRawMaterial> appprovedrawList) {
        this.appprovedrawList = appprovedrawList;
    }
 
 
    
     public GradedRawMaterial addARaw(GradedRawMaterial raw){
   
        appprovedrawList.add(raw);
        return raw;
    }
        
    public void deleteARaw(GradedRawMaterial raw){
        appprovedrawList.remove(raw);
        
    }
    
        
     public GradedRawMaterial addDRaw(GradedRawMaterial raw){
   
        disappprovedrawList.add(raw);
        return raw;
    }
        
    public void deleteDRaw(GradedRawMaterial raw){
        disappprovedrawList.remove(raw);
        
    }
}
