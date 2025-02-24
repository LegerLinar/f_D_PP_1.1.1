package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoJDBCImpl();


    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {

        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {

        userDao.saveUser(name, lastName, age);
        System.out.println("User c именем " + name + "добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
        //сделали каку

    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void printAllUsers(List<User> users) {
        for (User u : users) {
            System.out.println(u);
        }
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
