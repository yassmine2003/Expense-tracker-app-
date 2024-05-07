
package controller;

import java.sql.ResultSet;
import java.util.Date;
import model.DataBase;
import view.Login;


public class SpendSmartController {
    private DataBase model;
    private Login view;

    public SpendSmartController() {
        model = new DataBase();
        view = new Login();
    }
    public void initController(){
        view.setVisible(true);
    }

    public boolean authenticateUser(String username, String password) {
        return model.authenticateUser(username, password);
    }
    public boolean signUpUser(String firstname,String lastname,String username,String email, String password) {
        return model.signUpUser(firstname,lastname,username,email,password);
    }
    public boolean findPassword(String email){
        return model.findPassword(email);
    }
    public boolean changePassword(String email,String password){
        return model.changePassword(email,password);
    }
    public boolean enterExpense(String username,String expence,String description,String type,Date date){
        return model.enterExpense(username,expence, description, type, date);
    }
    public boolean deleteExpense(String expense, String description, String type, Date date) {
        return model.deleteExpense(expense, description, type, date);
    }
    public boolean modifyExpense(String expense, String description, String type, Date date) {
        return model.modifyExpense(expense, description, type, date);
    }
    public ResultSet fetchData(String username){
        return model.fetchData(username);
    }
    public ResultSet fetchUser(String username){
        return model.fetchUser(username);
    }
    public boolean updateUser(String prenom, String nom,String oldUsername, String newUsername,String email, String password){
        return model.updateUser(prenom, nom, oldUsername, newUsername, email, password);
    }
    public ResultSet fetchReport(String username, int month){
        return model.fetchReport(username,month);
    }
    public boolean updateCharge(String username, double balance, int month, double monthlyBudget){
        return model.updateCharge(username, balance, month, monthlyBudget);
    }
    public boolean enterCharge(String username,double balance, double monthlyBudget, int month){
        return model.enterCharge(username, balance, monthlyBudget, month);
    }
}
