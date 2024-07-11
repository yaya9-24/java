package test.com;

public class Bus extends Car{
    int count;
    int pay;
    String model = "OOOO"; //super가 가지고 있는 전역변수를 재초기화
    public Bus() {
        //super(); //자동생성이라 생략가능
        System.out.println("Bus()...");
    }

    public void open(){
        System.out.println("open()...");
        System.out.println(count);
        System.out.println(pay);
        System.out.println(this.model);
        System.out.println(super.model);
        System.out.println(price);
    }

    //슈퍼클래스의 메서드 재정의 - 오버라이딩
    @Override
    public void start() {
        System.out.println("Bus start()");
    }
}
