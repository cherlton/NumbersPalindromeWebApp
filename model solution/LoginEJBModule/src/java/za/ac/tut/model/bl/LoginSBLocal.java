/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import javax.ejb.Local;

/**
 *
 * @author MemaniV
 */
@Local
public interface LoginSBLocal {
    boolean areLoginCredentialsValid(String username, String password, String correctUsername, String correctPassword);
}
