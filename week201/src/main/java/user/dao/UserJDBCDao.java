package user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.model.User;

public class UserJDBCDao implements UserDao {
    
    Connection conn;
    
    public void setConnection(Connection connection) {
        this.conn = connection;
    }
    
    public User find(String email) {
        User user = null;

        String query = "SELECT * FROM user WHERE email = '" + email + "'";
        
        try {
            ResultSet rs = conn.createStatement().executeQuery(query);

            String lastname = rs.getString("lastname");
            String firstname = rs.getString("firstname");
            String pwd = rs.getString("pwd");
            
            user = new User();
            user.setMail(email);
            user.setNom(lastname);
            user.setPrenom(firstname);
            user.setMotDePasse(pwd);
            
            rs.close();
        } catch (SQLException e) {
            throw new Error("Unable to find User " + email, e);
        }
        
        return user;
    }
    
    public void delete(String email) {
        String query = "DELETE FROM user where email = '" + email + "'";
        
        try {
            conn.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            throw new Error("Unable to delete User " + email, e);
        }
    }
    
    public void create(User user) {
        String query = "INSERT INTO user values('"+ user.getMail() +"', '"+ user.getNom() +"', '"+ user.getPrenom() +"', '"+ user.getMotDePasse() +"');";
        
        try {
            conn.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            throw new Error("Unable to insert User " + user, e);
        }
    }
    
    public void update(User user) {
        String query = "UPDATE user SET email='"+user.getMail()+"', lastname='"+user.getNom()+"', firstname='"+user.getPrenom()+"', pwd='"+user.getMotDePasse()+"' WHERE email = '"+user.getMail()+"'";
        
        try {
            conn.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            throw new Error("Unable to insert User " + user, e);
        }
    }
    
    public boolean checkPassword(String email, String password) {
        String query = "SELECT * from user WHERE email = ? AND pwd = ?";
        
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            
            ResultSet rs = preparedStatement.executeQuery();
            boolean exists = rs.next();
            rs.close();
            return exists;
        } catch (SQLException e) {
            throw new Error("Unable to identified User " + email, e);
        }
    }
}
