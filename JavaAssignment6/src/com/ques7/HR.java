package com.ques7;

// leaf
class HR implements Directory {
    private String name;
    private String specialisation;

    public HR(String name, String specialisation) {
        this.name = name;
        this.specialisation = specialisation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getDirectories() {
        System.out.println("HR{" +
                "name='" + name + '\'' +
                ", specialisation='" + specialisation + '\'' +
                '}');
    }

}
