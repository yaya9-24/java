package test.com;

public interface BoardDAO2 {

    /*public static final*/ String ADDR = "seoul";

    public /*abstract생략가능*/ int update();

    //default method
    public default void fn(){
        System.out.println("fn()...");

    }
    public static void fn1(){
        System.out.println("fn1()...");
    }
}
