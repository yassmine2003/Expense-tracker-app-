/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DataBase;


public class SpendSmartController {
    private DataBase model;

    public SpendSmartController() {
        model = new DataBase();
    }

    public boolean authenticateUser(String username, String password) {
        return model.authenticateUser(username, password);
    }
    public boolean signUpUser(String firstname,String lastname,String username, String password){
        return model.signUpUser(firstname,lastname,username,password);
    }
    
}
