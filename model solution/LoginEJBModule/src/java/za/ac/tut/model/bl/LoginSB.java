/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import javax.ejb.Stateless;

/**
 *
 * @author MemaniV
 */
@Stateless
public class LoginSB implements LoginSBLocal {

    @Override
    public boolean areLoginCredentialsValid(String username, String password, String correctUsername, String correctPassword) {
        boolean valid = false;
        
        if(username.equals(correctUsername) && password.equals(correctPassword)){
            valid = true;
        }
        
        return valid;
    }
}
