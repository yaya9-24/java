package test.com;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //상속관계를 표현하는 제네릭
        //상속관계의 객체가 필요하다
        //Car <----Bus <---- BigBus
        //Car <----Taxi <---- BigTaxi

        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Bus());
        cars.add(new BigBus());
        cars.add(new Taxi());
        cars.add(new BigTaxi());
        System.out.println("cars.size():" + cars.size());
        System.out.println(cars);
        System.out.println("=====================");

        List<Bus> cars2 = new ArrayList<>();
        //cars2.add(new Car());
        cars2.add(new Bus());
        cars2.add(new BigBus());
        //cars2.add(new Taxi());
        //cars2.add(new BigTaxi());
        System.out.println("cars2.size():" + cars2.size());
        System.out.println(cars2);
        System.out.println("=====================");

        List<Taxi> cars3 = new ArrayList<>();
        //cars3.add(new Car());
        //cars3.add(new Bus());
        //cars3.add(new BigBus());
        cars3.add(new Taxi());
        cars3.add(new BigTaxi());
        System.out.println("cars3.size():" + cars3.size());
        System.out.println(cars3);
        System.out.println("=====================");

        List<BigBus> cars4 = new ArrayList<>();
        //cars4.add(new Car());
        //cars4.add(new Bus());
        cars4.add(new BigBus());
        //cars4.add(new Taxi());
        //cars4.add(new BigTaxi());
        System.out.println("cars4.size():" + cars4.size());
        System.out.println(cars4);
        System.out.println("=====================");

        List<BigTaxi> cars5 = new ArrayList<>();
        //cars5.add(new Car());
        //cars5.add(new Bus());
        //cars5.add(new BigBus());
        //cars5.add(new Taxi());
        cars5.add(new BigTaxi());
        System.out.println("cars5.size():" + cars5.size());
        System.out.println(cars5);
        System.out.println("=====================");


    }//end main
}//end class
