/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WasteSegregatorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RecyclePlantEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.RecyclePlant.TransformationPlantOrganization;
import Business.Organization.WasteManagement.RawMaterial;
import Business.Organization.WasteManagement.RawmaterialList;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TransformManagerWorkRequest;
import Business.WorkQueue.WasteSegregatorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author singh
 */
public class RawMaterialGenerationPanel extends javax.swing.JPanel {

    /**
     * Creates new form RawMaterialGenerationPanel
     */
   
     private JPanel userProcessContainer;
     private int selectedRow;
     private WasteSegregatorWorkRequest request;
     private UserAccount userAccount;
     private Enterprise enterprise;
     private EcoSystem business;
     private TransformationPlantOrganization transformationPlantorganization;
//      private RawmaterialList rawlist;
   
    
//    RawMaterialGenerationPanel(JPanel userProcessContainer, WasteSegregatorWorkRequest request, UserAccount userAccount,int selectedRow) {
//        initComponents();
//        this.userProcessContainer = userProcessContainer;
//        this.request = request;
//        this.userAccount = userAccount;
//       this.selectedRow = selectedRow;
//        populateCombobox();
////        populateTable();
//     this.txt_weight.setText(Float.toString(request.getWeight()));
//        
//    }
     RawMaterialGenerationPanel(JPanel userProcessContainer, WasteSegregatorWorkRequest request, UserAccount userAccount,int selectedRow,Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
       this.selectedRow = selectedRow;
       this.enterprise = enterprise;
       this.business = business;
        populateCombobox();
//        populateTable();
this.weightjlabel.setText(Float.toString(request.getWeight()));
wastejlabel.setText(request.getSource());

    }
//     
//       RawMaterialGenerationPanel(JPanel userProcessContainer, RawmaterialList rawlist) {
//        initComponents();
//        this.rawlist = rawlist;
//        this.userProcessContainer=userProcessContainer;
//    } 

//    RawMaterialGenerationPanel(JPanel userProcessContainer, WasteSegregatorWorkRequest request, UserAccount userAccount) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
     public void populateCombobox(){
        rawMaterialjComboBox.addItem("Paper");
        rawMaterialjComboBox.addItem("Broken Glass");
        rawMaterialjComboBox.addItem("Crystal");
        rawMaterialjComboBox.addItem("Steel");
        rawMaterialjComboBox.addItem("Tin");
        rawMaterialjComboBox.addItem("Copper");
        rawMaterialjComboBox.addItem("Plastic Bottles");
        rawMaterialjComboBox.addItem("High-Density Polyethylene");
        rawMaterialjComboBox.addItem("Metal");
        rawMaterialjComboBox.addItem("Coffee Cups");
        rawMaterialjComboBox.addItem("Plastic Bags");
        rawMaterialjComboBox.addItem("Polyethylene Terephthalate ");
        rawMaterialjComboBox.addItem("Polyvinyl Chloride ");
        rawMaterialjComboBox.addItem("Polystyrene");
        rawMaterialjComboBox.addItem("Polypropylene");
         rawMaterialjComboBox.addItem("Batteries");
         rawMaterialjComboBox.addItem("Rubber");
         rawMaterialjComboBox.addItem("kitchen scrap");
         
        for(String item : RawmaterialList.getRawComboList()){
            rawMaterialjComboBox.addItem(item);
        }
       
     }
     
