/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransformManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.RecyclePlant.InventoryDirectory;
import Business.Organization.RecyclePlant.TransformationPlantOrganization;
import Business.Organization.WasteManagement.RawMaterial;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GradingOfficerWorkRequest;
import Business.WorkQueue.TransformManagerWorkRequest;
import Business.WorkQueue.WasteSegregatorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author singh
 */
public class TransformManagerWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TransformationPlantOrganization transformationPlantorganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private TransformManagerWorkRequest request;
    private InventoryDirectory inventoryDirectory;


    public TransformManagerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    
    initComponents();
        this.userProcessContainer = userProcessContainer;
        this.transformationPlantorganization = (TransformationPlantOrganization)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
//        this.inventoryDirectory = inventoryDirectory;
  valuejLabel.setText(enterprise.getName());
       populateRawMaterialTable();
    }
    public void populateRawMaterialTable(){
        DefaultTableModel dtm = (DefaultTableModel)TransformManagerjTable.getModel();
        dtm.setRowCount(0);
      for(WorkRequest request : transformationPlantorganization.getWorkQueue().getWorkRequestList()){
          if(((TransformManagerWorkRequest)request).getTransformRawList().get(0).getGrade() != null){
          request.setStatus("Graded");
          }
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getUsername();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getUsername();
            row[3] = request.getStatus();
            
            dtm.addRow(row);
        }
    
        
    
    }
    
//    public TransformManagerWorkArea() {
//        initComponents();
//    }

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
        TransformManagerjTable = new javax.swing.JTable();
        InventoryJButton = new javax.swing.JButton();
        TransformjButton = new javax.swing.JButton();
        valuejLabel = new javax.swing.JLabel();
        viewJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enterprise");

        TransformManagerjTable.setBackground(new java.awt.Color(204, 255, 204));
        TransformManagerjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jScrollPane1.setViewportView(TransformManagerjTable);
        if (TransformManagerjTable.getColumnModel().getColumnCount() > 0) {
            TransformManagerjTable.getColumnModel().getColumn(0).setResizable(false);
            TransformManagerjTable.getColumnModel().getColumn(1).setResizable(false);
            TransformManagerjTable.getColumnModel().getColumn(2).setResizable(false);
            TransformManagerjTable.getColumnModel().getColumn(3).setResizable(false);
        }

        InventoryJButton.setBackground(new java.awt.Color(255, 204, 153));
        InventoryJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InventoryJButton.setText("Inventory");
        InventoryJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryJButtonActionPerformed(evt);
            }
        });

        TransformjButton.setBackground(new java.awt.Color(0, 204, 153));
        TransformjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TransformjButton.setText("Transform");
        TransformjButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TransformjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransformjButtonActionPerformed(evt);
            }
        });

        valuejLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valuejLabel.setText("<Value>");

        viewJButton.setBackground(new java.awt.Color(0, 204, 153));
        viewJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewJButton.setText("View Raw Materials");
        viewJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(153, 204, 255));
        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/11_hd_1600.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(valuejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InventoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransformjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(viewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valuejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(InventoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(TransformjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryJButtonActionPerformed
        // TODO add your handling code here:
         InventoryJPanel inventoryPanel = new InventoryJPanel(userProcessContainer,inventoryDirectory);
        userProcessContainer.add("InventoryJPanel", inventoryPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_InventoryJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        TransformManagerjTable.setColumnSelectionAllowed(true);
        int selectedRow = TransformManagerjTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }

        WorkRequest request = (WorkRequest)TransformManagerjTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        transformationPlantorganization.getWorkQueue().getWorkRequestList().remove(selectedRow);
        transformationPlantorganization.getWorkQueue().getWorkRequestList().add(request);
       populateRawMaterialTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        TransformManagerjTable.setColumnSelectionAllowed(true);
        int selectedRow = TransformManagerjTable.getSelectedRow();
        System.out.println(selectedRow);
        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row");

        }
        if(TransformManagerjTable.getValueAt(selectedRow, 2) == null  ){
               JOptionPane.showMessageDialog(null, "Please first assign a task to yourself");
        }
        else if(TransformManagerjTable.getValueAt(selectedRow, 3).equals("Completed")){
            JOptionPane.showMessageDialog(null, "This task has been completed, please select another task");
        }
        
        else{
        TransformManagerWorkRequest request = (TransformManagerWorkRequest)TransformManagerjTable.getValueAt(selectedRow, 0);
      
        ViewRawMaterialJPanel viewRawMaterialPanel = new ViewRawMaterialJPanel(userProcessContainer,request, userAccount,selectedRow,enterprise,business);
        userProcessContainer.add("ViewRawMaterialJPanel", viewRawMaterialPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void TransformjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransformjButtonActionPerformed
         
        int selectedRow = TransformManagerjTable.getSelectedRow();
        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row");

        }
        if(TransformManagerjTable.getValueAt(selectedRow, 3).equals("Graded")){
        TransformManagerWorkRequest request = (TransformManagerWorkRequest)TransformManagerjTable.getValueAt(selectedRow, 0);
        List<RawMaterial> translist = request.getTransformRawList();
        List<RawMaterial> approvedList = translist.stream().filter(req -> req.getGrade().equalsIgnoreCase("approved")).collect(Collectors.toList());
        request.setTransformRawList(approvedList);
        System.out.println();
         TransformationJPanel transformationJPanel = new TransformationJPanel(userProcessContainer,request, userAccount,selectedRow,enterprise,business);
        userProcessContainer.add("TransformationJPanel", transformationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else if(TransformManagerjTable.getValueAt(selectedRow, 3).equals("Sent to Health Department")){
           JOptionPane.showMessageDialog(null, "Please wait for the List to be graded"); 
        }
        else {
           JOptionPane.showMessageDialog(null, "Please send the raw material list to health department for grading"); 
        }
    }//GEN-LAST:event_TransformjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InventoryJButton;
    private javax.swing.JTable TransformManagerjTable;
    private javax.swing.JButton TransformjButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valuejLabel;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables

   

    
}
