package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main01 {

    public static void main(String[] args){
        System.out.println("hello...");

        //자바 스트림이란? : jdk8에 추가된 객체
        // 제어문 또는 쿼리문 기능을 함수로 대체해서 표현가능한 문법
        // 컬렉션과 배열 등의 요소들을 참조하여 람다식을 적용할 수 있다.
        // 반복수행하는 기능구현에 뛰어나다.

        //List 내에 있는 문자열 중에서 a라는 문자가 들어있는 요소에 대해 카운팅 하고싶다.

        //List<String> names = Arrays.asList("aaa","bbb","ccac","aa");
        List<String> names = Arrays.asList(new String[]{"aaa","bbb","ccac","aa"});
        System.out.println(names);

        //1.일반적인 방법
        int count = 0;
        for (String x:names){
            System.out.println(x);
            if (x.contains("a")){
                count++;
            }
        }
        System.out.println("count:"+count);
        System.out.println("=====================");

        //2.stream을 이용하는 방법
        //a라는 문자열을 포함하는 요소들만 카운팅
        System.out.println("count:"+names.stream().filter((x)->x.contains("a")).count()); //stream().을 하면 객체 타입이 stream으로 바뀐다.
        System.out.println("=====================");

        //a로 시작하는 문자열 요소들만 카운팅
        System.out.println("count:"+names.stream().filter((x)->x.startsWith("a")).count());
        System.out.println("=====================");


        //stream필터링 결과를 다시 컬렉션으로 변환가능
        System.out.println(names.stream().filter((x)->x.contains("a")));

        List<String> list = names.stream().filter((x)->x.contains("a")).toList(); //jdk16 이상
        System.out.println(list);//List type


        List<String> list2 = names.stream().filter((x)->x.contains("a")).collect(Collectors.toList()); //jdk16 미만
        System.out.println(list2);//List type


        ////stream필터링 결과를 다시 객체배열로 변환가능
        Object[] objs = names.stream().filter((x)->x.contains("a")).toArray();
        System.out.println(objs); //Object[] type


        //cf) 별도의 thread처리가 필요하거나 요소의 개수가 엄~~~~~청 많을때 사용하는 stream
        System.out.println("count:"+names.parallelStream().filter((x)->x.contains("a")).count());
        System.out.println("=====================");

    }//end main
}//end class
