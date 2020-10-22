package dao;

import exception.AlreadyExistException;
import exception.NotFoundException;
import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao
{
    List<User> readAll() throws SQLException, ClassNotFoundException;

    User read(int id) throws SQLException, NotFoundException, ClassNotFoundException;

    void create(User user) throws SQLException, AlreadyExistException, ClassNotFoundException;

    boolean delete(int id) throws SQLException, ClassNotFoundException;

    boolean exists(int id) throws SQLException, ClassNotFoundException;

    boolean exists(String email) throws SQLException, ClassNotFoundException;

    User readByEmail(String email) throws SQLException, ClassNotFoundException;
}
