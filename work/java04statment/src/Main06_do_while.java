import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_do_while {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        String x = "y";
        {
            System.out.println("계속 하시려면 아무키 입력..종료 시 [x]입력");

        }while(x.equals("aaaa")); //end do-while


        //주의: 상단에 무한반복문 내부에 break문이 없을 경우
        //하단에 코딩은 컴파일오류를 발생한다.
        System.out.println("end main...");
    } // end main

} // end class
