/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.WasteManagement;

import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class RawMaterial {
    
    String rawmatname;
    Float rawmatweight;
    String username;
      String grade;

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
    String reason;
  
  
   public RawMaterial() {
    }


    
    
    public String getRawmatname() {
        return rawmatname;
    }

    public void setRawmatname(String rawmatname) {
        this.rawmatname = rawmatname;
    }

    public Float getRawmatweight() {
        return rawmatweight;
    }

    public void setRawmatweight(Float rawmatweight) {
        this.rawmatweight = rawmatweight;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return  rawmatname ;
    }

     public RawMaterial(String rawName,Float weight){
        this.rawmatname = rawName;
        this.rawmatweight= weight;

        
        
    }
    
    
}
