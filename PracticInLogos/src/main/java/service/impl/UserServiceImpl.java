package service.impl;

import dao.UserDao;
import dao.imp.UserDaoImpl;
import exception.AlreadyExistException;
import exception.NotFoundException;
import lombok.extern.log4j.Log4j;
import model.User;
import service.UserService;

import java.sql.SQLException;
import java.util.List;

@Log4j
public class UserServiceImpl implements UserService
{
    private UserDao userDao;

    public UserServiceImpl()
    {
        this.userDao = new UserDaoImpl();
    }

    @Override
    public List<User> readAll() throws SQLException, ClassNotFoundException {
        log.info("Trying to get all users");
        return userDao.readAll();
    }

    @Override
    public User read(int id) throws NotFoundException, SQLException, ClassNotFoundException {
        log.info("Trying to get user");
        User user = userDao.read(id);
        if (user == null)
        {
            throw new NotFoundException("User with id " + id + " doesn't exist.");
        }
        return user;
    }

    @Override
    public void create(User user) throws AlreadyExistException, ClassNotFoundException {
        log.info("Trying to create user");
        try
        {
            if (userDao.exists(user.getEmail()))
            {
                throw new AlreadyExistException("User with email " + user.getEmail() + " already exist.");
            }

            userDao.create(user);

            log.info("New user with email " + user.getEmail() + " was create.");
        } catch (SQLException e)
        {
            log.error("Exception in SQL", e);
        }

    }

    @Override
    public void delete(int id) throws NotFoundException, SQLException, ClassNotFoundException {
        if (!userDao.delete(id))
        {
            throw new NotFoundException("User with id " + id + " doesn't exist.");
        }
    }

    @Override
    public User readByEmail(String email) throws SQLException, ClassNotFoundException {
        return userDao.readByEmail(email);
    }
}
