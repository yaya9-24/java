package test.com;

import com.multi.Bus;
// 패키지를 다 가져오려면 *을 쓴다. import.com.multi.*
public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //자동import설정하기(편리한 기능)
        //설정 - Editer - General - AutoImport
        //에서 java항목의 체크박스 모두 체크

        //클래스 정의 가능한 영역
        //1.패키지에 생성 - test.com.Person
        //객체 생성 - new +생성자()
        //변수에 할당
        //String s = new String();
        //Object obj = new Object();
        Person p = new Person();
        System.out.println(p.name);
        Bus bus = new Bus();
        //2.클래스 내부에 중첩해서 정의가능
        class Test{
            //2번이 여기 해당
        }
        //3.메인클래스파일 외부에 정의가능(비권장)

    } // end main

    class Car{
        //2번이 여기 해당
    }
} // end class
class Student{
    //테스트용이거나 메인클래스와 일회용으로 사용될 때
}