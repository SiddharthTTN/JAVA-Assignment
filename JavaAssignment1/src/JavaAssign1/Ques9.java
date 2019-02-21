package JavaAssign1;

public class Ques9 {

    public enum House{
        Delhi(5000000),
        Haryana(400000),
        Dehradun(4500000);
        int price;

        House(int price ){
            this.price=price;
        }
    }
    public void getPrice(){
        System.out.println(House.Delhi + " : " + House.Delhi.price);
        System.out.println(House.Haryana + " : " + House.Haryana.price);
        System.out.println(House.Dehradun + " : " + House.Dehradun.price);
    }
}
