package com.ques8;

import java.util.ArrayList;
import java.util.List;

// Proxy class to restrict used details Access.
public class ProxyUser extends User {
    private static List<User> users = new ArrayList<>();

    public ProxyUser(String name, Roles role) {
        super(name, role);
    }

    public static void add(User user) {
        users.add(user);
    }

    @Override
    public boolean hasViewRights() {
        return this.getRole() == Roles.ADMIN;
    }

    public void viewUsers() {
        if (this.hasViewRights()) {
            System.out.println("Hello " + super.getName() + " user details are : ");
            users.forEach(user -> {
                if (!user.getName().equals(this.getName())) {
                    System.out.println(user);
                }
            });
        } else {
            System.out.println(super.getName() + " : You Don't have rights to view the User Details.Access Denied.");
        }
    }

}