  HashMap<String, Float> hmap = new HashMap<String, Float>(); 
  RawmaterialList rawlist = new RawmaterialList();
  Integer count=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        rwmaterialtxtfld = new javax.swing.JTextField();
        rwmaterialaddbtn = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        rawMaterial_tbl = new javax.swing.JTable();
        submitbtn = new javax.swing.JButton();
        quantitytxt = new javax.swing.JTextField();
        rawMaterialjComboBox = new javax.swing.JComboBox<>();
        btn_transformStation = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        wastejlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        weightjlabel = new javax.swing.JLabel();
        pie_chrt_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 231, 226));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Add a new raw material:");

        rwmaterialaddbtn.setBackground(new java.awt.Color(0, 204, 255));
        rwmaterialaddbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rwmaterialaddbtn.setText("ADD");
        rwmaterialaddbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rwmaterialaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rwmaterialaddbtnActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(rwmaterialtxtfld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(rwmaterialaddbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rwmaterialtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rwmaterialaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rwmaterialtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rwmaterialaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        rawMaterial_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Raw Material Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(rawMaterial_tbl);
        if (rawMaterial_tbl.getColumnModel().getColumnCount() > 0) {
            rawMaterial_tbl.getColumnModel().getColumn(0).setResizable(false);
            rawMaterial_tbl.getColumnModel().getColumn(1).setResizable(false);
        }

        submitbtn.setBackground(new java.awt.Color(0, 204, 153));
        submitbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        quantitytxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        rawMaterialjComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rawMaterialjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rawMaterialjComboBoxActionPerformed(evt);
            }
        });

        btn_transformStation.setBackground(new java.awt.Color(0, 204, 153));
        btn_transformStation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_transformStation.setText("Send to Transform Station");
        btn_transformStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transformStationActionPerformed(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(255, 153, 153));
        edit_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_btn.setText("Edit");
        edit_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Source of Waste");

        wastejlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setText("lbs");

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(submitbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(quantitytxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(rawMaterialjComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btn_transformStation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(edit_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(wastejlabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rawMaterialjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(wastejlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(btn_transformStation)
                        .addGap(5, 5, 5)
                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(wastejlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rawMaterialjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_transformStation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(183, Short.MAX_VALUE))))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total Weight of Waste");

        backJButton.setBackground(new java.awt.Color(0, 204, 153));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        weightjlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        pie_chrt_btn.setBackground(new java.awt.Color(255, 204, 153));
        pie_chrt_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/download.png"))); // NOI18N
        pie_chrt_btn.setText("Pie Chart");
        pie_chrt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pie_chrt_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(weightjlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(pie_chrt_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(weightjlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pie_chrt_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        
       RawMaterial raw=new RawMaterial();
        raw.setRawmatname(rawMaterialjComboBox.getSelectedItem().toString());
//        float rawWeight = raw.setRawmatweight(Float.parseFloat(quantitytxt.getText()));
          float rawWeight = (Float.parseFloat(quantitytxt.getText()));
          
          
          raw.setRawmatweight(rawWeight);
          for(RawMaterial rawmat : rawlist.getRawList())
         {
           if(rawmat.getRawmatname().contains(raw.getRawmatname())){
              JOptionPane.showMessageDialog(null, "Raw Material already added ,please change the quantity of raw material generate");
              raw.setRawmatname(null);
          } 
           else{
               continue;
           }
         }
         DefaultTableModel dtm = (DefaultTableModel) rawMaterial_tbl.getModel();
                    if(rawlist.getRawList().isEmpty()){
        dtm.setRowCount(0);
                    }
   float itemWasteSum = 0f;
        float weightwaste = 0f;
          for(int i = 0; i < rawMaterial_tbl.getRowCount(); i++)
        {
        weightwaste = weightwaste + Float.parseFloat(rawMaterial_tbl.getValueAt(i, 1).toString());
   
        }
        
  
             itemWasteSum = weightwaste + rawWeight;
            
            float totalWaste = Float.parseFloat(weightjlabel.getText());
            if (totalWaste < itemWasteSum) {
                JOptionPane.showMessageDialog(null, "Weight exceeding the total weight");
                
                quantitytxt.setText(""); 
            }
            else{   
                if(raw.getRawmatname()!= null){
            rawlist.addRaw(raw);
                }
                }
     dtm.setRowCount(0);
      for(RawMaterial rawmat : rawlist.getRawList())
         {
       
        Object[] row = new Object[4];
         row[0]= rawmat;
          row[1]=rawmat.getRawmatweight();
         dtm.addRow(row);
         quantitytxt.setText(""); 
                }     
         

    }//GEN-LAST:event_submitbtnActionPerformed

    
    private void rwmaterialaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rwmaterialaddbtnActionPerformed
        // TODO add your handling code here:q
        String rawComboItem = rwmaterialtxtfld.getText();
   
            if(RawmaterialList.getRawComboList().contains(rawComboItem.toString())){
               JOptionPane.showMessageDialog(null, "Raw Material already exists"); 
            }
            else{
                  RawmaterialList.getRawComboList().add(rawComboItem);
            }
   
     
       for(String item : RawmaterialList.getRawComboList()){
           rawMaterialjComboBox.addItem(item);
       }
        
    }//GEN-LAST:event_rwmaterialaddbtnActionPerformed

    private void btn_transformStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transformStationActionPerformed
        // TODO add your handling code here:
        // DefaultTableModel dtm = (DefaultTableModel) rawMaterial_tbl.getModel();
        // System.out.println("tbl is"+rawMaterial_tbl.getRowCount());
         if(rawlist.getRawList().isEmpty())
         {
         JOptionPane.showMessageDialog(null, "Please segregate waste first");
         }
         else 
         {
        request.setStatus("completed");
        
     TransformManagerWorkRequest tranrequest = new TransformManagerWorkRequest();
       tranrequest.setTransformRawList(rawlist.getRawList());
      tranrequest.setSource(request.getSource());
      tranrequest.setSender(userAccount);
      tranrequest.setStatus("Sent");
      
      
    Organization org = null;
    
    
    for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof RecyclePlantEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof TransformationPlantOrganization){
                org = organization;
                break;
            }
                            }
                        }

                    }
                }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(tranrequest);
            userAccount.getWorkQueue().getWorkRequestList().add(tranrequest);
            
           DefaultTableModel dtm = (DefaultTableModel) rawMaterial_tbl.getModel();
           dtm.setRowCount(0);
        }
     JOptionPane.showMessageDialog(null, "Request successfully sent to Transform Station", "Information Message", JOptionPane.INFORMATION_MESSAGE);
     String to = "";
       String from = org.getWorkQueue().getWorkRequestList().get(0).getSender().getEmail();
       String subject = "New request has been generated";
       String message = "Hi Greeting of the day!!\n\n A new waste transformation task has been sent\n\n You can assign it to yourself\n\n Thank You";
       
       for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
           to += ","+ua.getEmail();
       }
        sendEmail(from,to, subject, message);
