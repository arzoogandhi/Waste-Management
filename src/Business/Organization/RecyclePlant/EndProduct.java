/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.RecyclePlant;

/**
 *
 * @author ANKIT
 */
public class EndProduct {
    
    private String rawMaterial_1;
    private String rawMaterial_2;
    private float rawMaterial_1_Weight;
    private float rawMaterial_2_Weight;
    private String endProduct;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public EndProduct(String rawMaterial_1, float rawMaterial_1_Weight, String endProduct,int amount) {
        this.rawMaterial_1 = rawMaterial_1;
        this.rawMaterial_1_Weight = rawMaterial_1_Weight;
        this.endProduct = endProduct;
        this.amount=amount;
    }

    
    
    public EndProduct(String rawMaterial_1, String rawMaterial_2, float rawMaterial_1_Weight, float rawMaterial_2_Weight, String endProduct,int amount) {
        this.rawMaterial_1 = rawMaterial_1;
        this.rawMaterial_2 = rawMaterial_2;
        this.rawMaterial_1_Weight = rawMaterial_1_Weight;
        this.rawMaterial_2_Weight = rawMaterial_2_Weight;
        this.endProduct = endProduct;
        this.amount=amount;
    }

    public EndProduct() {
    }

    public String getRawMaterial_1() {
        return rawMaterial_1;
    }

    public void setRawMaterial_1(String rawMaterial_1) {
        this.rawMaterial_1 = rawMaterial_1;
    }

    public String getRawMaterial_2() {
        return rawMaterial_2;
    }

    public void setRawMaterial_2(String rawMaterial_2) {
        this.rawMaterial_2 = rawMaterial_2;
    }

    public float getRawMaterial_1_Weight() {
        return rawMaterial_1_Weight;
    }

    public void setRawMaterial_1_Weight(float rawMaterial_1_Weight) {
        this.rawMaterial_1_Weight = rawMaterial_1_Weight;
    }

    public float getRawMaterial_2_Weight() {
        return rawMaterial_2_Weight;
    }

    public void setRawMaterial_2_Weight(float rawMaterial_2_Weight) {
        this.rawMaterial_2_Weight = rawMaterial_2_Weight;
    }

    public String getEndProduct() {
        return endProduct;
    }

    public void setEndProduct(String endProduct) {
        this.endProduct = endProduct;
    }   
}
