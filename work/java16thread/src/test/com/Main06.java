package test.com;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("hello");

        //동기화 메서드(synchronized method) :
        //스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없게 하는 메서드
        //스레드가 끝날 때까지 객체에 잠금을 걸어서 사용할 수 없도록 한다.
        //임계영역 : critical section이라 하며 멀티스레드 프로그램에서
        //          단 하나의 스레드만 실행 할 수 있는 코드영역을 의미한다.
        //결론적으로 임계영역을 지정하기위한 메서드 >> 동기화 메서드
        Calculator cal = new Calculator();
        cal.setMemoery(1111);
        System.out.println(cal.getMemoery());
        System.out.println("=================");

        User01 u1 = new User01();
        u1.setCal(cal);
        u1.start();



        User02 u2 = new User02();
        u2.setCal(cal);
        u2.start();
        System.out.println("=================");
        System.out.println("end main......");



    }//end main

}//end class
