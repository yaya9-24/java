package test.com;

public class Man extends Person{

    int money = 1000;
    double eye = 1.5;
    String name = "yang";

    public void eat(){
        System.out.println("Man...eat()...");
        System.out.println(name);
        System.out.println(super.name);
    }

    @Override
    public void sleep() {
        System.out.println("Man...sleep()...");
    }
}
