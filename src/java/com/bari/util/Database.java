package com.bari.util;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
public class Database {
      public static Connection getConnection() {
          try  {
              //Class.forName("com.mysql.jdbc.Driver");
              //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","dbpass");
              
              //Statement stmt = null;
            //Connection  conn = DriverManager.getConnection("jdbc:ucanaccess:////H:\\E\\Wasim\\Students\\WE\\Fall 2015\\22\\webdb.accdb","root","root");
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\me\\Documents\\NetBeansProjects\\hussnain\\webdb.accdb", "root", "root");
              
              return con;
          }
          catch(Exception ex) {
              System.out.println("Database.getConnection() Error -->" + ex.getMessage());
              return null;
          }
      }

       public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
          }
      }
}

/*
Connection conn = null;
        Statement stmt = null;

try{
	//conn = DriverManager.getConnection("jdbc:ucanaccess:////H:\\E\\Wasim\\Students\\WE\\Fall 2015\\10\\Code\\myDB.accdb");
    conn = DriverManager.getConnection("jdbc:ucanaccess:////H:\\E\\Wasim\\Students\\WE\\Fall 2015\\Lectures\\10\\Code\\myDB.accdb");
	stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("Select * from Student");
	
	while(rs.next()){
		int id = rs.getInt("id");
		String name = rs.getString("name");
		
		//System.out.println("ID : "+ id);
		//System.out.println("Name : "+ name);
                JOptionPane.showMessageDialog(null, id + " " +name);
	}
	//stmt.executeUpdate("Insert into Student(name) values('Wasim')");
	//stmt.executeUpdate("Delete from Student where name='Zee'");
	
	rs.close();
	stmt.close();
	conn.close();

}catch(Exception e){
	e.printStackTrace();
}

*/