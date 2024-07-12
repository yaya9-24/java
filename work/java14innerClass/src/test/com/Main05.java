package test.com;

public class Main05 {
    public static void main(String[] args) {

        //3.멤버 내부클래스(가장 보편적인 내부클래스)
        MemberOuter outer = new MemberOuter();
        MemberOuter.Inner inner = outer.new Inner();
        inner.test();
        //4.static 내부클래스
        MemberOuter.StaticInner.start();

    }//end main
}//end class
