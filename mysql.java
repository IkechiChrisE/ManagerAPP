
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DONCHRIS
 */
public class mysql {
      String url = "jdbc:mysql://LocalHost:3306/donbase";
    String username = "root";
    String password = "donchris101";
    String drivers = "com.mysql.jdbc.Driver";
    Statement state;
    public mysql(){
        try{
          
          Class.forName(drivers);
          Connection con = DriverManager.getConnection(url,username,password);
          state = con.createStatement();
      }catch(ClassNotFoundException f){
          f.printStackTrace();
      } catch (SQLException ex) {  
           ex.printStackTrace();
        }  
        JOptionPane.showMessageDialog(null, "COONECTED TO DATA BASE");
    
}
    
}
