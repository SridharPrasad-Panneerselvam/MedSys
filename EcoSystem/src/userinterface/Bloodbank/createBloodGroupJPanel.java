/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Bloodbank;

import Business.Blood.BloodGroup;
import Business.Blood.BloodGroupList;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicianOrganization;
import Business.UserAccount.UserAccount;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.EMS.EMSNurse.EMSNurseWorkAreaJPanel;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author harshi
 */
public class createBloodGroupJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createBloodGroupJPanel
     */
    private JPanel userProcessContainer;
    private ClinicianOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private BloodGroup bloodgroup;
    private BloodGroupList bloodgrouplist;

    public createBloodGroupJPanel(JPanel userProcessContainer, BloodGroup bloodgroup, BloodGroupList bloodgrouplist) {
        logger.log(Level.INFO, "createBloodGroupJPanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;

        this.bloodgroup = bloodgroup;
        this.bloodgrouplist = bloodgrouplist;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        sendToDoctorPanel = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        availUnitsTextField = new javax.swing.JTextField();
        bgTextBox = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        sendToDoctorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Blood Group :");

        jLabel3.setText("Available Units :");

        availUnitsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availUnitsTextFieldActionPerformed(evt);
            }
        });
        availUnitsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                availUnitsTextFieldKeyTyped(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        sendToDoctorPanel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(availUnitsTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(bgTextBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(btnSave, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout sendToDoctorPanelLayout = new javax.swing.GroupLayout(sendToDoctorPanel);
        sendToDoctorPanel.setLayout(sendToDoctorPanelLayout);
        sendToDoctorPanelLayout.setHorizontalGroup(
            sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendToDoctorPanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availUnitsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
            .addGroup(sendToDoctorPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sendToDoctorPanelLayout.setVerticalGroup(
            sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendToDoctorPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bgTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(availUnitsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(sendToDoctorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 400, 210));

        jLabel4.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel4.setText("CREATE BLOOD DETAILS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void availUnitsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availUnitsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availUnitsTextFieldActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnSaveActionPerformed --createBloodGroupJPanel");

        String bloodgroup = bgTextBox.getText();
        String availableUnits = availUnitsTextField.getText();

        if (bloodgroup.equals("") || bloodgroup.isEmpty() || availableUnits.equals("") || availableUnits.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter values for all the fields");
            return;
        }
        if (bloodgrouplist.getBloodGroupList().size() > 0) {
            for (BloodGroup bg : bloodgrouplist.getBloodGroupList()) {
                if (bloodgroup.equalsIgnoreCase(String.valueOf(bg))) {
                    JOptionPane.showMessageDialog(null, "BloodGroup already exists");
                    bgTextBox.setText("");
                    availUnitsTextField.setText("");
                    return;
                }
            }
        }
        this.bloodgroup = new BloodGroup(bloodgroup, availableUnits);
        bloodgrouplist.addBG(this.bloodgroup);
        JOptionPane.showMessageDialog(null, "BloodGroup details added successfully");
        bgTextBox.setText("");
        availUnitsTextField.setText("");
        return;
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "jButton1ActionPerformed --createBloodGroupJPanel");

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ClinicianWorkAreaJPanel dwjp = (ClinicianWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void availUnitsTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availUnitsTextFieldKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACK_SPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter a number");
        }
    }//GEN-LAST:event_availUnitsTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availUnitsTextField;
    private javax.swing.JTextField bgTextBox;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane sendToDoctorPanel;
    // End of variables declaration//GEN-END:variables
}
