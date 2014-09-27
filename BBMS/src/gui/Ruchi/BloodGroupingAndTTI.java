/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.Ruchi;

import java.awt.Color;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruchiranga
 */
public class BloodGroupingAndTTI extends javax.swing.JInternalFrame {

    BloodGroupingAndTTIHandler handler;
    DefaultTableModel dtm;

    /**
     * Creates new form BloodGrouping
     *
     */
    public BloodGroupingAndTTI() {
        initComponents();

        try {
            handler = new BloodGroupingAndTTIHandler();
        } catch (SQLException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] packetList = null;
        try {
            packetList = handler.getPacketIDList();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String id : packetList) {
            packetIDListCombo.addItem(id);
        }

        String[] groupList = null;

        try {
            groupList = handler.getGroupList();
        } catch (SQLException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String group : groupList) {
            bloodGroupCombo.addItem(group);
        }

        String[] testList = null;

        try {
            testList = handler.getTestList();
        } catch (SQLException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String test : testList) {
            testListCombo.addItem(test);
        }

        ButtonGroup group = new ButtonGroup();
        group.add(negativeRadioButton);
        group.add(positiveRadioButton);
        negativeRadioButton.setSelected(true);

        String[] columns = {"Test Name", "Result", "Comments"};
        dtm = new DefaultTableModel(columns, 0);
        testTable.setModel(dtm);

        String[] emp = null;

        try {
            emp = handler.getEmployeeList();
        } catch (SQLException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String name : emp) {
            doneByComboBox.addItem(name);
            checkedByComboBox.addItem(name);
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        dateText.setText(dateFormat.format(date));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        commentsTextField = new javax.swing.JTextField();
        testListCombo = new javax.swing.JComboBox();
        negativeRadioButton = new javax.swing.JRadioButton();
        positiveRadioButton = new javax.swing.JRadioButton();
        addToListButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        testTable = new javax.swing.JTable();
        deleteRowButton = new javax.swing.JButton();
        doneByComboBox = new javax.swing.JComboBox();
        checkedByComboBox = new javax.swing.JComboBox();
        generateLabelButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        discardPacketCheckBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        bloodGroupCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        groupCommentTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        donorTextField = new javax.swing.JTextField();
        blacklistdonerButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        packetIDListCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setTitle("Blood Grouping and TTI");

        jLabel3.setText("Tests done by");

        jLabel4.setText("Results checked by");

        jLabel5.setText("Date");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tests"));

        jLabel6.setText("Test name");

        jLabel7.setText("Result");

        jLabel8.setText("Special Comments");

        negativeRadioButton.setText("Negative");

        positiveRadioButton.setText("Positive");
        positiveRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positiveRadioButtonActionPerformed(evt);
            }
        });

        addToListButton.setText("Add to list");
        addToListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToListButtonActionPerformed(evt);
            }
        });

        testTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Name", "Result", "Comments"
            }
        ));
        jScrollPane1.setViewportView(testTable);

        deleteRowButton.setText("Delete row");
        deleteRowButton.setEnabled(false);
        deleteRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(commentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(testListCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(negativeRadioButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(positiveRadioButton)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addToListButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteRowButton)))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(testListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(negativeRadioButton)
                    .addComponent(positiveRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(commentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToListButton)
                    .addComponent(deleteRowButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        generateLabelButton.setText("Generate Packet Label");
        generateLabelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateLabelButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        discardPacketCheckBox.setText("Discard Packet");
        discardPacketCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardPacketCheckBoxActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ABO Typing Test"));

        jLabel2.setText("Blood Group");

        jLabel12.setText("Special Comment");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupCommentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bloodGroupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bloodGroupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(groupCommentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Donor"));

        donorTextField.setEnabled(false);

        blacklistdonerButton.setText("Blacklist donor");
        blacklistdonerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blacklistdonerButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Donor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blacklistdonerButton)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(donorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blacklistdonerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Packet"));

        packetIDListCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packetIDListComboActionPerformed(evt);
            }
        });

        jLabel1.setText("Blood Packet ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(packetIDListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(packetIDListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dateText.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel10.setText("Blood Grouping and TTI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doneByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(discardPacketCheckBox)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkedByComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(generateLabelButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(discardPacketCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(doneByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkedByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateLabelButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void positiveRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positiveRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positiveRadioButtonActionPerformed

    private void discardPacketCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardPacketCheckBoxActionPerformed
        if (discardPacketCheckBox.isSelected()) {
            int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to discard this packet?", "Are You sure?", JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                generateLabelButton.setText("      OK      ");
            } else {
                discardPacketCheckBox.setSelected(false);
            }
        } else {
            generateLabelButton.setText("Generate Packet Label");
        }
    }//GEN-LAST:event_discardPacketCheckBoxActionPerformed

    private void packetIDListComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packetIDListComboActionPerformed
        String packetID = (String) packetIDListCombo.getSelectedItem();

        try {
            try {
                donorTextField.setText(handler.getDonorNameOf(packetID));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String donorID = handler.getDonorIDOF(packetID);

        boolean isBlackListed = false;
        try {
            isBlackListed = handler.isDonorBlacklisted(donorID);
        } catch (SQLException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (isBlackListed) {
            blacklistdonerButton.setText("Blacklisted");
            blacklistdonerButton.setForeground(Color.RED);
            blacklistdonerButton.setEnabled(false);
        } else {
            blacklistdonerButton.setText("Blacklist Donor");
            blacklistdonerButton.setEnabled(true);
        }

    }//GEN-LAST:event_packetIDListComboActionPerformed

    private void blacklistdonerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blacklistdonerButtonActionPerformed

        int choice;
        choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to blacklist this donor?", "Are you Sure?", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            String name = donorTextField.getText();
            int res = 0;
            try {
                res = handler.blacklistDonor(name);

            } catch (SQLException ex) {
                Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (res == 1) {
                blacklistdonerButton.setText("Blacklisted");
                blacklistdonerButton.setEnabled(false);
            } else {
                JOptionPane.showInternalMessageDialog(this, "Failed to blacklist donor", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }





    }//GEN-LAST:event_blacklistdonerButtonActionPerformed

    private void addToListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToListButtonActionPerformed
        String testName = (String) testListCombo.getSelectedItem();
        String result = null;
        String comments = null;

        if (negativeRadioButton.isSelected()) {
            result = "Negative";
        } else {
            result = "Positive";
        }

        if (commentsTextField.getText().isEmpty()) {
            comments = "None";
        } else {
            comments = commentsTextField.getText();
        }
        String[] row = {testName, result, comments};
        dtm.addRow(row);

        if (dtm.getRowCount() > 0) {
            deleteRowButton.setEnabled(true);
        } else {
            deleteRowButton.setEnabled(false);
        }

        commentsTextField.setText("");
    }//GEN-LAST:event_addToListButtonActionPerformed

    private void deleteRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRowButtonActionPerformed
        dtm.removeRow(dtm.getRowCount() - 1);
        if (dtm.getRowCount() > 0) {
            deleteRowButton.setEnabled(true);
        } else {
            deleteRowButton.setEnabled(false);
        }
    }//GEN-LAST:event_deleteRowButtonActionPerformed

    private void generateLabelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateLabelButtonActionPerformed

        String packetID = (String) packetIDListCombo.getSelectedItem();
        String group = (String) bloodGroupCombo.getSelectedItem();
        String groupComment = groupCommentTextField.getText();

        try {
            handler.addBloodGroupResult(packetID, group, groupComment);
        } catch (SQLException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }


        String date = dateText.getText();
        String doneBy = (String) doneByComboBox.getSelectedItem();
        String checkedBy = (String) checkedByComboBox.getSelectedItem();

        int testCount = dtm.getRowCount();
        for (int i = 0; i < testCount; i++) {
            String testName = (String)dtm.getValueAt(i, 0);
            String result = (String)dtm.getValueAt(i, 1);
            String comment = (String)dtm.getValueAt(i, 2);
            
            try {
                handler.addTestResult(testName, packetID, result, comment, date, doneBy, checkedBy);
            } catch (Exception ex) {
                Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(discardPacketCheckBox.isSelected()){
            try {
                handler.setPacketDiscarded(packetID,date);
            } catch (SQLException ex) {
                Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                                                 

    }//GEN-LAST:event_generateLabelButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(BloodGroupingAndTTI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToListButton;
    private javax.swing.JButton blacklistdonerButton;
    private javax.swing.JComboBox bloodGroupCombo;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox checkedByComboBox;
    private javax.swing.JTextField commentsTextField;
    private javax.swing.JTextField dateText;
    private javax.swing.JButton deleteRowButton;
    private javax.swing.JCheckBox discardPacketCheckBox;
    private javax.swing.JComboBox doneByComboBox;
    private javax.swing.JTextField donorTextField;
    private javax.swing.JButton generateLabelButton;
    private javax.swing.JTextField groupCommentTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton negativeRadioButton;
    private javax.swing.JComboBox packetIDListCombo;
    private javax.swing.JRadioButton positiveRadioButton;
    private javax.swing.JComboBox testListCombo;
    private javax.swing.JTable testTable;
    // End of variables declaration//GEN-END:variables
}
