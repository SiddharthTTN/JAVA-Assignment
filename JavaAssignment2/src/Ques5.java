public class Ques5 implements Cloneable

{
    String name;
    String city;
    Ques5(){

    }
    Ques5(Ques5 obj){
        this.name=obj.name;
        this.city=obj.city;
    }

    public Ques5 clone() throws CloneNotSupportedException{
        Ques5 clonedObj = (Ques5) super.clone();
        clonedObj.city= new String((this.city));//Deep Copy
        clonedObj.name= new String((this.name));//Deep Copy
        return clonedObj;
    }

    @Override
    public String toString() {
        return "Ques5{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
