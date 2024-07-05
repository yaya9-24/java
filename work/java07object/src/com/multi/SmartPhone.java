package com.multi;

public class SmartPhone {
    //속성- 모델,가격,무게,버전
    String model;
    int price;
    double weight;
    double version;

    //기본 생성자 - 임의의 값
    public SmartPhone() {
        System.out.println("SmartPhone()....");
        model = "iPhone15";
        price = 999;
        weight = 950;
        version = 17.0;
    }

    //모든 전역변수를 매개변수로하는 생성자 호출 및 초기화
    //소스코드 줄정리 단축키 : ctrl+shift+alt+l
    public SmartPhone(String model, int price, double weight, double version) {
        System.out.println("SmartPhone(AllArgs).....");
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.version = version;
    }
}
