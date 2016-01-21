package beans;

import static com.oracle.util.Checksums.update;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import database.Db_Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User 
{
    private String first_name,last_name,email,pwd;
    
    public User()
    {
        first_name="";
        last_name="";
        email="";
        pwd="";
    }        

   
 
    //----------------------------------//
    
    public String getFirst_name() 
    {
        return first_name;
    }
    
    public String getLast_name() 
    {
        return last_name;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getPwd() 
    {
        return pwd;
    }
    
    //----------------------------------//
    
    public void setFirst_name(String first_name) 
    {
        this.first_name =first_name;
    }

    public void setLast_name(String last_name) 
    {
        this.last_name =last_name;
    }

    public void setEmail(String email) 
    {
        this.email=email;
    }

    public void setPwd(String pwd) 
    {
        this.pwd=pwd;
    }
    
    //----------------------------------//
      
    public void RegisterUser()
    {
        try
        {    
            Db_Connection dbconn=new Db_Connection();
            Connection myconnection= dbconn.Connection();// db connection

            String sqlString="insert into info (fname, lname, email,password) VALUES ('"+first_name+"', '"+last_name+"', '"+email+"', '"+pwd+"');";
            
            Statement myStatement = myconnection.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                myconnection.close();
            } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);}  
    }
    
    //----------------------------------//
    
    public static boolean LoginUser(String email,String pwd) 
    {
            boolean check =false;
            try 
            {      
                Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
                
                PreparedStatement ps1 =myconnection.prepareStatement("SELECT * from info Where email = ? and password = ? ");

                ps1.setString(1,email);
                ps1.setString(2,pwd);
                System.out.println(ps1);
                ResultSet rs1 =ps1.executeQuery();
                check = rs1.next();

                myconnection.close();        
            }catch(Exception e){e.printStackTrace();}
            
            return check;    
    }
    
    //----------------------------------//
    
    public void GetUser()
    {
            try 
            {      
                Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
                
                String sqlString = "SELECT * from info Where email = '"+email+"'";
                Statement myStatement = myconnection.createStatement();
                ResultSet rs=myStatement.executeQuery(sqlString);

                while(rs.next())
                {
                    first_name= rs.getString("fname");
                    last_name = rs.getString("lname");
                    email= rs.getString("email");
                    pwd = rs.getString("password");
 
                }
                
                
                myStatement.close();
                myconnection.close();
                
                
            } 
            catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);}
            /////////////////////////////////////////////////////////////////////////////////////
            
            
}
    
     public void deleteUser(String userId) {
        try {
             Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
            PreparedStatement preparedStatement = myconnection.prepareStatement("delete from info where email=?");
            // Parameters start with 1
            preparedStatement.setString(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
     
     
      public void updateUser(User user) {
        try {
            Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
            PreparedStatement preparedStatement =
                    myconnection.prepareStatement("update info set fname=? lname=? , email=?, password=?");
            String first=user.getFirst_name();
             String last=user.getLast_name();
              String pd=user.getPwd();
               
             preparedStatement.setString(1, user.getFirst_name());
            preparedStatement.setString(2, user.getLast_name());
             preparedStatement.setString(3, user.getEmail());
          
            preparedStatement.setString(4, user.getPwd());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      public void addUser(User user) {
        try {
            
            Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
            PreparedStatement preparedStatement = myconnection.prepareStatement("insert into users(fname,lname,email,password) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, user.getFirst_name());
             preparedStatement.setString(2, user.getLast_name());
            preparedStatement.setString(3, user.getPwd());
            preparedStatement.setString(4, user.getEmail());
//          
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
      public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        try {
             Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
            Statement statement = myconnection.createStatement();
            ResultSet rs = statement.executeQuery("select * from info");
            while (rs.next()) {
                User user = new User();
                
                
                user.setFirst_name(rs.getString("fname"));
                 user.setLast_name(rs.getString("lname"));
                user.setPwd(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
      
      
       public User getUserByEmail(String userEmail) {
        User user = new User();
        try {
            Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
            PreparedStatement preparedStatement = myconnection.prepareStatement("select * from info where email=?");
            preparedStatement.setString(1, userEmail);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setFirst_name(rs.getString("fname"));
                user.setLast_name(rs.getString("lname"));
                user.setPwd(rs.getString("password"));
                user.setEmail(rs.getString("email"));
//                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}

    
    //----------------------------------//

