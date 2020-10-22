package service;

import exception.AlreadyExistException;
import exception.NotFoundException;
import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService
{

    List<User> readAll() throws SQLException, ClassNotFoundException;

    User read(int id) throws NotFoundException, SQLException, ClassNotFoundException;

    void create(User user) throws AlreadyExistException, ClassNotFoundException;

    void delete(int id) throws NotFoundException, SQLException, ClassNotFoundException;

    User readByEmail(String email) throws SQLException, ClassNotFoundException;
}
