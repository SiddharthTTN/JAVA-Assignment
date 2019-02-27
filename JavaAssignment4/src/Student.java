public class Student {
    String name;
    Double score;
    private Double age;

    Student(String name,Double score,Double age){
        this.name=name;
        this.score=score;
        this.age=age;
    }

    @Override
    public String toString() {
        return  "Name = '" + name + '\'' +
                ", Score =" + score +
                ", Age =" + age +
                '}';
    }
}
