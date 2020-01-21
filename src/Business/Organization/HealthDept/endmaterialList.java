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
public class endmaterialList {
    
    private  List<endpro> rawList = new ArrayList();

    public List<endpro> getRawList() {
        return rawList;
    }

    public void setRawList(List<endpro> rawList) {
        this.rawList = rawList;
    }
      public endpro addRaw(endpro raw){
   
        rawList.add(raw);
        return raw;
    }

    
    
}
