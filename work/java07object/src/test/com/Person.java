package test.com;

public class Person /*extends Object*/{

    //속성 - 이름,나이
    //전역변수 - 해당타입의 기본값으로 자동할당됨.
    //접근제한자 설정가능-public(공용),default(package),protected(상속관계),private(클래스내부에서만)
    //member field, property,attribute, 전역변수
    public String name; //null 값이 할당.
    public int age; //0

    //static 선언 가능한곳 : 클래스, 전역변수, 메서드
    public static String tel; //static 선언된 변수는 "클래스이름"으로 접근
}
