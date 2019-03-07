package com.ques7;

//  leaf
class Admin implements Directory {
    private String name;
    private String post;

    Admin(String name, String post) {
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getDirectories() {
        System.out.println("Admin{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}');
    }
}
