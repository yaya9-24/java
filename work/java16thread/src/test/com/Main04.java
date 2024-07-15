package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");
        //스레드 제어해보자...


        //3.인터럽트 + 인터럽트 감지 메서드 + break
        PrintThread3 pt = new PrintThread3();
        pt.start();

        //1초 간 일시정지
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //인터럽트 메서드 활용해서 종료시키기
        pt.interrupt();


        System.out.println("end main......");



    }//end main

}//end class
