package office_managment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class log_in extends javax.swing.JFrame {

    private JFrame previousPage;
    private Connection con;

    public log_in(JFrame previousPage) {
        initComponents();
        this.previousPage = previousPage;
        this.setLocationRelativeTo(null);

        Office_managment dbCon = new Office_managment(); // master db connection
        con = dbCon.getConnection();

        if (con == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Database connection failed! Please check your settings.",
                    "Connection Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            System.out.println("Connection established in log_in class.");
        }
    }

    public log_in() {
        initComponents();
        this.previousPage = null;
        this.setLocationRelativeTo(null);

        Office_managment dbCon = new Office_managment(); // master db connection
        con = dbCon.getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Database connection failed! Please check your settings.",
                    "Connection Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            System.out.println("Connection established in log_in class.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        userPass = new javax.swing.JTextField();
        logInBtn = new javax.swing.JButton();
        sign_up_page = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Office Managment System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Pass :");

        logInBtn.setText("LOG IN");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        sign_up_page.setText("Sign Up");
        sign_up_page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_pageActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("If you have no account. Please ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(userPass, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sign_up_page, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sign_up_page, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        if (con == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "No active database connection. Please restart the application.",
                    "Connection Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        try {
            // Get user inputs from the login form
            String loginUsername = userName.getText();
            String loginPassword = userPass.getText();

            String logHashPass = passwordUtils.hashPass(loginPassword);

            // Validate credentials and fetch the associated database name
            String query = "SELECT databaseName,usePass FROM user_sign_up WHERE userName = ?";
            PreparedStatement validateStmt = con.prepareStatement(query);
            validateStmt.setString(1, loginUsername);
            ResultSet rs = validateStmt.executeQuery();

            if (rs.next()) {
                // Retrieve the user database name
                String userDatabaseName = rs.getString("databaseName");
                String userPassword = rs.getString("usePass");

                if (userPassword.equals(logHashPass)) {
                    // Connect to the user-defined database
                    Connection userDbConnection = DriverManager.getConnection(
                            "jdbc:mysql://localhost:55000/" + userDatabaseName, // Adjust port if necessary
                            "root",
                            "root12"
                    );

                    JOptionPane.showMessageDialog(
                            this,
                            "Login successful",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                    home homePage = new home(this, userDbConnection, userDatabaseName, con,loginPassword); // Pass the data in home page
                    homePage.setVisible(true);

                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(
                            this,
                            "Password Wrong",
                            "Success",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                // Invalid credentials
                JOptionPane.showMessageDialog(
                        this,
                        "Invalid username or password.",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE
                );
            }

            // Close the master_db validation statement
            validateStmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "An error occurred during login. Please check the logs.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            ex.printStackTrace();
        }


    }//GEN-LAST:event_logInBtnActionPerformed

    private void sign_up_pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_pageActionPerformed
        sign_up signUpPage = new sign_up(this); // Pass the 'Home' frame as a reference
        signUpPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sign_up_pageActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logInBtn;
    private javax.swing.JButton sign_up_page;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userPass;
    // End of variables declaration//GEN-END:variables
}
