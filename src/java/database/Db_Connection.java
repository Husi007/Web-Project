package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Db_Connection 
{
    public Connection Connection()
    {
        
            
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\me\\Documents\\NetBeansProjects\\hussnain\\Database.accdb", "root", "root");
            
            return con;
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Db_Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Db_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
