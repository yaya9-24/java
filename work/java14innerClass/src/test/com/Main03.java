package test.com;

public class Main03 {

    Car c = new Car() {
        @Override
        public void drive() {
            System.out.println("drive()...4");
        }
    };
    public static void main(String[] args) {

        System.out.println("hello");
        /*final*/ String name = "kim";
        //1.익명내부클래스 - 변수할당가능, 함수인자전달, 리턴문에 할당
        //Car
        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...1"+name);
            }
        };
        car.drive();
        test(new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...2");
            }
        });
        Car car2 = test2();
        car2.drive();
    } //end main

    public static void test(Car c){
        c.drive();
    }

    public static Car test2(){
        return new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...3");
            }
        };
    }
} // end class
