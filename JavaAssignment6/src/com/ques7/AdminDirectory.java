package com.ques7;

import java.util.ArrayList;
import java.util.List;

// Composite
class AdminDirectory implements Directory {
    private List<Directory> admins = new ArrayList<>();

    void addNewAdmin(Admin admin) {
        admins.add(admin);
    }

    @Override
    public void getDirectories() {
        System.out.println("Admin's Directories");
        admins.forEach(Directory::getDirectories);
    }
}
