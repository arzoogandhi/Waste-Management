/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.HealthDept.endpro;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DistributorWorkRequest;
import Business.WorkQueue.GradingOfficerWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.TransformManagerRole.TransformationJPanel;

/**
 *
 * @author ANKIT
 */
public class ViewEndProducts extends javax.swing.JPanel {

    /**
     * Creates new form ViewEndProducts
     */
    private JPanel userProcessContainer;
    private DistributorWorkRequest request;
    private UserAccount account;
    private int selectedRow;
    private Enterprise enterprise;
  
    ViewEndProducts(JPanel userProcessContainer, DistributorWorkRequest request, UserAccount account, int selectedRow, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account =account;
        this.selectedRow = selectedRow;
        this.enterprise = enterprise;
        populateTable();
    }
    
    public void populateTable(){
        
      DefaultTableModel dtm = (DefaultTableModel)endProductTbl.getModel();
        dtm.setRowCount(0);
        for(endpro endproduct : request.getRecycledList()){
            Object[] row = new Object[2];
            row[0] = endproduct.getRawmatname();
            row[1]=endproduct.getRawmatweight();
            dtm.addRow(row);
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
        endProductTbl = new javax.swing.JTable();
        BackjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Distributer Panel");
        add(jLabel1);
        jLabel1.setBounds(285, 34, 240, 28);

        endProductTbl.setBackground(new java.awt.Color(204, 255, 204));
        endProductTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Products", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(endProductTbl);

        add(jScrollPane1);
        jScrollPane1.setBounds(208, 132, 452, 120);

        BackjButton.setBackground(new java.awt.Color(0, 204, 153));
        BackjButton.setText("Back");
        BackjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackjButtonActionPerformed(evt);
            }
        });
        add(BackjButton);
        BackjButton.setBounds(23, 25, 55, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dis.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BackjButton)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BackjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(590, 590, 590))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackjButton;
    private javax.swing.JTable endProductTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}