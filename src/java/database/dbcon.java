/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class dbcon {
    Connection con=null;
    public Connection getcon()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/frodo","root","");
        }catch(Exception ex)
        {
            
        }
        return con;
        
    }
}
