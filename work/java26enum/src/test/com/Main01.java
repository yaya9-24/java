package test.com;

public class Main01 {

    public static void main(String[] args) {
        System.out.println("hello...");

        //열거형 상수
        //특정된 대명사들을 상수로 열거해서 객체화 할 수 있다. >>> Enum 객체
        //예: 계절명칭,요일명,월명,차모델명,,,등을 미리 선언해놓고 사용하고자 할 때

        //1. 상수를 인터페이스를 통해서 선언해줄 수 있다.
        System.out.println(Week01_interface.FRIDAY); //문자열리턴
        String today = Week01_interface.FRIDAY;

        //2.상수를 Enum 통해서 선언해줄 수 있다.
        System.out.println(Week02_enum.MONDAY); //Week02_enum리턴
        Week02_enum today2 = Week02_enum.MONDAY; //interface 상수와 다른 점이다.!!!
        System.out.println(today2.name()); //문자열반환 함수
        System.out.println(today2.ordinal()); //열거된 순서(인덱스) 반환
    }//end main
}//end class
