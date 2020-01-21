/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.WasteManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author singh
 */
public class RawmaterialList {
    
    private  List<RawMaterial> rawList = new ArrayList();
    private static List<String> rawComboList = new ArrayList();
    public  List<RawMaterial> getRawList() {
        return rawList;
    }

    public  void setRawList(List<RawMaterial> rawList) {
       this.rawList = rawList;
    }
    
    
     public RawMaterial addRaw(RawMaterial raw){
   
        rawList.add(raw);
        return raw;
    }
        
    public void deleteRaw(RawMaterial raw){
        rawList.remove(raw);
        
    }

    public static List<String> getRawComboList() {
        return rawComboList;
    }

    public static void setRawComboList(List<String> rawComboList) {
        RawmaterialList.rawComboList = rawComboList;
    }
    
    
}
