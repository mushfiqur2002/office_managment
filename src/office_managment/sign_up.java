package office_managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class sign_up extends javax.swing.JFrame {

    private JFrame previousPage;
    private Connection con;  // database connection

    public sign_up(JFrame previousPage) {
        initComponents();
        this.previousPage = previousPage;
        this.setLocationRelativeTo(null);

        Office_managment dbCon = new Office_managment(); // master db connection
        con = dbCon.getConnection();
    }

    public sign_up() {
        initComponents();
        this.previousPage = null;

        Office_managment dbCon = new Office_managment(); // master db connection
        con = dbCon.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        databaseNameIn = new javax.swing.JTextField();
        userPassIn = new javax.swing.JTextField();
        userNameIn = new javax.swing.JTextField();
        signUpBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        log_in_page_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Office Managment System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("User Pass :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("User Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Database Name :");

        userNameIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameInActionPerformed(evt);
            }
        });

        signUpBtn.setText("SIGNUP");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("If you have already account. Please ");

        log_in_page_btn.setText("Log In");
        log_in_page_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_in_page_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(log_in_page_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(databaseNameIn)
                            .addComponent(userPassIn)
                            .addComponent(userNameIn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userPassIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(databaseNameIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(log_in_page_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void log_in_page_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_in_page_btnActionPerformed
        // --- navigate to log_in java --- \\
        log_in logInPage = new log_in(this);
        logInPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_log_in_page_btnActionPerformed

    private void userNameInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameInActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // --- perfromed sign up actions --- \\
        try {
            // Start transaction
            con.setAutoCommit(false);

            // Get data from the FORM
            String userName = userNameIn.getText();
            String userPass = userPassIn.getText();
            String userDatabaseName = databaseNameIn.getText();
            String hashPass = passwordUtils.hashPass(userPass);

            if (userName.isEmpty() || userPass.isEmpty() || userDatabaseName.isEmpty()) {
                throw new SQLException("All fields are required.");
            }

            // Insert user details into the 'user_sign_up' table in the master database
            PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO user_sign_up (userName, usePass, databaseName) VALUES (?, ?, ?)"
            );
            stm.setString(1, userName);
            stm.setString(2, hashPass);
            stm.setString(3, userDatabaseName);
            stm.executeUpdate();

            // Create a new database for the user
            java.sql.Statement stmt = con.createStatement();
            String createDatabaseQuery = "CREATE DATABASE `" + userDatabaseName + "`";
            stmt.executeUpdate(createDatabaseQuery);

            // Connect to the newly created user database
            Connection userDbConnection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:55000/" + userDatabaseName,
                    "root",
                    "root12"
            );

            // Create tables in the user-defined database
            java.sql.Statement userDbStmt = userDbConnection.createStatement();

            // Corrected employee table
            String createEmployeeTableQuery = """
        CREATE TABLE employee (
            employee_id INT PRIMARY KEY,
            employee_name VARCHAR(100) NOT NULL,
            employee_salary DECIMAL(10, 2),
            designation VARCHAR(100),
            qualification VARCHAR(100)
        )""";

            // Corrected salary table
            String createSalaryTableQuery = """
        CREATE TABLE salary (
            id INT AUTO_INCREMENT PRIMARY KEY,
            employee_id INT,
            employee_name VARCHAR(100) NOT NULL,
            employee_salary DECIMAL(10, 2),
            month VARCHAR(20),
            status VARCHAR(20),
            FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
        )""";
            
            String createApplyTableQuery = """
        CREATE TABLE apply (
            apply_id INT,
            name VARCHAR(100) NOT NULL,
            designation VARCHAR(100),
            qualification VARCHAR(100)
        )""";
            
            

            // Execute queries
            userDbStmt.executeUpdate(createEmployeeTableQuery);
            userDbStmt.executeUpdate(createSalaryTableQuery);
            userDbStmt.executeUpdate(createApplyTableQuery);

            // Commit transaction
            con.commit();

            // Successfully Message
            JOptionPane.showMessageDialog(
                    this,
                    "Sign Up successfully! Database and tables created.",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            // Reset the form
            userNameIn.setText("");
            userPassIn.setText("");
            databaseNameIn.setText("");

            // Close resources
            stm.close();
            stmt.close();
            userDbStmt.close();
            userDbConnection.close();

        } catch (SQLException ex) {
            // Rollback transaction on error
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Operation failed: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            ex.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true); // Reset auto-commit to default
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_signUpBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField databaseNameIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton log_in_page_btn;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JTextField userNameIn;
    private javax.swing.JTextField userPassIn;
    // End of variables declaration//GEN-END:variables
}
