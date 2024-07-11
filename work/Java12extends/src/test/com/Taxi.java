package test.com;

public class Taxi extends Car{
    String part = "A";
    int pay = 3400;
    int price = 5000;


    public Taxi() {
        System.out.println("Taxi()...");
    }

    public void stop(){
        System.out.println("stop()...");
        System.out.println(part);
        System.out.println(pay);
        System.out.println(model);
        System.out.println(this.price);
        System.out.println(super.price);
    }

    @Override
    public void start() {
        System.out.println("Taxi start()...");
    }
}
