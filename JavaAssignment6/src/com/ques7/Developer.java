package com.ques7;

//  leaf is the objects of component.
public class Developer implements Directory {
    private String name;
    private String language;

    public Developer(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void getDirectories() {
        System.out.println("Developer{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}');
    }
}
