package test.com;

public class Main02 {
    public static void main(String[] args){
        System.out.println("hello");

        //람다표현식을 사용하는 장점(일급함수)
        //1.변수에 할당
        //2.함수호출시 인자로전달(매개변수에 할당)
        //3.함수의 리턴문에 사용가능

        //1.인자도 없고, 리턴도 없고
        Car car = ()->{
            System.out.println("start()...");
        };
        car.start();

        Bus bus = ()->{
            System.out.println("open()...");
        };
        bus.open();

        //2. 인자 있고, 리턴 없고
        Taxi taxi = (int x)->{
            System.out.println("open()..."+x);
        }; //매개변수 타입생략도 가능하다.
        taxi.open(5);

        //3.인자 없고, 리턴 있고
        Taxi2 taxi2 = ()->{
            System.out.println("open()...");
            return "kim";
        };
        String txt = taxi2.open();
        System.out.println(txt);

        //4.인자 있고, 리턴 있고
//        Taxi3 taxi3 = (int x,int y)->{
//            return x+y;
//        };
        Taxi3 taxi3 = (x,y)->x+y; //int와 return {}를 생략할 수 있다.

        int sum = taxi3.open(11,22);
        System.out.println(sum);
    }//end main

}//end class
