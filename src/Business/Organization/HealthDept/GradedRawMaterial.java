/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthDept;

import Business.Organization.WasteManagement.*;
import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class GradedRawMaterial {
    
    String rawmatname;
   String grade;
    String reason;
  
  
   public GradedRawMaterial() {
    }


    
    
    public String getRawmatname() {
        return rawmatname;
    }

    public void setRawmatname(String rawmatname) {
        this.rawmatname = rawmatname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    @Override
    public String toString() {
        return  rawmatname ;
    }

     public GradedRawMaterial(String rawName,String grade,String reason){
        this.rawmatname = rawName;
        this.grade=grade;
        this.reason=reason;

        
        
    }
    
    
}
