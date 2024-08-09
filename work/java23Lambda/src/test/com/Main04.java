package test.com;

public class Main04 {
    public static void main(String[] args){
        System.out.println("hello");

        //Taxi3를 이용해서 아래 1~3번을 완성하세요.
        //1.변수에 할당
        Taxi3 t3 = (int x,int y)-> x+y;

        int sum = t3.open(3,5);
        System.out.println("sum:"+sum);

        //2.함수호출시 인자로전달(매개변수에 할당)
        testTaxi((int x,int y)->{
            return x+y;
        });

        //3.함수의 리턴문에 사용가능
        t3 = test2Taxi();
        sum = t3.open(333,555);
        System.out.println("sum:"+sum);
    }//end main

    public static Taxi3 test2Taxi(){
        return (x,y)->x+y;
    }

    public static void testTaxi(Taxi3 t3){
        int sum = t3.open(3,5);
        System.out.println("sum:"+sum);
    }
}//end class
