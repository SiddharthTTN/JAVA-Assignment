package com.ques7;

import java.util.ArrayList;
import java.util.List;

// Composite
class HRDirectory implements Directory {
    private List<Directory> hrs = new ArrayList<>();

    @Override
    public void getDirectories() {
        System.out.println("HR's Directories");
        hrs.forEach(Directory::getDirectories);
    }
}
