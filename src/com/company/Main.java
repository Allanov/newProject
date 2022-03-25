package com.company;

public class Main {
    public static void main(String[] args) {
        final UserService userService = new UserService();

        User userOne = new User(1, "Asel", 18, "Female");
        User userTwo = new User(2, "Erbol", 25, "Male");
        User userThree = new User(3, "Nuriza", 20, "Female");

        userService.saveUser(userOne);
        userService.saveUser(userTwo);
        userService.saveUser(userThree);

        int id = 3;

        User user = userService.findUserById(id);

        if (user == null) {
            System.out.println("There is no user with id " + id);
            System.out.println("---------------------------------------------");
        } else {
            System.out.println(user);
            System.out.println("----------------------------------------------");
        }

        for (User usr: userService.getAllUsers()) {
            if (usr != null) {
                System.out.println(usr);
            }
        }

        System.out.println("-------------------------------------------");

        userService.removeUserById(1);

        for (User usr: userService.getAllUsers()) {
            if (usr != null) {
                System.out.println(usr);
            }
        }

        System.out.println("-------------------------------------------");

    }
}
