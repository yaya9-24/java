package test.com;

public class Main01 {

    String name = "kim"; //null
    static String tel = "02"; //null
    static final String ADDR_EMAIL = "seoul"; //final을 쓰면 반드시 초기화, 상수
    public void test1(){
        System.out.println("test1()...");
    }
    public static void test2(){
        System.out.println("test2()...");
    }
    public void test3(){
        System.out.println("test3()...");
        /*this.*/test1(); //this 생략해서 콜 가능
        /*Main01.*/test4(); // 내 클래스 안에 있는 스테틱메서드 호출시 클래스명 생략가능

    }
    public static void test4(){
        System.out.println("test4()...");
        new Main01().test1();
    }

    class Inner{

    }
    static class Inner2{

    }

    public static void main(String[] args) {
        System.out.println("main()...");

        Main01 m = new Main01();
        m.name = "lee";
        Main01.tel = "031";
        //Main01.ADDR_EMAIL = "aaa@aaa.com"; //readOnly error
        System.out.println(m.name);
        System.out.println(Main01.tel);

        m.test1();
        /*Main01*./test2(); //같은 클래스 내부에서는 클래스명 생략가능
        //local final
        final int x=10;
        //x=20; // error
        //x++;// error
        System.out.println(x);


    }//end main
}//end class