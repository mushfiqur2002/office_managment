package office_managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Office_managment {
    private Connection con;
    public Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:55000/master_db", "root", "root12");
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM user_sign_up");
                stm.close();
                
                System.out.println("Database connected successfully!");
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Office_managment.class.getName()).log(Level.SEVERE, "Driver not found!", ex);
            } catch (SQLException ex) {
                Logger.getLogger(Office_managment.class.getName()).log(Level.SEVERE, "Failed to connect to database!", ex);
            }
        }else{
            System.out.println("Database not connected successfully!");
        }
        return con;
    }

    public static void main(String[] args) {
        log_in lf = new log_in();
        lf.show();
    }
    
}
