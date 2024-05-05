/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import view.SpendSmartApp;

/**
 *
 * @author HP
 */
public class DataBase {
    
    public static Connection mycon(){
         Connection connection = null;
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test_database?useSSL=true&requireSSL=true&allowPublicKeyRetrieval=true";
            connection = (Connection) DriverManager.getConnection(url,"root","salma"); 
        }catch(Exception e ){
            System.out.print(e);
        }
        return connection;
    }
    public boolean authenticateUser(String username, String password) {
        boolean isValid = false;
        Connection con = null;
        try {
            java.sql.Statement stm = mycon().createStatement();
            String sql = "SELECT * FROM users WHERE username = '"+username+"' AND password = '"+password+"';";
            ResultSet rs = stm.executeQuery(sql);
            isValid = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }
    public static boolean signUpUser(String firstname,String lastname,String username, String password) {
        boolean isSuccess = false;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = mycon();
            String sql = "INSERT INTO users (username, name, lastname, password) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.setString(4, password);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
            isSuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return isSuccess;
    }
    
    
}
