/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Population.Donor;
import Business.Population.DonorDirectory;
import Magic.Design.*;
import Business.Population.DonorRequest;
import Business.Population.DonorRequestDirectory;
import Business.UserAccount.UserAccount;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tejas
 */
public class DonorStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorStatusJPanel
     */
    
   //private DonorDirectory donorDirectory;
    private EcoSystem system;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public DonorStatusJPanel(EcoSystem system) {
        initComponents();
        //this.donorDirectory =  donorDirectory;
        this.system = system;
        donorRequestTable.getTableHeader().setDefaultRenderer(new MyTableFormat());
        donorTable.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateTable();
        populateTableS();
    }
    
         
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) donorRequestTable.getModel();
        
        dtm.setRowCount(0);
        
         for(Donor donor: system.getDonorList().getDonorList()){            
            Object row[] = new Object[4];
            row[0]= donor;
            row[1]=donor.getNameOfDonor();
            row[2]=donor.getContactNumber();
            row[3]=donor.getStatus();
              
            dtm.addRow(row);
        }
        
    }
    private void populateTableS() {
        DefaultTableModel dtm = (DefaultTableModel) donorTable.getModel();
        
        dtm.setRowCount(0);
        
         for(DonorRequest donor: system.getDonorRequestList().getDonorRequestList()){            
            Object row[] = new Object[4];
            row[0]= donor;
            row[1]=donor.getNameOfDonor();
            row[2]=donor.getContact();
            row[3]=donor.getStatus();
              
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
        donorRequestTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        donorTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(58, 98, 117));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        donorRequestTable.setBackground(new java.awt.Color(0, 0, 0));
        donorRequestTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        donorRequestTable.setForeground(new java.awt.Color(255, 255, 255));
        donorRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor ID", "Name", "Contact", "Status"
            }
        ));
        donorRequestTable.setGridColor(new java.awt.Color(0, 0, 0));
        donorRequestTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        donorRequestTable.setRowHeight(30);
        donorRequestTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(donorRequestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 1030, 160));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Manage Your Donors Here");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1696, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1720, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setText("Delete Record");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 190, 39));

        donorTable.setBackground(new java.awt.Color(0, 0, 0));
        donorTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        donorTable.setForeground(new java.awt.Color(255, 255, 255));
        donorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor ID", "Name", "Contact", "Status"
            }
        ));
        donorTable.setGridColor(new java.awt.Color(0, 0, 0));
        donorTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        donorTable.setRowHeight(30);
        donorTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(donorTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 1030, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of Donor Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 510, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("List of Donors");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 510, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/faint-bggg.jpeg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1720, 890));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         //TODO add your handling code here:
        
        // DonorRequestDirectory ddr = new DonorRequestDirectory();
         int selectedRow = donorTable.getSelectedRow(); 
          DonorRequest dr =((DonorRequest) donorTable.getValueAt(selectedRow, 0));
 
          system.getDonorRequestList().removeDonorRequest(dr);
          
          //ddr.removeDonorRequest(dr);
             
          
          dB4OUtil.storeSystem(system);
          populateTableS();       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable donorRequestTable;
    private javax.swing.JTable donorTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
