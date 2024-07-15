package test.com;

public class User01 extends Thread{

    private Calculator cal;

    public void setCal(Calculator cal) {
        this.cal = cal;
        //스레드 이름 변경
        this.setName("User01...");
    }

    @Override
    public void run() {
        System.out.println("User01...run()....");
        cal.setMemoery(100);
        System.out.println("=================");
    }
}
