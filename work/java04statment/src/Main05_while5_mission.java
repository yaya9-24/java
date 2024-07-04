import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_while5_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //아래에 주어진 프로그램을 무한히 반복하되 [x입력시 종료]
        //학생성적을 처리하는 프로그램을 작성하세요.
        //while문을 사용할 것

        //1.io - Input/Output 무조건 외우기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result ="";
        //변수 - 이름,국,영,수,총점,평균,등급
        //name,kor,eng,math,total,avg,grade
        //이름을 입력하세요 라고 출력하기
        //변수처리
        //국어점수를 입력하세요 라고 출력하기
        //변수처리
        //영어점수를 입력하세요 라고 출력하기
        //변수처리
        //수학점수를 입력하세요 라고 출력하기
        //변수처리

        //총점변수처리
        //평균변수처리
        //등급변수처리
        //최종출력문
        //홍길동, 국어(99),영어(88),수학(77),총점(264),평균(88.0),등급(B)
        while(true) {

            System.out.println("이름을 입력하세요:");
            String name = br.readLine();

            System.out.println("국어점수를 입력하세요:");
            int kor = Integer.parseInt(br.readLine());

            System.out.println("영어점수를 입력하세요:");
            int eng = Integer.parseInt(br.readLine());

            System.out.println("수학점수를 입력하세요:");
            int math = Integer.parseInt(br.readLine());

            int total = kor + eng + math;
            double avg = total / 3.0;
            String grade = null;
            if (avg <= 100 && avg >= 90) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C";
            } else {
                grade = "D";
            }

            System.out.printf("%s,국어(%d),영어(%d),수학(%d),총점(%d),평균(%.1f),등급(%s)"
                    , name, kor, eng, math, total, avg, grade);
//            result += name+", 국어("+kor+"),영어("+eng+"),수학("+math+")" +
//                    ",총점("+total+"),평균("+avg+"),등급("+grade+")\n";

            result += String.format("%s,국어(%d),영어(%d),수학(%d),총점(%d),평균(%.1f),등급(%s)\n"
                    , name, kor, eng, math, total, avg, grade);
            System.out.println();
            System.out.println("[x입력시 종료]");
            if (br.readLine().equals("x")) break;
        }
        System.out.println("------end for--------------");
        System.out.println(result);
        //반복문이 종료도니 후에는 아래와 같이 출력되도록 합니다.
        //홍길동1, 국어(11),영어(22),수학(33),총점(66),평균(22.0),등급(D)
        //홍길동2, 국어(44),영어(55),수학(66),총점(165),평균(55.0),등급(D)
        //홍길동3, 국어(77),영어(88),수학(99),총점(264),평균(88.0),등급(B)
        br.close(); // IO 사용이 끝났다면 닫아준다.
        System.out.println("end main...");
    }//end main
}//end class
