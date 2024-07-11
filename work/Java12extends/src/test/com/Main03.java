package test.com;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        Person p = new Person();

        //추상클래스의 객체생성- 상속관계의 다형성으로만 생성 가능
        TestAbs abs = new TestAbs(){

            @Override
            public void sleep() {
                System.out.println("inner sleep()...");
            }
        };
        abs.test();
        abs.sleep();

        System.out.println("===============");
        TestAbsEx tex = new TestAbsEx();
        tex.test();
        tex.sleep();

    }//end main
}//end class
