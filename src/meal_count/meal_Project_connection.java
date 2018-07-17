package meal_count;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class meal_Project_connection {

	Connection conn=null;
	public static Connection ConnecrDb(){
		
		try{
			
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:meal_count_sqlite.sqlite");
			//JOptionPane.showMessageDialog(null, "Successfully Connected");
			
			return conn;
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "!..Database Connection Problem ..!");
			e.printStackTrace();
			return null;
		}
		
		
	}
}
