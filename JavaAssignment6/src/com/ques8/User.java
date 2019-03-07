package com.ques8;

public class User implements CheckRole {
    private String name;
    private Roles role;

    public User(String name, Roles role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    Roles getRole() {
        return role;
    }

    @Override
    public boolean hasViewRights() {
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
