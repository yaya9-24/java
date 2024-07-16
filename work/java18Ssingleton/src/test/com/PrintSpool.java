package test.com;

public class PrintSpool {

    //1.전역변수(Static,접근최소)
    private static PrintSpool singleton = new PrintSpool();

    //2.싱글톤 객체를 리턴해주는 스테틱 메서드
    public static PrintSpool getInstance(){
        return singleton;
    }

    //3. 인자없는 생성자 - private
    private PrintSpool(){
        //멀티스레드 테스트용 슬립..
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




    public void print(String txt) {
        System.out.println("print()...");
        System.out.println(txt);
    }
}
