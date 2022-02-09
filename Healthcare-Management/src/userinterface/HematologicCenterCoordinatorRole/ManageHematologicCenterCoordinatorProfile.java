/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HematologicCenterCoordinatorRole;
import Business.Enterprise.Enterprise;
import Business.Organization.HematologicDiseaseCenterOrganization;
import Business.Organization.GovernmentOrganization;
import Business.UserAccount.UserAccount;
import Magic.Design.MyJButton;
import Magic.Design.MyJLabel;
import Magic.Design.*;
import java.awt.CardLayout;
import java.util.Date;

/**
 *
 * @author tejas
 */
public class ManageHematologicCenterCoordinatorProfile extends javax.swing.JPanel {

  

     private UserAccount userAccount;
     private Enterprise enterprise ;
     private GovernmentOrganization govtOrganization;
     private HematologicDiseaseCenterOrganization cancerCentreOrganization;
    


    ManageHematologicCenterCoordinatorProfile(UserAccount userAccount, HematologicDiseaseCenterOrganization cancerCentreOrganization, Enterprise enterprise) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         initComponents();
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.cancerCentreOrganization = cancerCentreOrganization;
        populateFields();
    }
    
    private void populateFields(){
        
        comboGender.removeAllItems();
        comboGender.addItem("Male");
        comboGender.addItem("Female");
        txtAddress.setText(userAccount.getEmployee().getAddress());
        txtCity.setText(userAccount.getEmployee().getCity());
        txtContact.setText(String.valueOf(userAccount.getEmployee().getContactNumber()));
        dobDateField.setDate(userAccount.getEmployee().getDateOfBirth());
        txtName.setText(userAccount.getEmployee().getName());
        txtSpecialization.setText(userAccount.getEmployee().getSpecialization());
        txtState.setText(userAccount.getEmployee().getState());
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtSpecialization = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        dobDateField = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(58, 98, 117));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 49, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Contact:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 78, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 107, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 136, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("State:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 165, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Gender:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 195, -1, -1));

        comboGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 192, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("DOB:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Specialization:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 270, -1, -1));

        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 44, 146, -1));

        txtContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 73, 146, -1));

        txtAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 102, 146, -1));

        txtCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 131, 146, -1));

        txtState.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 146, -1));

        txtSpecialization.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 146, -1));

        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 329, 77, 43));

        dobDateField.setBackground(new java.awt.Color(255, 255, 255));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDateFieldFocusLost(evt);
            }
        });
        dobDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobDateFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dobDateFieldMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dobDateFieldagePop(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobDateFielduDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        userAccount.getEmployee().setCity(txtCity.getText());
        userAccount.getEmployee().setContactNumber(Integer.parseInt(txtContact.getText()));
        dobDateField.setDate(userAccount.getEmployee().getDateOfBirth());
        userAccount.getEmployee().setGender((String) comboGender.getSelectedItem());
        userAccount.getEmployee().setAddress(txtAddress.getText());
        userAccount.getEmployee().setState(txtCity.getText());
        userAccount.getEmployee().setSpecialization(txtSpecialization.getText());

    }//GEN-LAST:event_btnSaveActionPerformed

    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dobDateFieldFocusLost

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
        //    Date dob = dobDateField.getDate();
        //       System.out.println(dob.getYear());
        //    ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed

    }//GEN-LAST:event_dobDateFieldMousePressed

    private void dobDateFieldagePop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldagePop
        // TODO add your handling code here:
        //        Date dob = dobDateField.getDate();
        //        System.out.println(dob.getYear());
        //        ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldagePop

    private void dobDateFielduDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobDateFielduDobKeyTyped
        // TODO add your handling code here:
        // System.out.println("date");
        /*

        Date dob = dobDateField.getDate();

        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);

        Period p = Period.between(birthday, today);

        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);

        }

        */
        /*  public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
            if ((birthDate != null) && (currentDate != null)) {
                return Period.between(birthDate, currentDate).getYears();
            } else {
                return 0;
            }

            */
    }//GEN-LAST:event_dobDateFielduDobKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboGender;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}