package office_managment;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    private JFrame previousPage;
    private Connection con;
    private Connection mscon;
    private String userDatabaseName;
    public String userpass;

    public home(JFrame previousPage, Connection con, String userDatabaseName, Connection mscon, String userpass) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.con = con;
        this.mscon = mscon;
        this.previousPage = previousPage;
        this.userDatabaseName = userDatabaseName;
        this.userpass = userpass;
    }

    public home() {
        initComponents();
        this.previousPage = null;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        employBtn = new javax.swing.JButton();
        applyBtn = new javax.swing.JButton();
        statisticsBtn = new javax.swing.JButton();
        salaryBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Office Managment System");

        employBtn.setBackground(new java.awt.Color(0, 51, 102));
        employBtn.setForeground(new java.awt.Color(255, 255, 255));
        employBtn.setText("Employee");
        employBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employBtnActionPerformed(evt);
            }
        });

        applyBtn.setBackground(new java.awt.Color(0, 51, 102));
        applyBtn.setForeground(new java.awt.Color(255, 255, 255));
        applyBtn.setText("Apply");
        applyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyBtnActionPerformed(evt);
            }
        });

        statisticsBtn.setBackground(new java.awt.Color(0, 51, 102));
        statisticsBtn.setForeground(new java.awt.Color(255, 255, 255));
        statisticsBtn.setText("Statistics");
        statisticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsBtnActionPerformed(evt);
            }
        });

        salaryBtn.setBackground(new java.awt.Color(0, 51, 102));
        salaryBtn.setForeground(new java.awt.Color(255, 255, 255));
        salaryBtn.setText("Salary");
        salaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(153, 0, 51));
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Log Out");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statisticsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(applyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statisticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryBtnActionPerformed
        salary salaryPage = new salary(this, con); // Pass the 'Home' and 'user defind db' frame as a reference
        salaryPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salaryBtnActionPerformed

    private void employBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employBtnActionPerformed
        employee employeePage = new employee(this, con); // Pass the 'Home' and 'user defind db' frame as a reference
        employeePage.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_employBtnActionPerformed

    private void applyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyBtnActionPerformed
        apply applyPage = new apply(this, con); // Pass the 'Home' and 'user defind db' frame as a reference
        applyPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_applyBtnActionPerformed

    private void statisticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsBtnActionPerformed
        statistics statisticsPage = new statistics(this, con, userDatabaseName, mscon, userpass);
        statisticsPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_statisticsBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        try {
            // Close the database connection if it's open
            if (con != null && !con.isClosed()) {
                con.close();
                JOptionPane.showMessageDialog(
                        this,
                        "Log Out Succefully.",
                        "Connection Error",
                        JOptionPane.INFORMATION_MESSAGE
                );
                
                log_in loginPage = new log_in();
                loginPage.setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyBtn;
    private javax.swing.JButton employBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salaryBtn;
    private javax.swing.JButton statisticsBtn;
    // End of variables declaration//GEN-END:variables
}
