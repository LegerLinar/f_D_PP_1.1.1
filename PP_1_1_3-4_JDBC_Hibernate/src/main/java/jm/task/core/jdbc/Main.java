package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.*;
import jm.task.core.jdbc.service.*;
import jm.task.core.jdbc.util.*;


import java.sql.Connection;
import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        Util.getConnection();
        UserService user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Name1", "LastName1", (byte) 20);
        user.saveUser("Name2", "LastName2", (byte) 25);
        user.saveUser("Name3", "LastName3", (byte) 31);
        user.saveUser("Name4", "LastName4", (byte) 38);

        user.removeUserById(1);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
