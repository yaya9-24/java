//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) { //
        System.out.println("hello");

        //1. 산술연산자
        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);
        //java에서 정수 간의 나눗셈은 몫만 반환
        System.out.println(10 / 3);
        //소수점이하까지 결과를 보고싶다면 double타입으로 나눠주면 된다.
        System.out.println(10 / 3.0);
        System.out.println(Math.round(10 / 3.0)); // 소숫점이하 반올림
        System.out.println(Math.ceil(10 / 3.0)); // 소숫점이하 올림
        System.out.println(Math.floor(10 / 3.0)); // 소숫점이하 버림
        System.out.println(10 % 3);

        //2.증감연산자 ++,--
        int a = 100;
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println("---------------");
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println("---------------");

        //3.복합대입연산자
        int x = 10;
        System.out.println(x+=10);
        System.out.println(x-=10);
        System.out.println(x*=10);
        System.out.println(x/=10);
        System.out.println(x%=10);
        System.out.println("---------------");

        //4.비트연산자 - &,|,^
        System.out.println(10 & 3);
        System.out.println(10 | 3);
        System.out.println(10 ^ 3);
        System.out.println("---------------");
        x = 10;
        System.out.println(x &=3);
        x = 10;
        System.out.println(x |=3);
        x = 10;
        System.out.println(x ^=3);
        System.out.println("---------------");

        //5.비교연산자 ==, !=,>,<,>=,<=
        System.out.println(5==5);
        System.out.println(5!=5);
        System.out.println(5>5);
        System.out.println(5<5);
        System.out.println(5>=5);
        System.out.println(5<=5);
        System.out.println("---------------");

        //6.논리연산자 &,|,&&,||
        //연산자 좌우측은 반드시 boolean타입만 허용
        System.out.println(true & true);
        System.out.println(true | true);
        System.out.println(true && true);
        System.out.println(true || true);

        System.out.println("---------------");

        //7.쉬프트연산자 >>,<<,>>>
        System.out.println(8 >> 1); //4
        System.out.println(8 >> 2); //2
        System.out.println(8 << 1); // 16
        System.out.println(8 << 2); // 32
        System.out.println(-8 >>> 1); //양수처리
        System.out.println(Integer.toBinaryString(-8));
        System.out.println("0"+Integer.toBinaryString(2147483644));

        //8.조건연산자(제어연산자,삼항연산자)? :
        double avg = 90.0;
        System.out.println(avg>=90?"A":"B");
        System.out.println(avg>=90?"A":avg>=80?"B":"C");

        //9. 기타연산자 () , . ... [] new instance of


    } // end main
} //end class