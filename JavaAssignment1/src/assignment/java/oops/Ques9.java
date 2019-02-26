package assignment.java.oops;

public class Ques9 {

    public enum House {
        Dehradun(4500000),
        Delhi(5000000),
        Haryana(400000);
        int price;

        House(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public void getPrice(){
        System.out.println(House.Delhi + " : " + House.Delhi.getPrice());
        System.out.println(House.Haryana + " : " + House.Haryana.getPrice());
        System.out.println(House.Dehradun + " : " + House.Dehradun.getPrice());
    }
}
