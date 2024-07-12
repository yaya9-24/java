package test.com;

public class Main02 {
    public static void main(String[] args) {

        System.out.println("hello");

        //1.익명내부클래스 - 변수할당가능, 함수인자전달, 리턴문에 할당
        //Mother
        Mother m = new Mother() {
            @Override
            public void play() {
                System.out.println("play()...1");
            }
        };
        m.play();
        test(m);
        test(new Mother() {
            @Override
            public void play() {
                System.out.println("play()...2");
            }
        });

        Mother m2 = test2();
        m2.play();

        //인터페이스 Car를 만들어서 동일하게 연습해보세요.
        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...1");
            }
        };
        car.drive();
        test3(car);
        test3(new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...1");
            }
        });
        Car car2 = test4();
        car2.drive();
    } //end main

    public static void test(Mother m){
        m.play();
    }

    public static Mother test2(){
        return new Mother() {
            @Override
            public void play() {
                System.out.println("play()...3");
            }
        };
    }

    public static void test3(Car c){
        System.out.println("drive()...2");
    }

    public static Car test4(){
        return new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...3");
            }
        };
    }
} // end class
