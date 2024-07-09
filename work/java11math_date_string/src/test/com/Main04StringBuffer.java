package test.com;

public class Main04StringBuffer {
    public static void main(String[] args)  {
        System.out.println("hello");

        //대용량 문자열 처리객체
//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        //문자열 추가
        sb.append("hello");
        sb.append("hello");
        sb.append("hello");
        sb.append("hello");
        System.out.println(sb.toString());

        String str ="";
        str +="hello";
        str +="hello";
        str +="hello";
        str +="hello";
        System.out.println(str);

        String str2 = "";
        str2 = str2.concat("hello").concat("hello").concat("hello").concat("hello");
        System.out.println(str2);

        //프로세스 경과 시간 체크하기
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
//            str +="hello"; //14초 소요
            sb.append("hello"); //0.016초
        }
//        System.out.println(str.length());
        System.out.println(sb.length());
        System.out.println(System.currentTimeMillis()-startTime);

        String txt = "abcdef";
        System.out.println(new StringBuffer(txt).reverse());
        System.out.println(new StringBuilder(txt).reverse());
    } //end main
} //end class
