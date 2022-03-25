package com.company;

public class UserDao {
    private final User[] users;

    public UserDao() {
        users = new User[10];
        System.out.println("Data base is created!");
        System.out.println("---------------------");
    }

    public User[] getUsers() {
        return users;
    }
}
