/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Role;

/**
 *
 * @author Cecilia Wang
 */


public class RoleDB {
    public ArrayList<Role> getAll() {
        // initalize arraylist to return later
        ArrayList<Role> givenRoles = new ArrayList<Role>();
        
        // setup connection and grab connection from the pool
        ConnectionPool conPool = ConnectionPool.getInstance();
        Connection con = conPool.getConnection();

        // instantiate ps and rs for later
        PreparedStatement ps = null;
        ResultSet rs = null;

        // statement 
        String query = "SELECT * from role";

        try {
            // setup result set and prepared statement for later
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            // loop through the result set and make new role objects
            while (rs.next()) {
                givenRoles.add( new Role(rs.getInt(0), rs.getString(1)));
            }
            
        } catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            conPool.freeConnection(con);
        }


        return givenRoles;
    }
}
