package test.com;

public class Calculator {

    private int memoery;

    public int getMemoery() {
        return memoery;
    }

    public synchronized void setMemoery(int memoery) {
        this.memoery = memoery;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //현재 동작 중인 스레드의 이름 획득
        System.out.println(Thread.currentThread().getName());
        System.out.println(this.memoery);
    }
}
