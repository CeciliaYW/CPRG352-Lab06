/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;

import dataaccess.UserDB;
import models.User;

/**
 *
 * @author Cecilia Wang
 */

public class UserService {
     public ArrayList<User> getAll() throws Exception  {
        return new UserDB().getAll();
    }

}
