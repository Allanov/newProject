package com.company;

public class UserService {
    private final UserDao userDao = new UserDao();
    private int index = 0;

    public void saveUser(User user) {
        if (index != userDao.getUsers().length) {
            if (user != null) {
                userDao.getUsers()[index] = user;
                index++;
                System.out.println(user.getName() + " has been successfully saved in database.");
                System.out.println("----------------------------------------------------------");
            } else {
                System.out.println("Object pustoy bolboosy kerek!");
                System.out.println("-----------------------------");
            }
        } else {
            System.out.println("Net mesta dlya novogo polzovatela");
            System.out.println("---------------------------------");
        }
    }

    public User findUserById(long id) {
        for (User user : userDao.getUsers()) {
            if (user != null) {
                if (user.getId() == id) {
                    return user;
                }
            }
        }
        return null;
    }

    public User[] getAllUsers() {
        return userDao.getUsers();
    }

    public void removeUserById(long id) {
        for (int i = 0; i < userDao.getUsers().length; i++) {
            if (userDao.getUsers()[i] == null) {
                System.out.println("There is no user with id: " + id + " in database!");
                System.out.println("-------------------------------------------------");
                break;
            }
            if (userDao.getUsers()[i].getId() == id) {
                userDao.getUsers()[i] = null;
                System.out.println("User with id: " + id + " has been successfully removed!");
                System.out.println("-------------------------------------------------------");
                break;
            }
        }
    }
}
