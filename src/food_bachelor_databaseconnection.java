


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class food_bachelor_databaseconnection {
    Connection conn=null;
    public static Connection connecrDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bachelor","root","");
            JOptionPane.showMessageDialog(null, "Database Connected");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sorry ! Database Connection Failed");
            return null;
        }
    }
}
