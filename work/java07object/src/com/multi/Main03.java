package com.multi;

import test.com.Person;

import java.util.Arrays;
import java.util.Random;
//import aaa.com.Person; // error
//클래스 이름이 같은 것이 있을 경우 동시에  import 불가능

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        Person p = new Person();

        System.out.println(p);
        System.out.println(p.toString());
        System.out.println(p.name); //null
        System.out.println(p.age); //0


        // 객체 생성 후에 값 변경
        p.name = "kim";
        p.age = 33;

        System.out.println(p.name);
        System.out.println(p.age);

        System.out.println(Person.tel); //static 변수 tel은 클래스이름으로 접근
        //static 변수는 객체생성과는 무관
        Person.tel = "010";
        System.out.println(Person.tel);

        //랜덤객체
        Random r = new Random(); //임의의 데이터를 생성해주는 객체
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextBoolean());
            System.out.println(r.nextDouble());
            System.out.println(r.nextInt());
            System.out.println(r.nextInt(3)); //0~2까지의 수가 나온다.
            System.out.println("---------------------");
        }

        //배열내용을 반복문을 사용하지 않고 확인하기
        String[] strs = new String[]{"ccc","bbb","aaa"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs); //원본데이터 배열을 정렬
        System.out.println(Arrays.toString(strs));

        String str = "kim";
        System.out.println(str);
        System.out.println(str.replace("k","K")); //원본 미변경
        System.out.println(str);
    } //end main
} //end class
