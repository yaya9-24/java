package test.com;

import java.util.HashMap;
import java.util.Map;

public class Main12 {
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의 길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는 것(List계열),순서가 없는 것(Set계열,Map계열)

        //1.List<제네릭-객체타입명시> - ArrayList
        //순서가 있고, 중복데이터 허용
        //2.Set - HashSet

        //3.Map - HashMap,HashTable
        //Map<K,V> : K(key), V(Value)
        //key는 중복 허용하지 않고, Value는 중복허용
        //key의 순서는 없다.

        Map<String,String > map = new HashMap<>();
        //임의의 키,값을 할당해서 길이,반복문 출력하세요.
        map.put("name","kim");
        map.put("id","admin");

        System.out.println("map.size():"+map.size());
        for (String key : map.keySet()){
            System.out.println(map.get(key));
        }
        System.out.println("------------------");

        Map<String,PersonVO > map2 = new HashMap<>();
        //임의의 키,값을 할당해서 길이,반복문 출력하세요.
        map2.put("p01",new PersonVO());
        PersonVO vo = new PersonVO();
        vo.setNum(11);
        vo.setName("LEE");
        vo.setAge(33);
        map2.put("p02",vo);

        System.out.println("map2.size():"+map2.size());
        for (String key : map2.keySet()){
            System.out.println(map2.get(key));
        }
        System.out.println("------------------");

        Map<String,MemberVO > map3 = new HashMap<>();
        //임의의 키,값을 할당해서 길이,반복문 출력하세요.
        map3.put("Member1",new MemberVO());
        map3.put("Member2",new MemberVO());
        map3.put("Member3",new MemberVO());

        System.out.println("map3.size():"+map3.size());
        for (String key : map3.keySet()){
            System.out.println(map3.get(key));
        }
        System.out.println("------------------");

        Map<String,BoardVO > map4 = new HashMap<>();
        //임의의 키,값을 할당해서 길이,반복문 출력하세요.
        map4.put("Board1",new BoardVO());
        map4.put("Board2",new BoardVO());
        map4.put("Board3",new BoardVO());

        System.out.println("map4.size():"+map4.size());
        for (String key : map4.keySet()){
            System.out.println(map4.get(key));
        }
        System.out.println("------------------");







    }//end main
}// class
