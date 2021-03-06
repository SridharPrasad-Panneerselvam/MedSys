/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Location.Location;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanjeev MD
 */
public class LocationDetails extends javax.swing.JPanel {

    /**
     * Creates new form LocationDetails
     */
    private JPanel userProcessContainer;
    private Location location;
    private OrganizationDirectory organizationDirectory;

    public LocationDetails(JPanel userProcessContainer, Location location, OrganizationDirectory organizationDirectory) {
        logger.log(Level.INFO, "LocationDetails");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.location = location;
        this.organizationDirectory = organizationDirectory;
        populateTable();
        populateComboBox();
    }

    public void populateTable() {
        logger.log(Level.INFO, "populateTable --LocationDetails");

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        if (location.getNurseList().size() == 0) {
            return;
        }
        for (Employee emp : location.getNurseList()) {
            Object row[] = new Object[1];
            row[0] = emp.getName();
            dtm.addRow(row);
        }
    }

    public void populateComboBox() {
        logger.log(Level.INFO, "populateComboBox --LocationDetails");

        for (Organization o : organizationDirectory.getOrganizationList()) {
            if (o.getName().equals("Nurse Organization")) {
                for (Employee e : o.getEmployeeDirectory().getEmployeeList()) {
                    nurseComboBox.addItem(e.getName());
                }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nurseComboBox = new javax.swing.JComboBox<>();
        BtnAssign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nurse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 136, 375, 139));

        nurseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Nurse" }));
        add(nurseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 81, -1, -1));

        BtnAssign.setText("Assign to Location");
        BtnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAssignActionPerformed(evt);
            }
        });
        add(BtnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 6, -1, -1));

        jLabel1.setText("Nurse");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 85, -1, -1));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAssignActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "BtnAssignActionPerformed --LocationDetails");

        if (nurseComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please select a Nurse to assign");
        } else {
            for (Organization o : organizationDirectory.getOrganizationList()) {
                if (o.getName().equals("Nurse Organization")) {
                    for (Employee e : o.getEmployeeDirectory().getEmployeeList()) {
                        if (nurseComboBox.getSelectedItem().toString().equals(e.getName())) {
                            if (location.checkNurse(e)) {
                                location.addNurse(e);
                                populateTable();
                                return;
                            } else {
                                JOptionPane.showMessageDialog(userProcessContainer, "Nurse is already assigned to this Location");
                                return;
                            }

                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_BtnAssignActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "BackButtonActionPerformed --LocationDetails");

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BtnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> nurseComboBox;
    // End of variables declaration//GEN-END:variables
}
