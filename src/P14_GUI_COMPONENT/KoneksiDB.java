package P14_GUI_COMPONENT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KoneksiDB {
    
    public Connection connection;
    
    public KoneksiDB(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pbo",
                    "root","");            
            JOptionPane.showMessageDialog(null, "terkoneksi database");            
        } 
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "gagal terkoneksi database");
            System.exit(0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    } 
    
    public static void main(String[] args) {
        new KoneksiDB();
    }
}
