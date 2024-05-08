
package model;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import view.SpendSmartApp;


public class DataBase {
    
    public static Connection mycon(){
         Connection connection = null;
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/spendsmart?useSSL=true&requireSSL=true&allowPublicKeyRetrieval=true";
            connection = (Connection) DriverManager.getConnection(url,"root","salma"); //change password for your own MySql server, mine's password is salma. 
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
            String sql = "SELECT * FROM utilisateur WHERE username = '"+username+"' AND password = '"+password+"';";
            ResultSet rs = stm.executeQuery(sql);
            isValid = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }
    public boolean signUpUser(String firstname,String lastname,String username,String email, String password) {
        boolean isSuccess = false;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = mycon();
            String sql = "INSERT INTO utilisateur (prenom, nom, username,email, password) VALUES (?, ?, ?, ?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, lastname);
            ps.setString(2, firstname);
            ps.setString(3, username);
            ps.setString(4, email);
            ps.setString(5, password);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
            isSuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return isSuccess;
    }
    
    public boolean findPassword(String email){
        boolean doesExist = false;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = mycon();
            String sql = "SELECT COUNT(*) FROM utilisateur WHERE email = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            // If the query returns a count greater than 0, the email exists;
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    doesExist = true;
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return doesExist;
    }
    public boolean changePassword(String email,String password){
        boolean changed = false;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = mycon();
            String sql = "UPDATE Utilisateur SET password = '?' WHERE email = '?';";
            ps = con.prepareStatement(sql);
            ps.setString(1, password);
            ps.setString(2, email);
            rs = ps.executeQuery();
            // the query returns a count greater than 0
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    changed = true;
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return changed;
    }
    public boolean enterExpense(String username,String expense, String description, String type, Date date) {
        boolean isEntered = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mycon();

            int userID = this.getUserIDByUsername(username);
            String sql = "INSERT INTO Depense (montant, date, description, typeExpense,userID) VALUES (?, ?, ?, ?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, expense);
            ps.setDate(2, new java.sql.Date(date.getTime()));
            ps.setString(3, description);
            ps.setString(4, type);
            ps.setInt(5, userID);
            

            int rowsAffected = ps.executeUpdate();
            // Check if rows were affected by the INSERT operation
            if (rowsAffected > 0) {
                isEntered = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            return isEntered;
    } 
    public boolean deleteExpense(String expense, String description, String type, Date date) {
        boolean isDeleted = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mycon();

            String sql = "DELETE FROM Depense WHERE montant = ? AND date = ? AND description = ? AND typeExpense = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, expense);
            ps.setDate(2, new java.sql.Date(date.getTime()));
            ps.setString(3, description);
            ps.setString(4, type);

            int rowsAffected = ps.executeUpdate();
            // Check if rows were affected by the DELETE operation
            if (rowsAffected > 0) {
                isDeleted = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            return isDeleted;
    } 
    public boolean modifyExpense(String expense, String description, String type, Date date) {
        boolean isEntered = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mycon();

            String sql = "UPDATE Depense SET montant = ?, date = ?, description = ?, typeExpense = ? WHERE date = ?;";
            ps = con.prepareStatement(sql);
            ps.setString(1, expense);
            ps.setDate(2, new java.sql.Date(date.getTime()));
            ps.setString(3, description);
            ps.setString(4, type);
            ps.setDate(2, new java.sql.Date(date.getTime()));

            int rowsAffected = ps.executeUpdate();
            // Check if rows were affected by the INSERT operation
            if (rowsAffected > 0) {
                isEntered = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            return isEntered;
    } 
    public ResultSet fetchData(String username){
        int userID = this.getUserIDByUsername(username);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = mycon();
            
            String sql = "SELECT d.montant, d.date, d.description, d.typeExpense FROM depense AS d JOIN utilisateur AS u ON d.userID = u.userID WHERE d.userID = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet fetchUser(String username){
        int userID =getUserIDByUsername(username);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = mycon();
            String sql = "SELECT prenom, nom, username, email, password FROM utilisateur WHERE userID = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;  
    }
    public ResultSet fetchReport(String username,int month){
        int userID =getUserIDByUsername(username);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = mycon();
            String sql = "SELECT montantCharge,budgetMensuel FROM charge WHERE userID = ? AND mois= ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.setInt(2, month);
            rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;  
    }
    public boolean updateUser(String prenom, String nom,String oldUsername, String newUsername,String email, String password){
        int userID = getUserIDByUsername(oldUsername);
        boolean isUpdated = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mycon();

            String sql = "UPDATE utilisateur SET prenom = ?, nom = ?, username = ?, email = ?, password= ? WHERE userID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, prenom);
            ps.setString(2, nom);
            ps.setString(3, newUsername);
            ps.setString(4, email);
            ps.setString(5, password);
            ps.setInt(6, userID);
            

            int rowsAffected = ps.executeUpdate();
            // Check if rows were affected by the INSERT operation
            if (rowsAffected > 0) {
                isUpdated = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            return isUpdated;
    }
    public boolean updateCharge(String username, double balance, int month, double monthlyBudget){
        int userID = getUserIDByUsername(username);
        boolean isUpdated = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mycon();

            String sql = "UPDATE charge SET budgetMensuel=?, mois=?, montantCharge=? WHERE userID = ?";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, monthlyBudget);
            ps.setDouble(2, month);
            ps.setDouble(3, balance);
            ps.setInt(4, userID);
            

            int rowsAffected = ps.executeUpdate();
            // Check if rows were affected by the INSERT operation
            if (rowsAffected > 0) {
                isUpdated = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            return isUpdated;
    }
    public boolean enterCharge(String username,double balance, double monthlyBudget, int month){
        boolean isEntered = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mycon();

            int userID = this.getUserIDByUsername(username);
            String sql = "INSERT INTO charge (budgetMensuel, mois, montantCharge, userID) VALUES (?, ?, ?,?)";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, balance);
            ps.setInt(2,month);
            ps.setDouble(3, monthlyBudget);
            ps.setInt(4, userID);
            
            

            int rowsAffected = ps.executeUpdate();
            // Check if rows were affected by the INSERT operation
            if (rowsAffected > 0) {
                isEntered = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            return isEntered;
    }
    public int getUserIDByUsername(String username) {
        
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int userID = -1; 
    
    try {
        con = mycon();
        
        String sql = "SELECT userID FROM utilisateur WHERE username = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, username);
        
        rs = ps.executeQuery();
        
        if (rs.next()) {
            userID = rs.getInt("userID");
        } else {
            System.out.println("User not found for username: " + username);
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    } 
        return userID;
    }
    
    
}
