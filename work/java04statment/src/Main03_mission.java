import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //1.io - Input/Output 무조건 외우기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
        String name = br.readLine();
        System.out.println("이름을 입력하세요:"+name);

        int kor = Integer.parseInt(br.readLine());
        System.out.println("국어점수를 입력하세요:"+kor);

        int eng = Integer.parseInt(br.readLine());
        System.out.println("영어점수를 입력하세요:"+eng);

        int math = Integer.parseInt(br.readLine());
        System.out.println("수학점수를 입력하세요:"+math);

        int total = kor+eng+math;
        double avg = total/3.0;
        String grade = null;
        if (avg<=100 && avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        }else if (avg >= 70) {
            grade = "C";
        }else{
            grade = "D";
        }

        System.out.printf("%s,국어(%d),영어(%d),수학(%d),총점(%d),평균(%.1f),등급(%s)"
                ,name,kor,eng,math,total,avg,grade);

        br.close(); // IO 사용이 끝났다면 닫아준다.
        System.out.println("end main...");
    }//end main
}//end class
