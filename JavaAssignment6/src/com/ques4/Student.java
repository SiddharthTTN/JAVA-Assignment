package com.ques4;

public class Student {
    private Integer rollNo;
    private String name;
    private Integer age;
    private Integer percentage;
    private char gender;
    private boolean isUsingSchoolTransport;

    public Student(StudentBuilder studentBuilder) {
        rollNo = studentBuilder.getRollNo();
        name = studentBuilder.getName();
        age = studentBuilder.getAge();
        percentage = studentBuilder.getPercentage();
        gender = studentBuilder.getGender();
        isUsingSchoolTransport = studentBuilder.isUsingSchoolTransport();
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", percentage=" + percentage +
                ", gender=" + gender +
                ", isUsingSchoolTransport=" + isUsingSchoolTransport +
                '}';
    }
}
