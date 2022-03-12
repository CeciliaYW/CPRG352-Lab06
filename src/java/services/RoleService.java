/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dataaccess.RoleDB;
import models.Role;

import java.util.ArrayList;

/**
 *
 * @author Cecilia Wang
 */

public class RoleService {
    public ArrayList<Role> getAll()  {
        return new RoleDB().getAll();
    }
}
