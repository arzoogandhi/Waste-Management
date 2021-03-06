/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GradingOfficerRole;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RecyclePlantEnterprise;
import Business.Organization.HealthDept.ProductGradingCentreOrganization;
import Business.Organization.RecyclePlant.TransformationPlantOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GradingOfficerWorkRequest;
import Business.WorkQueue.TransformManagerWorkRequest;
import Business.WorkQueue.WorkRequest;

import java.awt.CardLayout;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.TransformManagerRole.ViewRawMaterialJPanel;
import userinterface.WasteSegregatorRole.RawMaterialGenerationPanel;

/**
 *
 * @author singh
 */
public class GradingOfficerWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ProductGradingCentreOrganization productGradingCentreOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private GradingOfficerWorkRequest request;
    /**
     * Creates new form GradingOfficerWorkArea
     */
//    public GradingOfficerWorkArea() {
//        initComponents();
//    }

    public GradingOfficerWorkArea(JPanel userProcessContainer, UserAccount account, ProductGradingCentreOrganization productGradingCentreOrganization, Enterprise enterprise, EcoSystem business) {
         initComponents(); 
        this.userProcessContainer = userProcessContainer;
        this.productGradingCentreOrganization = (ProductGradingCentreOrganization)productGradingCentreOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
         populateRawMaterialTable();
    }
    public void populateRawMaterialTable(){
        DefaultTableModel dtm = (DefaultTableModel)gradingOffice_tbl.getModel();
        dtm.setRowCount(0);
         productGradingCentreOrganization.getWorkQueue().setWorkRequestList(
                  productGradingCentreOrganization.getWorkQueue().getWorkRequestList().stream()
                          .filter(product -> product.getSender() != null).collect(Collectors.toList()));
      for(WorkRequest request : productGradingCentreOrganization.getWorkQueue().getWorkRequestList()){
            if(request.getSender() != null){
                Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getUsername();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getUsername();
            row[3] = request.getStatus();
            
            dtm.addRow(row);
            }
        }
    
        
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradingOffice_tbl = new javax.swing.JTable();
        approvedmatbtn = new javax.swing.JButton();
        disapprovedmatbtn = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        viewList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Raw materials to be tested:");

        gradingOffice_tbl.setBackground(new java.awt.Color(204, 255, 204));
        gradingOffice_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Source", "Sender", "Reciever", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gradingOffice_tbl);
        if (gradingOffice_tbl.getColumnModel().getColumnCount() > 0) {
            gradingOffice_tbl.getColumnModel().getColumn(0).setResizable(false);
            gradingOffice_tbl.getColumnModel().getColumn(1).setResizable(false);
            gradingOffice_tbl.getColumnModel().getColumn(2).setResizable(false);
            gradingOffice_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        approvedmatbtn.setBackground(new java.awt.Color(0, 204, 153));
        approvedmatbtn.setText("Approved Raw Materials");
        approvedmatbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedmatbtnActionPerformed(evt);
            }
        });

        disapprovedmatbtn.setBackground(new java.awt.Color(0, 204, 153));
        disapprovedmatbtn.setText("Disapproved materials");
        disapprovedmatbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disapprovedmatbtnActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(0, 204, 153));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        viewList.setBackground(new java.awt.Color(0, 204, 153));
        viewList.setText("view List");
        viewList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewListActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/officerg.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(669, 669, 669)
                .addComponent(disapprovedmatbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(viewList, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(669, 669, 669)
                .addComponent(approvedmatbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(disapprovedmatbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(viewList, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(approvedmatbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approvedmatbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedmatbtnActionPerformed
        int selectedRow = gradingOffice_tbl.getSelectedRow();
        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row");

        }
        
        GradingOfficerWorkRequest request = (GradingOfficerWorkRequest)gradingOffice_tbl.getValueAt(selectedRow, 0);
        System.out.println("hello");
        ApprovedMaterialsJPanel approvedMaterialsJPanel = new ApprovedMaterialsJPanel(userProcessContainer,request, userAccount,selectedRow,enterprise,business);
        userProcessContainer.add("ApprovedMaterialsJPanel", approvedMaterialsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_approvedmatbtnActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        gradingOffice_tbl.setColumnSelectionAllowed(true);
        int selectedRow = gradingOffice_tbl.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        } else if(gradingOffice_tbl.getValueAt(selectedRow, 3).equals("Pending")){
            JOptionPane.showMessageDialog(null, "This task is already assigned , please select another task");
        } 
        else if(gradingOffice_tbl.getValueAt(selectedRow, 3).equals("Graded")){
            JOptionPane.showMessageDialog(null, "This task has been completed, please select another task");
        }
        else
        {

        WorkRequest request = (WorkRequest)gradingOffice_tbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        productGradingCentreOrganization.getWorkQueue().getWorkRequestList().remove(selectedRow);
        productGradingCentreOrganization.getWorkQueue().getWorkRequestList().add(request);
         populateRawMaterialTable();
        }
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void viewListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewListActionPerformed
//viewRawmatJpanel viewRaw = new RawMaterialGenerationPanel(userProcessContainer,request, userAccount,selectedRow,enterprise,business);
//        userProcessContainer.add("viewRawmatJpanel", viewRaw);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);        // TODO add your handling code here:
gradingOffice_tbl.setColumnSelectionAllowed(true);
        int selectedRow = gradingOffice_tbl.getSelectedRow();
        System.out.println(selectedRow);
        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row");

        }
//        if(TransformManagerjTable.getValueAt(selectedRow, 2) == null  ){
//               JOptionPane.showMessageDialog(null, "Please first assign a task to yourself");
//        }
//        else if(TransformManagerjTable.getValueAt(selectedRow, 3) == "Completed"){
//            JOptionPane.showMessageDialog(null, "This task has been completed, please select another task");
//        }
        
        else{
        GradingOfficerWorkRequest request = (GradingOfficerWorkRequest)gradingOffice_tbl.getValueAt(selectedRow, 0);
      
         viewRawmatJpanel viewRawMaterialPanel = new viewRawmatJpanel(userProcessContainer,request, userAccount,selectedRow,enterprise,business);
        userProcessContainer.add("ViewRawMaterialJPanel", viewRawMaterialPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewListActionPerformed

    private void disapprovedmatbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disapprovedmatbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = gradingOffice_tbl.getSelectedRow();
        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row");

        }
        
        GradingOfficerWorkRequest request = (GradingOfficerWorkRequest)gradingOffice_tbl.getValueAt(selectedRow, 0);
        System.out.println("hello");
        DisapprovedMaterialsJPanel1 disapprovedMaterialsJPanel1 = new DisapprovedMaterialsJPanel1(userProcessContainer,request, userAccount,selectedRow,enterprise,business);
        userProcessContainer.add("DisapprovedMaterialsJPanel1", disapprovedMaterialsJPanel1);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_disapprovedmatbtnActionPerformed

    private void sendTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendTransActionPerformed
       int selectedRow = gradingOffice_tbl.getSelectedRow();
       GradingOfficerWorkRequest request = (GradingOfficerWorkRequest)gradingOffice_tbl.getValueAt(selectedRow, 0);
        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row");

        }
        TransformManagerWorkRequest tranrequest = new TransformManagerWorkRequest();

       tranrequest.setGradeRawList(request.getGradeRawList());
      tranrequest.setSource(gradingOffice_tbl.getValueAt(selectedRow, 2).toString());
      tranrequest.setSender(userAccount);
      tranrequest.setStatus("Approved");
      
             
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
        }
    }//GEN-LAST:event_sendTransActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvedmatbtn;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton disapprovedmatbtn;
    private javax.swing.JTable gradingOffice_tbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewList;
    // End of variables declaration//GEN-END:variables
}
