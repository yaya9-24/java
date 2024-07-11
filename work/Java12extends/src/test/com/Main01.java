package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //자동차 - 모델명,가격 : 출발기능
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.price);
        car.start();

        System.out.println("========");

        //버스 - 카운트,버스요금 :문열기
        Bus bus = new Bus();
        System.out.println(bus.count);
        System.out.println(bus.pay);
        bus.open();
        System.out.println("========");
        //자동차를 상속받고난 이후에는 자동차의 자원(멤버) 사용가능
        System.out.println(bus.model);
        System.out.println(bus.price);
        bus.start();
        System.out.println("========");
        //자동차와 버스가 상속관계인 경우 다형성을 이용한 객체생성가능
        //다형성 - 부모타입 변수초기화시 자식타입의 생성자로 객체생성가능
        //      - 단, 자원사용 제한(부모자원만 사용가능)
        Car car2 = new Bus();
        System.out.println(car2.model);
        System.out.println(car2.price);
        car2.start();
        System.out.println("========");
        //자동상속 - extends라는 예약어없고 클래스이름도 없이 상속관계가 성립
        //다형성 + 내부클래스
        Car car3 = new Car(){
            //이름없는 내부클래스영역,Car클래스를 자동상속
            String status;
            public void sleep(){
                System.out.println("sleep");
                System.out.println(status);
                System.out.println(model);
                System.out.println(price);
            }

            @Override
            public void start() {
                System.out.println("AnonyMous start()...");
                sleep();
            }
        };
        System.out.println(car3.model);
        System.out.println(car3.price);
        car3.start();

        System.out.println("====Taxi====");

        //택시 - 분야,택시요금 : 정지기능
        Taxi taxi = new Taxi();
        System.out.println(taxi.part);
        System.out.println(taxi.pay);
        taxi.stop();
        System.out.println("========");

        //택시가 자동차 상속받고 자원출력하기
        System.out.println(taxi.model);
        System.out.println(taxi.price);
        taxi.start();

        System.out.println("===다형성=====");
        //다형성 객체상속 및 출력하기
        Car car4 = new Taxi();
        System.out.println(car4.model);
        System.out.println(car4.price);
        car4.start();

        System.out.println("========");
        //익명내부클래스 구현 및 자동상속 다형성 출력하기
        Car car5 = new Car(){
            String test = "test";
            public void aaa(){
                System.out.println("aaa");

            }

            @Override
            public void start() {
                System.out.println("AnonyMouse start()...");
                aaa();
            }
        };
        System.out.println(car5.model);
        System.out.println(car5.price);
        car5.start();
    }
}
