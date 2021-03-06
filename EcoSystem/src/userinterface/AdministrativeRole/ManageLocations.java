/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Location.Location;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanjeev MD
 */
public class ManageLocations extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private Enterprise enterprise;

    /**
     * Creates new form ManageLocations
     */
    public ManageLocations(JPanel userProcessContainer, Enterprise enterprise) {
        logger.log(Level.INFO, "ManageLocations");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.populateTable();
    }

    public void populateTable() {
        logger.log(Level.INFO, "populateTable --ManageLocations");

        if (enterprise.getLocationList().getLocationList().size() <= 0) {
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (Location loc : enterprise.getLocationList().getLocationList()) {
            Object row[] = new Object[3];
            row[0] = loc;
            row[1] = loc.getMax();
            row[2] = loc.getMax() - loc.getCounter();
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

        btnaddLocation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtLocationName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCapacity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnaddLocation.setText("Add Location");
        btnaddLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddLocationActionPerformed(evt);
            }
        });
        add(btnaddLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location Name", "Capacity", "Remaining"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 616, 198));

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jButton1.setText("Assign Nurse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Location Name");

        jLabel2.setText("Capacity");

        txtCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacityActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(txtLocationName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCapacity, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(76, 76, 76)
                        .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 370, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddLocationActionPerformed
        // TODO add your handling code here:   
        logger.log(Level.INFO, "btnaddLocationActionPerformed --ManageLocations");

        if (txtLocationName.getText().length() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please enter Locations");
            return;
        }
        if (txtCapacity.getText().length() == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please enter capacity");
            return;
        }
        for (Location loc : enterprise.getLocationList().getLocationList()) {
            if (loc.getName().equals(txtLocationName.getText())) {
                JOptionPane.showMessageDialog(userProcessContainer, "Location Name already exist");
                return;
            }
        }
        if (txtCapacity.getText().matches("[0-9]+")) {
            enterprise.getLocationList().addLocation(txtLocationName.getText(), Integer.parseInt(txtCapacity.getText()));
            this.populateTable();
            txtLocationName.setText("");
            txtCapacity.setText("");
            return;
        } else {
            JOptionPane.showMessageDialog(userProcessContainer, "Please enter number in the capacity");
            return;
        }

    }//GEN-LAST:event_btnaddLocationActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnbackActionPerformed --ManageLocations");

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "jButton1ActionPerformed --ManageLocations");

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            Location location = (Location) jTable1.getValueAt(selectedRow, 0);
            LocationDetails locDetails = new LocationDetails(userProcessContainer,
                    location, enterprise.getOrganizationDirectory());
            userProcessContainer.add("locDetails", locDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(userProcessContainer, "Please select a Location");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddLocation;
    private javax.swing.JButton btnback;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtLocationName;
    // End of variables declaration//GEN-END:variables
}
