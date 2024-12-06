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

public class employee extends javax.swing.JFrame {

    private JFrame previousPage;
    private Connection con;

    //---> FIND PREVIOUS PAGE <---\\
    public employee(JFrame previousPage, Connection con) {
        initComponents();
        this.previousPage = previousPage;
        this.setLocationRelativeTo(null);
        this.con = con;
        refreshBtn.doClick();
    }

    //---> NO PREVIOUS PAGE <---\\
    public employee() {
        initComponents();
        this.previousPage = null;
        refreshBtn.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        emsalary = new javax.swing.JTextField();
        designation = new javax.swing.JComboBox<>();
        qualification = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        rmvBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        emID1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Employee Details");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Full Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Employee ID :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Designation :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Qualification :");

        emsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emsalaryActionPerformed(evt);
            }
        });

        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executive", "Account", "Manager", "Assistant", " " }));

        qualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BBA", "CA", "MBA", "CSE" }));

        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Employee Table");

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Designation", "Qualification", "Salary"
            }
        ));
        employeeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(employeeTable);

        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        rmvBtn.setText("REMOVE");
        rmvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmvBtnActionPerformed(evt);
            }
        });

        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        emID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emID1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Monthly Salary :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emID1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rmvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rmvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(emID1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emsalaryActionPerformed

    }//GEN-LAST:event_emsalaryActionPerformed

    //---> Back Button Functionality <---\\ 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (previousPage != null) {
            previousPage.setVisible(true); // Show Home page if reference exists
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //----> INSERTING DATA IN DATABASE CLICKING ADD BUTTON <-----//    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            // get data from FORM
            int employeeID = Integer.parseInt(emID1.getText());
            int employeesalary = Integer.parseInt(emsalary.getText());
            String fName = fullName.getText();
            String selectedDesignation = (String) designation.getSelectedItem();
            String selectedQualification = (String) qualification.getSelectedItem();

            // for employee table 
            PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO employee VALUES(?,?,?,?,?)" // Insertion sql cmd
            );

            // set data in DATABASE
            stm.setInt(1, employeeID);
            stm.setString(2, fName);
            stm.setInt(3, employeesalary);
            stm.setString(4, selectedDesignation);
            stm.setString(5, selectedQualification);

            stm.execute();

            // for salary table
            PreparedStatement salaryStm = con.prepareStatement(
                    "INSERT INTO salary (employee_id, employee_name, employee_salary) VALUES (?, ?, ?)"
            );

            // set data in DATABASE 
            salaryStm.setInt(1, employeeID);
            salaryStm.setString(2, fName);
            salaryStm.setInt(3, employeesalary);

            salaryStm.execute();

            JOptionPane.showMessageDialog(
                    this,
                    "Insertion completed successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            // reset the FORM
            emID1.setText("");
            emsalary.setText("");
            fullName.setText("");
            designation.setSelectedIndex(-1);
            qualification.setSelectedIndex(-1);

            refreshBtn.doClick();  // load data

            stm.close();
            salaryStm.close();
        } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, "Error executing insert statement", ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    //----> REFRESHING DATA <-----// 
    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) employeeTable.getModel();
        tableModel.setRowCount(0); // reset table
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                Integer emID = rs.getObject("employee_id") != null ? rs.getInt("employee_id") : null;
                Integer emSalary = rs.getObject("employee_salary") != null ? rs.getInt("employee_salary") : null;
                String fname = rs.getString("employee_name");
                String emdesignation = rs.getString("designation");
                String emqualification = rs.getString("qualification");

                tableModel.addRow(new Object[]{
                    emID,
                    fname,
                    emdesignation,
                    emqualification,
                    emSalary
                });
            }
            rs.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void rmvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmvBtnActionPerformed
        int row = employeeTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "No row selected!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String emId = employeeTable.getValueAt(row, 0).toString();

        try {
            con.setAutoCommit(false); // Begin transaction

            // Delete dependent rows from salary table
            try (PreparedStatement stmt = con.prepareStatement("DELETE FROM salary WHERE employee_id = ?")) {
                stmt.setString(1, emId);
                stmt.executeUpdate();
            }

            // Delete the row from employee table
            try (PreparedStatement stm = con.prepareStatement("DELETE FROM employee WHERE employee_id = ?")) {
                stm.setString(1, emId);
                stm.executeUpdate();
            }

            con.commit(); // Commit transaction

            JOptionPane.showMessageDialog(
                    this,
                    "Removed successfully!",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE
            );

            refreshBtn.doClick();
        } catch (SQLException ex) {
            try {
                con.rollback(); // Rollback on failure
            } catch (SQLException rollbackEx) {
                Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, rollbackEx);
            }
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    this,
                    "Error occurred while deleting!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }


    }//GEN-LAST:event_rmvBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        emID1.setEditable(false);
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();

        // Check if a row is selected
        int row = employeeTable.getSelectedRow();
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
        int emid = (int) model.getValueAt(row, 0);
        String fname = (String) model.getValueAt(row, 1);
        String emdesignation = (String) model.getValueAt(row, 2);
        String emqualification = (String) model.getValueAt(row, 3);
        int esalary = (int) model.getValueAt(row, 4);

        // Set the values in the form fields
        emID1.setText(String.valueOf(emid));
        fullName.setText(fname);
        emsalary.setText(String.valueOf(esalary));
        designation.setSelectedItem(emdesignation);
        qualification.setSelectedItem(emqualification);
    }//GEN-LAST:event_editBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //PreparedStatement stm;
        try {
            PreparedStatement stm = con.prepareStatement( // update sql cmd
                    "UPDATE employee SET employee_name = ?,"
                    + "employee_salary = ?, "
                    + "designation = ?, "
                    + "qualification = ? "
                    + "WHERE employee_id = ?"
            );
            stm.setString(1, fullName.getText());
            stm.setInt(2, Integer.parseInt(emsalary.getText()));
            stm.setString(3, (String) designation.getSelectedItem());
            stm.setString(4, (String) qualification.getSelectedItem());
            stm.setInt(5, Integer.parseInt(emID1.getText()));

            int rowsUpdated = stm.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Update completed successfully!",
                        "Success", JOptionPane.INFORMATION_MESSAGE
                );
                // Clear the form fields after update
                emsalary.setText("");
                emID1.setText("");
                fullName.setText("");
                designation.setSelectedIndex(-1);
                qualification.setSelectedIndex(-1);

                // Refresh the table
                refreshBtn.doClick();
            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Update failed. Please check the employee ID.",
                        "Error", JOptionPane.ERROR_MESSAGE
                );
            }

            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void emID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emID1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> designation;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField emID1;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField emsalary;
    private javax.swing.JTextField fullName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> qualification;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton rmvBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
