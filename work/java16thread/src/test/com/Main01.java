package test.com;

public class Main01 {
    public static void main(String[] args)  {
        System.out.println("hello");

        //스레드 - Thread(run메서드,start메서드,,,,)
        //start >> 실행대기(runnable) >> 실행(run)
        // >>sleep >>일시정지 >> 인터럽트(interrupt)
        // >>실행대기(runnable) >> run 반복,,,,
        //stop : 스레드 즉시종료 - 불안전 종료를 유발하므로 사용하지 않는 것 권장
        //인터럽트 : 일시정지 상태의 스레드에서 InterruptedException 발생시켜서
        //          catch문에서 실행대기상태로 가거나 종료상태로 갈 수 있도록 해준다.

        //1. ThreadEx클래스 생성 - extends Thread
        Thread t = new ThreadEx();
        t.start();


        //2. 익명내부클래스
        new Thread(){
            @Override
            public void run() {
                //실제로 멀티프로세스가 동작될 코드 블럭
                System.out.println("Inner start run()...");
                for (int i = 100; i < 110; i++) {
                    try {
                        System.out.println(i);
                        Thread.sleep(100); // 1/1000 : 밀리초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("end 100~109.................");
                System.out.println("Inner end run()...");
            }
        }.start();

        //3. 이미 다른클래스를 상속받은 상황-Thread를 상속받을 수 없다.
        //이러한 경우 Runnalbe인터페이스를 상속받고 구현가능하다.
        //3-1. Runnable <----- RunnableImpl
        Runnable r = new RunnableImpl();
        new Thread(r).start();



        //3-2.Runnable 익명내부클래스 구현

        new Thread(new Runnable() {
            @Override
            public void run() {
                //실제로 멀티프로세스가 동작될 코드 블럭
                System.out.println("Inner2 start run()...");
                for (int i = 10000; i < 10010; i++) {
                    try {
                        System.out.println(i);
                        Thread.sleep(300); // 1/1000 : 밀리초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("end 10000~10009.................");
                System.out.println("Inner2 end run()...");
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(300); // 1/1000 : 밀리초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("end 0~9.................");




        System.out.println("end main...");







    }//end main
}//end class
