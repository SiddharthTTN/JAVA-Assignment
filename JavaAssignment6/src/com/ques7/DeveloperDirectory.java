package com.ques7;

import java.util.ArrayList;
import java.util.List;

//  Composite stores leaf and uses component for the behaviour
public class DeveloperDirectory implements Directory {
    private List<Directory> developers = new ArrayList<>();

    public void addNewDeveloper(Developer developer) {
        developers.add(developer);
    }

    @Override
    public void getDirectories() {
        System.out.println("Developer's Directories");
        developers.forEach(Directory::getDirectories);
    }
}
