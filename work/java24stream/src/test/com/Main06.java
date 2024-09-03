package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main06 {

    public static void main(String[] args){
        System.out.println("hello...");

        //원래는 이렇게 했었다.
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("hello");
        }
        System.out.println(list); //[hello, hello, hello, hello, hello]

        //stream객체를 사용하여 임의의 문자열을 생성해서 stream에 바로 할당할 수 있다.
        //generate : [hello, hello, hello, hello, hello]
        System.out.println(Stream.generate(()->"hello").limit(5).toList());


        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(10);
        }
        System.out.println(list2); //[10, 10, 10, 10, 10]
        System.out.println(Stream.generate(()->10).limit(5).toList()); //[10, 10, 10, 10, 10]

        //iterate 를 사용해도 생성가능.
        System.out.println(Stream.iterate(0,x->x).limit(5).toList());
        System.out.println(Stream.iterate(0,x->x+1).limit(5).toList());
        System.out.println(Stream.iterate(0,x->x+10).limit(5).toList());
        System.out.println(Stream.iterate(0,x->x+20).limit(5).toList());

        //doubles : Random객체를 이용해서 랜덤한 실수들로 이루어진 stream 생성
        System.out.println(new Random().doubles(5).boxed().toList());

        //ints : Random객체를 이용해서 랜덤한 정수들로 이루어진 stream 생성
        System.out.println(new Random().ints(5).boxed().toList());

        //문자열에서 구분자로 잘라서 리스트에 넣기
        String str = "aaa:bbb:ccc";
        //List<String> data = Arrays.asList(str.split(":"));
        System.out.println(Arrays.asList(str.split(":"))); //[aaa, bbb, ccc]
        System.out.println(Arrays.asList(str.split(":")).stream().filter(x->x.contains("a")).count());//1

        //패턴객체를 통해서 스트림생성가능
        System.out.println(Pattern.compile(":").splitAsStream(str).toList()); //[aaa, bbb, ccc]
        System.out.println(Pattern.compile(":").splitAsStream(str).filter(x->x.contains("a")).count()); //1
    }//end main
}//end class
