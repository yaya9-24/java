package test.com;

public class Main01 {
    public static void main(String[] args){
        System.out.println("hello");

        //람다식을 이해하기 위해서는 익명내부클래스를 이해해야한다.
        //Person클래스를 만들고 익명내부클래스를 사용하여 객체생성해보세요.

        Person p = new Person(){
            @Override
            public void sleep() {
                System.out.println("sleep()...");
            }
        };
        p.sleep();

        //Bus(open()),Car(start()) 인터페이스를 이용하여 객체생성하기
        Bus bus = new Bus() {
            @Override
            public void open() {
                System.out.println("open()...");
            }
        };
        bus.open();

        Car car = new Car() {
            @Override
            public void start() {
                System.out.println("start()....");
            }
        };
        car.start();

        //익명내부클래스를 사용하는 장점(일급함수)
        //1.변수에 할당
        //2.함수호출시 인자로전달(매개변수에 할당)
        //3.함수의 리턴문에 사용가능


        testCar(new Car() {
            @Override
            public void start() {
                System.out.println("start()....");
            }
        });

        Car car2 = test2Car();
        car2.start();

        //testBus(),test2Bus()
        testBus(new Bus() {
            @Override
            public void open() {
                System.out.println("open()...");
            }
        });

        Bus bus2 = test2Bus();
        bus2.open();

        //testPerson(),test2Person()
        testPerson(new Person(){
            @Override
            public void sleep() {
                System.out.println("sleep()...");
            }
        });

        Person p2 = test2Person();
        p2.sleep();
    }//end main

    public static Person test2Person(){
        return new Person(){
            @Override
            public void sleep() {
                System.out.println("sleep()...");
            }
        };
    }

    public static void testPerson(Person p){
        p.sleep();
    }

    public static void testBus(Bus bus){
        bus.open();
    }

    public static Bus test2Bus(){
        return new Bus() {
            @Override
            public void open() {
                System.out.println("open()...");
            }
        };
    }

    public static Car test2Car(){
        return new Car() {
            @Override
            public void start() {
                System.out.println("start()....");
            }
        };
    }

    public static void testCar(Car car){
        car.start();
    }
}//end class
