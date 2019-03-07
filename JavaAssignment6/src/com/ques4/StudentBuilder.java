package com.ques4;

public class StudentBuilder {
    private Integer rollNo;
    private String name;
    private Integer age;
    private Integer percentage;
    private char gender;
    private boolean isUsingSchoolTransport;

    public Integer getRollNo() {
        return rollNo;
    }

    public StudentBuilder setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public StudentBuilder setPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public StudentBuilder setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public boolean isUsingSchoolTransport() {
        return isUsingSchoolTransport;
    }

    public StudentBuilder setUsingSchoolTransport(boolean usingSchoolTransport) {
        isUsingSchoolTransport = usingSchoolTransport;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
