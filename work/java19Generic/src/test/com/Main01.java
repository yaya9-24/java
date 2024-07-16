package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //제네릭 - Generic
        //타입을 특정해줌으로써 가독성,명확성을 높여준다.

        //<>기호 안에 여러타입을 담을 수 있다. (단, 객체타입만 가능)
        //리스트에서 제네릭을 사용하지 않으면 서로 다른 타입을 담을 수 있도록 허용한다.
        List arr = new ArrayList();
        arr.add(111);
        arr.add("kim");
        arr.add(new Thread());

        //javascript - arr = [11,"kim",[33,44],{name:"lee"},,,,]
        List arr2 = Arrays.asList(222,"lee",new Integer[]{11,22},new Thread());
        //타입이 다른 아이템들이 존재 시에는 정보획득 메서드를 알아야한다.
        System.out.println(arr2.get(0));
        System.out.println(arr2.get(0).getClass());
        System.out.println(arr2.get(0).getClass().getName());
        System.out.println(arr2.get(1).getClass());
        System.out.println(arr2.get(1).getClass().getName());
        System.out.println(arr2.get(2).getClass());
        System.out.println(arr2.get(2).getClass().getName());

        //위와 같이 사용하는 것은 프로그램 유지보수 및 개발에 불편하다.
        //jdk5버전 이후는 타입을 특정지을 수 있도록 제네릭문법 지원
        //List<E>
        //Map<K,V>
        //T:Type, E: Element, K:Key, V:Value, N:Number
        //?:AnyType==Object
        List<Object> list1 = Arrays.asList(222,"lee",new Integer[]{11,22},new Thread());
        List<?> list2 = Arrays.asList(222,"lee",new Integer[]{11,22},new Thread());
        List<Thread> list3 = Arrays.asList(new Thread());
        List<Integer> list4 = Arrays.asList(222);
        List<String> list5 = Arrays.asList("lee");
        List<Double> list6 = Arrays.asList(33.33);
        List<Number> list7 = Arrays.asList(222,33.33);
    }//end main
}//end class
