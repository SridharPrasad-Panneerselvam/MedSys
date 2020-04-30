/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EMS.EMSManager;

import userinterface.EMS.EMSManager.CreateVehicleJPanel;
import Business.Enterprise.Enterprise;
import Business.Organization.EMSManagerOrganization;
import Business.Organization.EMSNurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vehicle.Vehicle;
import Business.Vehicle.VehicleInformationList;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ManageAmbulanceServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAmbulanceServiceJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private VehicleInformationList vehicleInformationList;
    private List<Vehicle> templist = new ArrayList<>();
    private Vehicle vehicle;

    ManageAmbulanceServiceJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        logger.log(Level.INFO, "ManageAmbulanceServiceJPanel");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.vehicleInformationList = enterprise.getVehicleInformationList();
        populateTable();

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
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnViewFullDetails = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        btnYesVA = new javax.swing.JRadioButton();
        btnNoVA = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnRefresh1 = new javax.swing.JButton();
        btnConsolidatedSearch1 = new javax.swing.JButton();
        comboBoxManufacturedYear = new javax.swing.JComboBox<>();
        comboBoxLocality = new javax.swing.JComboBox<>();
        comboBoxVehicleNo = new javax.swing.JComboBox<>();
        comboBoxManufacturer = new javax.swing.JComboBox<>();
        comboBoxSerialNo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        btnFirstAvailablePassengerCar1 = new javax.swing.JButton();
        btnCurrentAvailableCars = new javax.swing.JButton();
        btnAvailability1 = new javax.swing.JTextField();
        btnCurrentUnavailableCars = new javax.swing.JButton();
        btnAvailability2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel3.setText("MANAGE AMBULANCE SERVICE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 290, -1));

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "VehicleNo", "Availability", "Manufactured Year", "Serial No", "Model", "Manufacturer"
            }
        ));
        jScrollPane1.setViewportView(searchTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 820, 160));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 113, -1));

        btnViewFullDetails.setText("View Full Details>>");
        btnViewFullDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFullDetailsActionPerformed(evt);
            }
        });
        add(btnViewFullDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 149, -1));

        btnCreate.setText("Create a Vehicle");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 170, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Vehicle Availability:");

        buttonGroup1.add(btnYesVA);
        btnYesVA.setText("Yes");

        buttonGroup1.add(btnNoVA);
        btnNoVA.setText("No");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Manufacturer:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Vehicle No:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Manufactured Year:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Serial Number:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Available Locality:");

        btnRefresh1.setText("Refresh");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        btnConsolidatedSearch1.setText("Search");
        btnConsolidatedSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsolidatedSearch1ActionPerformed(evt);
            }
        });

        comboBoxManufacturedYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a year", "2019", "2018", "2017", "2016", "2015" }));
        comboBoxManufacturedYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxManufacturedYearActionPerformed(evt);
            }
        });

        comboBoxLocality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a locality", "Tambaram", "Mambhazham", "Egmore", "Adyar", "Anna Nagar" }));
        comboBoxLocality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxLocalityActionPerformed(evt);
            }
        });

        comboBoxVehicleNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a VehicleNo" }));

        comboBoxManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Manufacturer" }));

        comboBoxSerialNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Serial Number" }));

        jLabel1.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel1.setText("Search Vehicle");

        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnYesVA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnNoVA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnRefresh1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnConsolidatedSearch1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboBoxManufacturedYear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboBoxLocality, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboBoxVehicleNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboBoxManufacturer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboBoxSerialNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(btnYesVA)
                        .addGap(36, 36, 36)
                        .addComponent(btnNoVA))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11)
                        .addGap(29, 29, 29)
                        .addComponent(comboBoxVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(29, 29, 29)
                        .addComponent(comboBoxManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addGap(26, 26, 26)
                        .addComponent(comboBoxLocality, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15)
                        .addGap(33, 33, 33)
                        .addComponent(comboBoxManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel17)
                        .addGap(28, 28, 28)
                        .addComponent(comboBoxSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsolidatedSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(btnYesVA)
                    .addComponent(btnNoVA))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(comboBoxVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(comboBoxManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxLocality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh1)
                    .addComponent(btnConsolidatedSearch1))
                .addGap(5, 5, 5))
        );

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 380, 360));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFirstAvailablePassengerCar1.setText("First Available Vehicle");
        btnFirstAvailablePassengerCar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailablePassengerCar1ActionPerformed(evt);
            }
        });

        btnCurrentAvailableCars.setText("No of Vehicles currently available");
        btnCurrentAvailableCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentAvailableCarsActionPerformed(evt);
            }
        });

        btnCurrentUnavailableCars.setText("No of Vehicles currently unavailable");
        btnCurrentUnavailableCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentUnavailableCarsActionPerformed(evt);
            }
        });

        btnAvailability2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailability2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel2.setText("Search Vehicle Availability");

        jLayeredPane2.setLayer(btnFirstAvailablePassengerCar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnCurrentAvailableCars, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnAvailability1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnCurrentUnavailableCars, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnAvailability2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(58, 58, 58))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(btnCurrentUnavailableCars, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAvailability2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(btnCurrentAvailableCars, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAvailability1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnFirstAvailablePassengerCar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurrentAvailableCars)
                    .addComponent(btnAvailability1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurrentUnavailableCars)
                    .addComponent(btnAvailability2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFirstAvailablePassengerCar1)
                .addGap(18, 18, 18))
        );

        add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 380, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnBackActionPerformed --ManageAmbulanceServiceJPanel");

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnDeleteActionPerformed --ManageAmbulanceServiceJPanel");

        int selectedrow = searchTable.getSelectedRow();
        int rowCount = searchTable.getSelectedRowCount();
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please select only one row");
            return;
        }
        if (selectedrow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the Vehicle?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Vehicle vehicle = (Vehicle) searchTable.getValueAt(selectedrow, 0);
                vehicleInformationList.removeVehicle(vehicle);
                JOptionPane.showMessageDialog(null, "Deleted successfully");
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewFullDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFullDetailsActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnViewFullDetailsActionPerformed --ManageAmbulanceServiceJPanel");

        int selectedRow = searchTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showConfirmDialog(null, "Please select a row from the table to view the details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Vehicle vehicle = (Vehicle) searchTable.getValueAt(selectedRow, 0);
            VehicleDetailsJPanel panel = new VehicleDetailsJPanel(userProcessContainer, vehicleInformationList, vehicle);
            userProcessContainer.add("ViewFullDetailsJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }

    public void populateTable(List<Vehicle> vehicleinformationlist) {
        logger.log(Level.INFO, "populateTable --ManageAmbulanceServiceJPanel");

        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);

        for (Vehicle vehicle : vehicleinformationlist) {
            Object row[] = new Object[6];
            row[0] = vehicle;
            row[1] = vehicle.availability();
            row[2] = vehicle.getManufactured_year();
            row[3] = vehicle.getSerial_num();
            row[4] = vehicle.getModel();
            row[5] = vehicle.getAvailable_locality();
            dtm.addRow(row);
        }
    }

    public void populateTable() {
        logger.log(Level.INFO, "populateTable --ManageAmbulanceServiceJPanel");

        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);

        for (Vehicle vehicle : vehicleInformationList.getVehicleInformationList()) {
            Object row[] = new Object[6];
            row[0] = vehicle;
            row[1] = vehicle.availability();
            row[2] = vehicle.getManufactured_year();
            row[3] = vehicle.getSerial_num();
            row[4] = vehicle.getModel();
            row[5] = vehicle.getAvailable_locality();
            dtm.addRow(row);
        }
        comboBoxSerialNo.removeAllItems();
        comboBoxVehicleNo.removeAllItems();
        comboBoxManufacturer.removeAllItems();
        comboBoxSerialNo.addItem("Choose a Serial number");
        comboBoxVehicleNo.addItem("Choose a Vehicle number");
        comboBoxManufacturer.addItem("Choose a Manufacturer");
        combo1();
        combo2();
        combo3();
    }//GEN-LAST:event_btnViewFullDetailsActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnRefresh1ActionPerformed --ManageAmbulanceServiceJPanel");

        populateTable();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void btnConsolidatedSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsolidatedSearch1ActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnConsolidatedSearch1ActionPerformed --ManageAmbulanceServiceJPanel");

        templist.removeAll(templist);

        if (!btnYesVA.isSelected() && !btnNoVA.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select the vehicle availability status");
            return;
        }

        for (Vehicle vehicle : vehicleInformationList.getVehicleInformationList()) {
            //System.out.println((YesMainCert.isSelected()&&car.isMaintenance_certificate())||(NoMainCert.isSelected()&&!car.isMaintenance_certificate())||(NAmaincert.isSelected()));
            if ((comboBoxVehicleNo.getSelectedItem().equals(vehicle.getVehicleNo())
                    || comboBoxVehicleNo.getSelectedIndex() == 0)
                    && (comboBoxManufacturer.getSelectedItem().equals(vehicle.getModel())
                    || comboBoxManufacturer.getSelectedIndex() == 0)
                    && (comboBoxSerialNo.getSelectedItem().equals(vehicle.getSerial_num())
                    || comboBoxSerialNo.getSelectedIndex() == 0)
                    && (comboBoxLocality.getSelectedItem().equals(vehicle.getAvailable_locality())
                    || comboBoxLocality.getSelectedIndex() == 0)
                    && ((comboBoxManufacturedYear.getSelectedIndex() != 0 && comboBoxManufacturedYear.getSelectedItem()
                    == vehicle.getManufactured_year()) || comboBoxManufacturedYear.getSelectedIndex() == 0)
                    //&& (comboBoxManufacturedYear.getSelectedItem().equals(vehicle.getManufactured_year())
                    //    || comboBoxLocality.getSelectedIndex()==0)
                    && ((btnYesVA.isSelected() && vehicle.isAvailable()) || (btnNoVA.isSelected() && (vehicle.isAvailable() == false)))) {
                templist.add(vehicle);
            }
        }
        populateTable(templist);
        //&& (comboBoxLocality.getSelectedItem().equals(vehicle.getAvailable_locality())) 
        //(|| comboBoxLocality.getSelectedIndex()==0)
        //&& ((!txtManufacturedYear.getText().isEmpty()
        //    && Integer.parseInt(txtManufacturedYear.getText())
        //    == (vehicle.getManufactured_year() || txtManufacturedYear.getText().isEmpty())        

    }//GEN-LAST:event_btnConsolidatedSearch1ActionPerformed

    public void combo1() {
        logger.log(Level.INFO, "combo1 --ManageAmbulanceServiceJPanel");

        HashSet<String> hash = new HashSet<>();
        for (Vehicle u : vehicleInformationList.getVehicleInformationList()) {
            if (u.getVehicleNo() != null) {

                hash.add(u.getVehicleNo());
            }

        }
        for (String u : hash) {
            comboBoxVehicleNo.addItem(u);
        }

    }

    public void combo2() {
        logger.log(Level.INFO, "combo2 --ManageAmbulanceServiceJPanel");

        HashSet<String> hash = new HashSet<>();
        for (Vehicle u : vehicleInformationList.getVehicleInformationList()) {
            if (u.getModel() != null) {
                hash.add(u.getModel());
            }
        }

        for (String u : hash) {
            comboBoxManufacturer.addItem(u);
        }

    }

    public void combo3() {
        logger.log(Level.INFO, "combo3 --ManageAmbulanceServiceJPanel");

        HashSet<String> hash = new HashSet<>();
        for (Vehicle u : vehicleInformationList.getVehicleInformationList()) {
            if (u.getSerial_num() != null) {
                hash.add(u.getSerial_num());
            }
        }

        for (String u : hash) {
            comboBoxSerialNo.addItem(u);
        }

    }


    private void btnFirstAvailablePassengerCarActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
  
    }                                                             


    private void btnCurrentAvailableCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentAvailableCarsActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnCurrentAvailableCarsActionPerformed --ManageAmbulanceServiceJPanel");

        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        int count = 0;
        for (Vehicle vehicle : vehicleInformationList.getVehicleInformationList()) {
            if (vehicle.isAvailable() == true) {
                Object row[] = new Object[6];
                row[0] = vehicle;
                row[1] = vehicle.availability();
                row[2] = vehicle.getManufactured_year();
                row[3] = vehicle.getSerial_num();
                row[4] = vehicle.getModel();
                row[5] = vehicle.getAvailable_locality();
                dtm.addRow(row);
                count++;
            }
        }

        btnAvailability1.setText(String.valueOf(count));
    }//GEN-LAST:event_btnCurrentAvailableCarsActionPerformed

    private void btnCurrentUnavailableCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentUnavailableCarsActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnCurrentUnavailableCarsActionPerformed --ManageAmbulanceServiceJPanel");

        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        int count = 0;
        for (Vehicle vehicle : vehicleInformationList.getVehicleInformationList()) {
            if (vehicle.isAvailable() == false) {
                Object row[] = new Object[6];
                row[0] = vehicle;
                row[1] = vehicle.availability();
                row[2] = vehicle.getManufactured_year();
                row[3] = vehicle.getSerial_num();
                row[4] = vehicle.getModel();
                row[5] = vehicle.getAvailable_locality();
                dtm.addRow(row);
                count++;
            }
        }

        btnAvailability2.setText(String.valueOf(count));
    }//GEN-LAST:event_btnCurrentUnavailableCarsActionPerformed

    private void btnAvailability2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailability2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvailability2ActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnCreateActionPerformed --ManageAmbulanceServiceJPanel");

        CreateVehicleJPanel createVehicleJPanel = new CreateVehicleJPanel(userProcessContainer, vehicleInformationList, vehicle);
        userProcessContainer.add("CreateVehicleJPanel", createVehicleJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void comboBoxManufacturedYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxManufacturedYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxManufacturedYearActionPerformed

    private void comboBoxLocalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxLocalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxLocalityActionPerformed

                                                              


                                                     

                                                         

   
                                           

                                                         

                                                 

    private void btnFirstAvailablePassengerCar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailablePassengerCar1ActionPerformed
        // TODO add your handling code
              logger.log(Level.INFO, "btnFirstAvailablePassengerCarActionPerformed --ManageAmbulanceServiceJPanel");

        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);

        for (Vehicle vehicle : vehicleInformationList.getVehicleInformationList()) {
            if (vehicle.isAvailable() == true) {
                Object row[] = new Object[6];
                row[0] = vehicle;
                row[1] = vehicle.availability();
                row[2] = vehicle.getManufactured_year();
                row[3] = vehicle.getSerial_num();
                row[4] = vehicle.getModel();
                row[5] = vehicle.getAvailable_locality();

                dtm.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_btnFirstAvailablePassengerCar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnAvailability1;
    private javax.swing.JTextField btnAvailability2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConsolidatedSearch1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCurrentAvailableCars;
    private javax.swing.JButton btnCurrentUnavailableCars;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirstAvailablePassengerCar1;
    private javax.swing.JRadioButton btnNoVA;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnViewFullDetails;
    private javax.swing.JRadioButton btnYesVA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxLocality;
    private javax.swing.JComboBox<String> comboBoxManufacturedYear;
    private javax.swing.JComboBox<String> comboBoxManufacturer;
    private javax.swing.JComboBox<String> comboBoxSerialNo;
    private javax.swing.JComboBox<String> comboBoxVehicleNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables
}
