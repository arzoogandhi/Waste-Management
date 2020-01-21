/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.WasteManagement.RawmaterialList;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private String source;
    private String rawMaterial;
    private float weight;
    private float rawMaterialWeight;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String enterpriseName;
    

        public WorkRequest(){
        requestDate = new Date();
    }

    
    public String getSource() {
        return source;
    }
public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(String rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public float getRawMaterialWeight() {
        return rawMaterialWeight;
    }

    public void setRawMaterialWeight(float rawMaterialWeight) {
        this.rawMaterialWeight = rawMaterialWeight;
    }

    @Override
    public String toString() {
        return source ;
    }
    
    
    
    
}