//        sendEmail(from,"singhsonali978@gmail.com", subject, message);
         }

    
     
    }//GEN-LAST:event_btn_transformStationActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        int selected = rawMaterial_tbl.getSelectedRow();
      if (selected < 0){
          JOptionPane.showMessageDialog(null, "Please select a row");

      }
      else{
          rawMaterialjComboBox.setSelectedItem(rawMaterial_tbl.getValueAt(selected, 0).toString());
          quantitytxt.setText(rawMaterial_tbl.getValueAt(selected, 1).toString());
           for(RawMaterial rawmat : rawlist.getRawList())
         {
             if(rawmat.getRawmatname().contains(rawMaterial_tbl.getValueAt(selected, 0).toString())){
                rawlist.deleteRaw(rawmat);
             }
             
         }
          
      }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void pie_chrt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pie_chrt_btnActionPerformed
        float weii =0.0f;
     
         DefaultPieDataset piedataset = new DefaultPieDataset();
        
         for(RawMaterial rawmat : rawlist.getRawList())
         {
               weii=  weii+rawmat.getRawmatweight();
             
         }
        piedataset.setValue("Unsegregated Waste", request.getWeight()-weii);
         for(RawMaterial rawmat : rawlist.getRawList())
         {
               piedataset.setValue(rawmat.getRawmatname(), rawmat.getRawmatweight());
             
         }

          PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} = {1}");

          JFreeChart pieChart = ChartFactory.createPieChart("Raw Material Segregation", piedataset,true,true,true);
          PiePlot pie  = (PiePlot)pieChart.getPlot();
          pie.setLabelGenerator(labelGenerator);
          ChartFrame piePanel = new ChartFrame("Pie",pieChart);
          piePanel.setVisible(true);
          piePanel.setSize(400,400);
        
    }//GEN-LAST:event_pie_chrt_btnActionPerformed

    private void rawMaterialjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rawMaterialjComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rawMaterialjComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btn_transformStation;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pie_chrt_btn;
    private javax.swing.JTextField quantitytxt;
    private javax.swing.JTable rawMaterial_tbl;
    private javax.swing.JComboBox<String> rawMaterialjComboBox;
    private javax.swing.JButton rwmaterialaddbtn;
    private javax.swing.JTextField rwmaterialtxtfld;
    private javax.swing.JButton submitbtn;
    private javax.swing.JLabel wastejlabel;
    private javax.swing.JLabel weightjlabel;
    // End of variables declaration//GEN-END:variables

public void sendEmail(String from,String to,String sub,String msg){
 // Recipient's email ID needs to be mentioned.
     
      // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.host", "smtp.gmail.com");
      properties.setProperty("mail.smtp.port", "465");
      properties.setProperty("mail.defaultEncoding", "UTF-8");
      properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
      properties.setProperty("mail.smtp.socketFactory.fallback", "false");
      properties.setProperty("mail.smtp.ssl.enable", "true");
      properties.setProperty("mail.smtp.socketFactory.port", "465");
      properties.setProperty("mail.smtp.auth", "true");
      properties.setProperty("mail.smtp.starttls.enable", "true");
      
      properties.setProperty("mail.smtp.starttls.required", "true");
      properties.setProperty("mail.smtp.starttls.enable", "true");
      
      
      
      
      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject(sub);

         // Now set the actual message
         message.setText(msg);

         // Send message
         Transport.send(message,from,"");
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }

}
