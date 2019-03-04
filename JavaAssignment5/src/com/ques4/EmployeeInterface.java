package com.ques4;

@FunctionalInterface
public interface EmployeeInterface {
    Employee createEmployee(String name, int age, String city);
}
