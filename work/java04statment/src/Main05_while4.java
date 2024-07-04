import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_while4 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //1.BufferedReader 객체생성 및 초기화(io-3단콤보)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //2.main메소드에 add throws(예외전가)-IOException

        String x = "y";
        while(true){

            System.out.println("계속 하시려면 아무키 입력..종료 시 [x]입력");
            x=br.readLine(); //3.br.readLine()을 이용해서 처리해보기.
            System.out.println(x);
            if(x.equals("x")) break;

        } //end while


        //주의: 상단에 무한반복문 내부에 break문이 없을 경우
        //하단에 코딩은 컴파일오류를 발생한다.
        br.close();
        System.out.println("end main...");
    } // end main

} // end class
