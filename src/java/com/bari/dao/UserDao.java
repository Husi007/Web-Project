package com.bari.dao;

import java.sql.*;
import java.util.*;
import com.bari.model.User;
import com.bari.util.Database;

public class UserDao {

    private Connection connection;

    public UserDao() {
        connection = Database.getConnection();
    }

    public void checkUser(User user) {
        try {
            PreparedStatement ps = connection.prepareStatement("select * from users where ID=?");
            ps.setString(1, user.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {
                updateUser(user);
            } else {
                addUser(user);
                //updateUser(user);
            }
        } catch (Exception ex) {
            System.out.println("Error in check() -->" + ex.getMessage());
        } 
    }
    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users(uname, password, email, registeredon) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, user.getUname());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
//            preparedStatement.setDate(4, new java.sql.Date(user.getRegisteredon().getTime()));
            preparedStatement.setString(4, user.getRegisteredon());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String userId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from users where ID=?");
            // Parameters start with 1
            preparedStatement.setString(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("update users set password=?, email=? where ID=?");
            //System.out.println("ASDF" + user.getId());
            // Parameters start with 1
        //    System.out.println(new java.sql.Date(user.getRegisteredon().getTime()));
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setString(2, user.getEmail());
            //preparedStatement.setDate(3, new java.sql.Date(user.getRegisteredon().getTime()));
            //preparedStatement.setString(3, user.getRegisteredon());
            preparedStatement.setString(3, user.getId());
            preparedStatement.executeUpdate();
            //System.out.println("ASDF" + user.getId());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from users");
            while (rs.next()) {
                User user = new User();
                //user.setUname("Myname");
                //user.setPassword("Mypassword");
                //user.setEmail("Myemail");
                //user.setRegisteredon("Myregisteredon");
                
                user.setUname(rs.getString("uname"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setRegisteredon(rs.getString("registeredon"));
                user.setId(rs.getString("ID"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public User getUserById(String userId) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where ID=?");
            preparedStatement.setString(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setUname(rs.getString("uname"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
//                user.setRegisteredon(rs.getDate("registeredon"));
                user.setRegisteredon(rs.getString("registeredon"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
