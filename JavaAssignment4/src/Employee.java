public class Employee {
    private String name;
    private Double age;
    Double salary;

    Employee(String name, Double age, Double salary) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name= '" + name + '\'' +
                ", Age= " + age +
                ", Salary= " + salary;
    }
}
