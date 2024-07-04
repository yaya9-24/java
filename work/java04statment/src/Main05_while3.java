public class Main05_while3 {
    public static void main(String[] args) {
        System.out.println("hello");
        //문자열 비교시 사용하는 함수(메소드):equals
        System.out.println("kim"=="kim");
        System.out.println("kim"==new String("kim"));
        System.out.println("kim".equals("kim"));
        System.out.println("kim".equals(new String("kim")));

        String x = "y";
        while(!x.equals("x")){
            System.out.println(x);

            x="x";

        } //end while


        //주의: 상단에 무한반복문 내부에 break문이 없을 경우
        //하단에 코딩은 컴파일오류를 발생한다.
        System.out.println("end main...");
    } // end main

} // end class
