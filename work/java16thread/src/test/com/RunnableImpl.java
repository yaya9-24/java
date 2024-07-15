package test.com;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {

        //실제로 멀티프로세스가 동작될 코드 블럭
        System.out.println("RunnableImpl start run()...");
        for (int i = 1000; i < 1010; i++) {
            try {
                System.out.println(i);
                Thread.sleep(300); // 1/1000 : 밀리초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("end 1000~1009.................");
        System.out.println("RunnableImpl end run()...");

    }
}
