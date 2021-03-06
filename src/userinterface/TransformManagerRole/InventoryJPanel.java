/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransformManagerRole;

import Business.Organization.RecyclePlant.EndProduct;
import Business.Organization.RecyclePlant.InventoryDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TransformManagerWorkRequest;
import Business.WorkQueue.WasteSegregatorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANKIT
 */
  
public class InventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryJPanel
     */
   private JPanel userProcessContainer;
  private InventoryDirectory inventoryDirectory;
   

    InventoryJPanel(JPanel userProcessContainer,InventoryDirectory inventoryDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.inventoryDirectory = inventoryDirectory;
        populateTable();
    }

    
    public void populateTable(){
       DefaultTableModel dtm =  (DefaultTableModel) InventoryjTable.getModel();
        dtm.setRowCount(0);
        for(EndProduct inventory : InventoryDirectory.getInventoryList()){
          Object[] row = new Object[5];
          row[0]=  inventory;
          row[1] = inventory.getRawMaterial_1_Weight();
          row[2] = inventory.getRawMaterial_2();
          row[3] = inventory.getRawMaterial_2_Weight();
          row[4] = inventory.getEndProduct();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        InventoryjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        newCombi_btn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FirstRawMaterialtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        secondRawMaterialtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantity1_txt = new javax.swing.JTextField();
        quantity2_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        endProducttxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 231, 226));

        InventoryjTable.setBackground(new java.awt.Color(204, 255, 204));
        InventoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Raw material", "Quantity", "Second Raw Material", "Quantity", "End Product"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(InventoryjTable);
        if (InventoryjTable.getColumnModel().getColumnCount() > 0) {
            InventoryjTable.getColumnModel().getColumn(0).setResizable(false);
            InventoryjTable.getColumnModel().getColumn(1).setResizable(false);
            InventoryjTable.getColumnModel().getColumn(2).setResizable(false);
            InventoryjTable.getColumnModel().getColumn(3).setResizable(false);
            InventoryjTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Inventory Panel");

        newCombi_btn.setBackground(new java.awt.Color(0, 204, 153));
        newCombi_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newCombi_btn.setText("Add New Combination");
        newCombi_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newCombi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCombi_btnActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 204, 153));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("First Raw Material");

        FirstRawMaterialtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstRawMaterialtxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Second Raw Material");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantity ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("End Product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backJButton)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(newCombi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(secondRawMaterialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FirstRawMaterialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(quantity1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantity2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(endProducttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backJButton)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FirstRawMaterialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(quantity1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(secondRawMaterialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(quantity2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(newCombi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(endProducttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void FirstRawMaterialtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstRawMaterialtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstRawMaterialtxtActionPerformed

    private void newCombi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCombi_btnActionPerformed
//        if(FirstRawMaterialtxt.getText().isEmpty()&&quantity1_txt.getText().isEmpty()
//                &&secondRawMaterialtxt.getText().isEmpty()&&quantity2_txt.getText().isEmpty()&&endProducttxt.getText().isEmpty()){
//        
//            JOptionPane.showMessageDialog(null,"Enter Raw Material and Quantity");
//        }
//        else if(!FirstRawMaterialtxt.getText().isEmpty()&&!quantity1_txt.getText().isEmpty()
//                &&!secondRawMaterialtxt.getText().isEmpty()&&!quantity2_txt.getText().isEmpty()&&endProducttxt.getText().isEmpty()){
//        
//            JOptionPane.showMessageDialog(null,"Enter end product");
//        }
//        else if(FirstRawMaterialtxt.getText().isEmpty()&& !quantity1_txt.getText().isEmpty()){
//         JOptionPane.showMessageDialog(null,"First enter Raw Material");
//        }
//         else if(!FirstRawMaterialtxt.getText().isEmpty()&& quantity1_txt.getText().isEmpty()){
//         JOptionPane.showMessageDialog(null,"First enter respective quantity");
//        }
//          else if(!FirstRawMaterialtxt.getText().isEmpty()&& quantity1_txt.getText().isEmpty()&&endProducttxt.getText().isEmpty()){
//         JOptionPane.showMessageDialog(null,"Enter End product");
//        }
//         else if(secondRawMaterialtxt.getText().isEmpty()&& !quantity2_txt.getText().isEmpty()){
//         JOptionPane.showMessageDialog(null,"First enter Raw Material");
//        }
//         else if(!secondRawMaterialtxt.getText().isEmpty()&& quantity2_txt.getText().isEmpty()){
//         JOptionPane.showMessageDialog(null,"First enter respective quantity");
//        }
//        else if(!secondRawMaterialtxt.getText().isEmpty()&& !quantity2_txt.getText().isEmpty()&&endProducttxt.getText().isEmpty()){
//         JOptionPane.showMessageDialog(null,"Enter End product");
//        }
        
//        else if(secondRawMaterialtxt.getText().isEmpty()&&!quantity1_txt.getText().isEmpty()||!quantity2_txt.getText().isEmpty()){
//       JOptionPane.showMessageDialog(null,"Enter Raw Material");
//    }
//        else if(!FirstRawMaterialtxt.getText().isEmpty()&&quantity1_txt.getText().isEmpty()){
//             JOptionPane.showMessageDialog(null,"Enter Quantity");
//        }
//         else if(!secondRawMaterialtxt.getText().isEmpty()&&quantity1_txt.getText().isEmpty()){
//             JOptionPane.showMessageDialog(null,"Enter Quantity");
//        }
//        else{
        String firstRawMaterial = FirstRawMaterialtxt.getText();
        float quantity1 = Float.parseFloat(quantity1_txt.getText());
        String secondRawMaterial = secondRawMaterialtxt.getText();
        float quantity2 = Float.parseFloat(quantity2_txt.getText());
        String endProduct = endProducttxt.getText();
        int amount =1;
        
        
        EndProduct endProductObject = new EndProduct(firstRawMaterial, secondRawMaterial,quantity1, quantity2, endProduct,amount);
       
        InventoryDirectory.getInventoryList().add(endProductObject);
        
        FirstRawMaterialtxt.setText("");
        quantity1_txt.setText("");
        secondRawMaterialtxt.setText("");
        quantity2_txt.setText("");
        endProducttxt.setText("");
        populateTable();
//        } 
    }//GEN-LAST:event_newCombi_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstRawMaterialtxt;
    private javax.swing.JTable InventoryjTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField endProducttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newCombi_btn;
    private javax.swing.JTextField quantity1_txt;
    private javax.swing.JTextField quantity2_txt;
    private javax.swing.JTextField secondRawMaterialtxt;
    // End of variables declaration//GEN-END:variables
}
