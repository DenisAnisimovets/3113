package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 20);
        userService.saveUser("Петр", "Петров", (byte) 30);
        userService.saveUser("Сидр", "Сидоров", (byte) 40);
        userService.saveUser("Джордж", "Петров", (byte) 50);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
