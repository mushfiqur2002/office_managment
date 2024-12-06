package office_managment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class apply extends javax.swing.JFrame {

    private JFrame previousPage;
    private Connection con;

    public apply(JFrame previousPage, Connection con) {
        initComponents();
        this.previousPage = previousPage;
        this.setLocationRelativeTo(null);
        this.con = con;
        refreshBtn.doClick();
    }

    public apply() {
        initComponents();
        this.previousPage = null;
        refreshBtn.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        appliedName = new javax.swing.JTextField();
        applyId = new javax.swing.JTextField();
        applyDesignation = new javax.swing.JComboBox<>();
        applyQualification = new javax.swing.JComboBox<>();
        applicationAdd = new javax.swing.JButton();
        applicationApproved = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicationTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        backBtn.setText("<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Application Info");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Aplply ID :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Full Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Designaiton :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Qualification :");

        applyDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executive", "Account", "Manager", "Assistant" }));

        applyQualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BBA", "CA", "MBA", "CSE" }));

        applicationAdd.setText("ADD");
        applicationAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationAddActionPerformed(evt);
            }
        });

        applicationApproved.setText("APPROVED");
        applicationApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationApprovedActionPerformed(evt);
            }
        });

        applicationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Designation", "Qualification"
            }
        ));
        jScrollPane1.setViewportView(applicationTable);

        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("REMOVE");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(applyId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(applicationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(applicationApproved, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(applyQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(appliedName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(applyDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(applyId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appliedName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(applyDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(applyQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(applicationApproved, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(applicationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if (previousPage != null) {
            previousPage.setVisible(true); // Show Home page if reference exists
        }
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        try {
            int row = applicationTable.getSelectedRow();
            String apId = applicationTable.getValueAt(row, 0).toString();
            PreparedStatement stm = con.prepareStatement("DELETE FROM apply WHERE apply_id = ?");
            stm.setString(1, apId);
            stm.executeUpdate();

            JOptionPane.showMessageDialog(
                    this,
                    "Remove successfully!",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );

            refreshBtn.doClick();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) applicationTable.getModel();
        tableModel.setRowCount(0); // reset table
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM apply");

            while (rs.next()) {
                int applyID = rs.getInt("apply_id");
                String fname = rs.getString("name");
                String apdesignation = rs.getString("designation");
                String apqualification = rs.getString("qualification");

                tableModel.addRow(new Object[]{
                    applyID,
                    fname,
                    apdesignation,
                    apqualification
                });
            }
            rs.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void applicationAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationAddActionPerformed
        try {
            // get data from FORM
            int apID = Integer.parseInt(applyId.getText());
            String fName = appliedName.getText();
            String selectedDesignation = (String) applyDesignation.getSelectedItem();
            String selectedQualification = (String) applyQualification.getSelectedItem();

            // for apply table 
            PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO apply VALUES(?,?,?,?)" // Insertion sql cmd
            );

            // set data in DATABASE
            stm.setInt(1, apID);
            stm.setString(2, fName);
            stm.setString(3, selectedDesignation);
            stm.setString(4, selectedQualification);

            stm.execute();

            JOptionPane.showMessageDialog(
                    this,
                    "Insertion completed successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            // reset the FORM
            applyId.setText("");
            appliedName.setText("");
            applyDesignation.setSelectedIndex(-1);
            applyQualification.setSelectedIndex(-1);

            refreshBtn.doClick();  // load data

            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, "Error executing insert statement", ex);
        }
    }//GEN-LAST:event_applicationAddActionPerformed

    private void applicationApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationApprovedActionPerformed
        try {
            // get data from FORM
            int apID = Integer.parseInt(applyId.getText());
            String fName = appliedName.getText();
            String selectedDesignation = (String) applyDesignation.getSelectedItem();
            String selectedQualification = (String) applyQualification.getSelectedItem();

            // for employee table 
            PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO employee (employee_id, employee_name,designation,qualification) VALUES(?,?,?,?)" // Insertion sql cmd
            );

            // set data in DATABASE
            stm.setInt(1, apID);
            stm.setString(2, fName);
            stm.setString(3, selectedDesignation);
            stm.setString(4, selectedQualification);

            stm.execute();

            JOptionPane.showMessageDialog(
                    this,
                    "Insertion completed successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            // reset the FORM
            appliedName.setText("");
            applyId.setText("");
            applyDesignation.setSelectedIndex(-1);
            applyQualification.setSelectedIndex(-1);

            refreshBtn.doClick();  // load data

            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, "Error executing insert statement", ex);
        }
    }//GEN-LAST:event_applicationApprovedActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        applyId.setEditable(false);
        DefaultTableModel model = (DefaultTableModel) applicationTable.getModel();

        // Check if a row is selected
        int row = applicationTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select a row to edit.",
                    "No Selection",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Retrieve data from the selected row
        int apid = (int) model.getValueAt(row, 0);
        String fname = (String) model.getValueAt(row, 1);
        String apdesignation = (String) model.getValueAt(row, 2);
        String apqualification = (String) model.getValueAt(row, 3);

        // Set the values in the form fields
        applyId.setText(String.valueOf(apid));
        appliedName.setText(fname);
        applyDesignation.setSelectedItem(apdesignation);
        applyQualification.setSelectedItem(apqualification);
    }//GEN-LAST:event_editBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applicationAdd;
    private javax.swing.JButton applicationApproved;
    private javax.swing.JTable applicationTable;
    private javax.swing.JTextField appliedName;
    private javax.swing.JComboBox<String> applyDesignation;
    private javax.swing.JTextField applyId;
    private javax.swing.JComboBox<String> applyQualification;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}
