package com.multi;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("hello...");

        //SmartPhone 클래스를 정의하세요.
        //속성- 모델,가격,무게,버전
        //기본 생성자 - 임의의 값
        //출력
        SmartPhone sp = new SmartPhone();
        System.out.println(sp.model);
        System.out.println(sp.price);
        System.out.println(sp.weight);
        System.out.println(sp.version);
        //모든 전역변수를 매개변수로하는 생성자 호출 및 초기화
        //출력
        System.out.println("=================");
        sp = new SmartPhone("Galuxsy",1110,1000,5.5);
        System.out.println(sp.model);
        System.out.println(sp.price);
        System.out.println(sp.weight);
        System.out.println(sp.version);
    }//end main
}// end class
