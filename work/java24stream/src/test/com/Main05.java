package test.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main05 {

    public static void main(String[] args){
        System.out.println("hello...");

        List<String> list = new ArrayList<>();
        list.add("aaa1");
        list.add("aaa2");
        list.add("aaa3");
        System.out.println(list);

        //stream에도 add() 메소드로 데이터를 추가하는 기능이 있다.
        System.out.println(Stream.builder().add("bbb1").add("bbb2").add("bbb3").build().toList());
        System.out.println(Stream.builder().add(11).add(22).add(33).build().toList());
        System.out.println(Stream.builder().add(1.1).add(2.2).add(3.3).build().toList());
        //여러타입의 데이터를 요소로 갖을 수 있다.
        System.out.println(Stream.builder().add("kim").add(11).add(3.3).build().toList());
        //제네릭선언으로 타입을 명시해줄 수 있다.
        System.out.println(Stream.<String>builder().add("kim").add("lee").add("yang").build().toList());


    }//end main
}//end class
