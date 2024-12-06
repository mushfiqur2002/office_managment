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

public class salary extends javax.swing.JFrame {

    private JFrame previousPage;
    private Connection con;

    //---> FIND PREVIOUS PAGE <---\\za
    public salary(JFrame previousPage, Connection con) {
        initComponents();
        this.previousPage = previousPage;
        this.setLocationRelativeTo(null);

        this.con = con;

        System.out.println("connection ----->" + con);
    }

    //---> NO PREVIOUS PAGE <---\\
    public salary() {
        initComponents();
        this.previousPage = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        monthSelector = new javax.swing.JComboBox<>();
        statusbarselector = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        idtextfield = new javax.swing.JTextField();
        nametextfield = new javax.swing.JTextField();
        salarytextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableforsalaryup = new javax.swing.JTable();
        dataupdatebtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        salaryMonth = new javax.swing.JComboBox<>();
        editBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Table");

        backBtn.setText("<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Details ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Employee Id : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Employee Name : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Employee Salary :");

        monthSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "January", "February", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "December" }));
        monthSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthSelectorActionPerformed(evt);
            }
        });

        statusbarselector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Unpaid", "Upcoming", " " }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Salary Status :");

        tableforsalaryup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Salary", "Status", "Month"
            }
        ));
        jScrollPane1.setViewportView(tableforsalaryup);

        dataupdatebtn.setText("UPDATE");
        dataupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataupdatebtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Salary Month : ");

        salaryMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "December" }));

        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(salaryMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(statusbarselector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(salarytextfield))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nametextfield))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)))
                    .addComponent(dataupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(253, 253, 253))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(monthSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salarytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusbarselector, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(dataupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //---> Back Button Functionality <---\\ 
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if (previousPage != null) {
            previousPage.setVisible(true); // Show Home page if reference exists
        }
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void dataupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataupdatebtnActionPerformed
        try {
            // Prepare the SQL statement for insert or update
            PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO salary (employee_id, employee_name, employee_salary, month, status) "
                    + "VALUES (?, ?, ?, ?, ?) "
                    + "ON DUPLICATE KEY UPDATE "
                    + "employee_name = ?, employee_salary = ?, status = ?"
            );

            // Set values for the insert or update query
            int employeeId = Integer.parseInt(idtextfield.getText());
            String employeeName = nametextfield.getText();
            int salary = Integer.parseInt(salarytextfield.getText());
            String month = (String) salaryMonth.getSelectedItem();
            String status = (String) statusbarselector.getSelectedItem();

            stm.setInt(1, employeeId); // For INSERT
            stm.setString(2, employeeName);
            stm.setInt(3, salary);
            stm.setString(4, month);
            stm.setString(5, status);

            // For UPDATE in case the record already exists
            stm.setString(6, employeeName);
            stm.setInt(7, salary);
            stm.setString(8, status);

            // Execute the query
            int rowsAffected = stm.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Salary record updated successfully for " + month + "!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );

                // Clear the form fields after update
                salarytextfield.setText("");
                idtextfield.setText("");
                nametextfield.setText("");
                salaryMonth.setSelectedIndex(0);
                statusbarselector.setSelectedIndex(0);

                // Refresh the table to reflect changes
                refreshBtn.doClick();
            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Update failed. Please check the employee details.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_dataupdatebtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Database connection is not initialized.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tableModel = (DefaultTableModel) tableforsalaryup.getModel();
        tableModel.setRowCount(0); // Reset the table

        try {
            String selectedMonth = (String) monthSelector.getSelectedItem(); // Dropdown for months
            String query;

            // Check if the selected option is "All"
            if (selectedMonth.equalsIgnoreCase("All")) {
                query = "SELECT * FROM salary";
            } else {
                query = "SELECT * FROM salary WHERE month = ?";
            }

            PreparedStatement stm = con.prepareStatement(query);

            // If not "All", set the month parameter in the query
            if (!selectedMonth.equalsIgnoreCase("All")) {
                stm.setString(1, selectedMonth);
            }

            ResultSet rs = stm.executeQuery();

            // Populate the table
            while (rs.next()) {
                int emID = rs.getInt("employee_id");
                int emSalary = rs.getInt("employee_salary");
                String fname = rs.getString("employee_name");
                String month = rs.getString("month") != null ? rs.getString("month") : "Upcoming";
                String status = rs.getString("status") != null ? rs.getString("status") : "Upcoming";

                tableModel.addRow(new Object[]{emID, fname, emSalary, status, month});
            }

            rs.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while refreshing data.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_refreshBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        idtextfield.setEditable(false);
        nametextfield.setEditable(false);
        salarytextfield.setEditable(false);
        salaryMonth.setEditable(false);
        DefaultTableModel model = (DefaultTableModel) tableforsalaryup.getModel();

        // Check if a row is selected
        int row = tableforsalaryup.getSelectedRow();
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
        int esalary = (int) model.getValueAt(row, 2);
        String status = (String) model.getValueAt(row, 3);
        String month = (String) model.getValueAt(row, 4);

        // Set the values in the form fields
        idtextfield.setText(String.valueOf(emid));
        nametextfield.setText(fname);
        salarytextfield.setText(String.valueOf(esalary));
        salaryMonth.setSelectedItem(month);
        statusbarselector.setSelectedItem(status);
    }//GEN-LAST:event_editBtnActionPerformed

    private void monthSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthSelectorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton dataupdatebtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField idtextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> monthSelector;
    private javax.swing.JTextField nametextfield;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JComboBox<String> salaryMonth;
    private javax.swing.JTextField salarytextfield;
    private javax.swing.JComboBox<String> statusbarselector;
    private javax.swing.JTable tableforsalaryup;
    // End of variables declaration//GEN-END:variables
}
