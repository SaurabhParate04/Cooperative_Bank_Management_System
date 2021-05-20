/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    public static Connection Connectdb() {
        Connection conn = null; // session between app and db
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/oopcp","root","12345678");
            return conn;
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
