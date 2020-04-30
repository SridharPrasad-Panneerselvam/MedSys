/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EMS.EMSManager;

import Business.Enterprise.Enterprise;
import Business.Organization.EMSManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.Vehicle.Vehicle;
import Business.Vehicle.VehicleInformationList;
import static Logger.Logger.logger;
import com.sun.glass.events.KeyEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CreateVehicleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private JPanel userProcessContainer;
    private EMSManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private VehicleInformationList vehicleInformationList;
    private Vehicle vehicle;

    CreateVehicleJPanel(JPanel userProcessContainer, VehicleInformationList vehicleInformationList, Vehicle vehicle) {
        logger.log(Level.INFO, "CreateVehicleJPanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vehicleInformationList = vehicleInformationList;
        this.vehicle = vehicle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnNoVA = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtVehicleNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        btnYesVA = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        manufacturedYearComboBox = new javax.swing.JComboBox<>();
        localityComboBox = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel1.setText("CREATE A VEHICLE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 184, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(btnNoVA);
        btnNoVA.setText("No");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Manufacturer:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Vehicle Availability:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Available Locality:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Vehicle No:");

        txtVehicleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleNoActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Manufactured Year:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Serial Number:");

        txtSerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerialNoKeyTyped(evt);
            }
        });

        buttonGroup1.add(btnYesVA);
        btnYesVA.setText("Yes");
        btnYesVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesVAActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        manufacturedYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a year", "2019", "2018", "2017", "2016", "2015", " ", " " }));
        manufacturedYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturedYearComboBoxActionPerformed(evt);
            }
        });

        localityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a locality", "Tambaram", "Mambhazham", "Egmore", "Adyar", "Anna Nagar" }));
        localityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localityComboBoxActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(btnNoVA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtModel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtVehicleNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtSerialNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnYesVA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnSave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(manufacturedYearComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(localityComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(manufacturedYearComboBox, 0, 180, Short.MAX_VALUE)
                                    .addComponent(txtVehicleNo))
                                .addGap(36, 36, 36))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(btnYesVA)
                                .addGap(29, 29, 29)
                                .addComponent(btnNoVA))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSerialNo)
                                .addComponent(localityComboBox, 0, 180, Short.MAX_VALUE)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYesVA)
                    .addComponent(btnNoVA))
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturedYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(20, 20, 20))
        );

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 380, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void txtVehicleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleNoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnSaveActionPerformed --CreateVehicleJPanel");

        String vehicleno = txtVehicleNo.getText();
        if (vehicleno == null || vehicleno.equals("")) {
            JOptionPane.showMessageDialog(null, "Vehicle Number cannot be empty");
            return;
        }
        for (Vehicle v : vehicleInformationList.getVehicleInformationList()) {
            if (vehicleno.equals(v.getVehicleNo())) {
                JOptionPane.showMessageDialog(null, "The Vehicle No already exists!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        if (manufacturedYearComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please choose a manufactured year");
            return;
        }
        String manufacturedYear = String.valueOf(manufacturedYearComboBox.getSelectedItem());

        if (localityComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please choose a locality");
        }
        String locality = String.valueOf(localityComboBox.getSelectedItem());

        String serial_num = txtSerialNo.getText();
        if (serial_num == null || serial_num.equals("")) {
            JOptionPane.showMessageDialog(null, "Vehicle Number cannot be empty");
            return;
        }
        for (Vehicle v : vehicleInformationList.getVehicleInformationList()) {
            if (serial_num.equals(v.getSerial_num())) {
                JOptionPane.showMessageDialog(null, "The Serial No already exists!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        String model = txtModel.getText();
        if (model == null || model.equals("")) {
            JOptionPane.showMessageDialog(null, "Model number cannot be empty");
            return;
        }

        if (!btnYesVA.isSelected() && !btnNoVA.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please choose an option in Vehicle Availability");
            return;
        }

        boolean vehicleAvailability = true;

        if (btnYesVA.isSelected()) {
            vehicleAvailability = true;
        } else {
            vehicleAvailability = false;
        }

        this.vehicle = new Vehicle(vehicleAvailability, vehicleno, manufacturedYear, serial_num, model, locality);
        vehicleInformationList.addVehicle(this.vehicle);
        JOptionPane.showMessageDialog(null, "The entered Vehicle details have been saved successfully!");

        txtVehicleNo.setText("");
        txtSerialNo.setText("");
        txtModel.setText("");
        manufacturedYearComboBox.setSelectedIndex(0);
        localityComboBox.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnBackActionPerformed --CreateVehicleJPanel");

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof ManageAmbulanceServiceJPanel) {
                ManageAmbulanceServiceJPanel createP = (ManageAmbulanceServiceJPanel) comp;
                createP.populateTable();
            }
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void manufacturedYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturedYearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturedYearComboBoxActionPerformed

    private void localityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localityComboBoxActionPerformed

    private void txtSerialNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNoKeyTyped
        // TODO add your handling code here:
        logger.log(Level.INFO, "txtSerialNoKeyTyped --CreateVehicleJPanel");

        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACKSPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter a number");
        }
    }//GEN-LAST:event_txtSerialNoKeyTyped

    private void btnYesVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYesVAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnNoVA;
    private javax.swing.JButton btnSave;
    private javax.swing.JRadioButton btnYesVA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JComboBox<String> localityComboBox;
    private javax.swing.JComboBox<String> manufacturedYearComboBox;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtVehicleNo;
    // End of variables declaration//GEN-END:variables
}