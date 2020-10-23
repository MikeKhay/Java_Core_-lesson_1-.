package dao.imp;

import dao.UserDao;
import model.User;
import util.MySqlConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao
{
    @Override
    public User readByEmail(String email) throws SQLException, ClassNotFoundException {
        try (
            Connection connection = MySqlConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Store.user WHERE email = ?")
        )
        {
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            User user = new User();
            while (resultSet.next())
            {
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setPassword(resultSet.getString("password"));
                user.setRole(resultSet.getString("role"));
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> readAll() throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<>();
        try (
            Connection connection = MySqlConnector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT  *FROM user")
        )
        {
            while (resultSet.next())
            {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setPassword(resultSet.getString("password"));
                user.setRole(resultSet.getString("role"));

                users.add(user);
            }
            return users;
        }
    }

    @Override
    public User read(int id) throws SQLException, ClassNotFoundException {
        try (
            Connection connection = MySqlConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE id = ?")
        )
        {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            User user = new User();
            while (resultSet.next())
            {
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setPassword(resultSet.getString("password"));
                user.setRole(resultSet.getString("role"));
            }
        }
        return null;
    }

    @Override
    public void create(User user) throws SQLException, ClassNotFoundException {
        try (
            Connection connection = MySqlConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO user(email, password, first_name, last_name) VALUES (?, ?, ?, ?)")
        )
        {
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getFirstName());
            statement.setString(4, user.getLastName());
            statement.execute();
        }


    }

    @Override
    public boolean delete(int id) throws SQLException, ClassNotFoundException {
        try (
            Connection connection = MySqlConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM user WHERE id = ?")
        )
        {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        }
    }

    @Override
    public boolean exists(int id) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = null;
        try (
            Connection connection = MySqlConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT 1 FROM user WHERE id = ?")
        )
        {
            statement.setInt(1, id);

            resultSet = statement.executeQuery();
            return resultSet.next();
        } finally
        {
            if (resultSet != null)
            {
                resultSet.close();
            }
        }
    }

    @Override
    public boolean exists(String email) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = null;
        try (
            Connection connection = MySqlConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT 1 FROM user WHERE email = ?")
        )
        {
            statement.setString(1, email);

            resultSet = statement.executeQuery();
            return resultSet.next();
        } finally
        {
            if (resultSet != null)
            {
                resultSet.close();
            }
        }
    }
}
