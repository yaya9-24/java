package test.com;

public class NoteBook {

    int price;
    double size;
    String model;

    //생성자 - 클래스명과 동일한 이름 사용, 리턴타입 명시 안함.
    //생성자가  여러 개 정의될 경우 매개변수의 타입,순서,개수가 다르게 생성해야한다.
    //생성자(메서드,함수) 오버로딩 이라고 합니다.
    public NoteBook(){
        System.out.println("NoteBook()....");
        //전역변수의 초기화를 주목적으로 한다.
        price = 100;
        size = 4.5;
        model = "SM";
    } // end noArgs


    //this는 위의 전역변수를 의미한다.!!!
    public NoteBook(String model,int price, double size){
        //전역변수의 초기화를 주목적으로 한다.
        System.out.println("String model,int price, double size");
        this.price = price;
        this.size = size;
        this.model = model;

    } // end noArgs

    public NoteBook(String model, double size){
        //this(); //this생성자의 첫 라인에 반드시 콜
        this("OO",777,77.7);
        System.out.println("NoteBook(String model, double size)....");
        this.model = model;
        this.size = size;

    }
    public NoteBook(String model, int price){
        this.model = model;
        this.price = price;
    }
} //end class
