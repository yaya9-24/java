import java.util.Scanner;

public class Main04_for3_mission2 {
    public static void main(String[] args)  {
        System.out.println("hello");

        //2. Scanner 입출력
        Scanner s = new Scanner(System.in);

        //방금전 for반복문 미션처럼 3번 반복하도록 프로그램을 완성하세요.
        String result = "";
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
        for (int i = 0; i < 3; i++) {
            System.out.println("이름을 입력하세요:");
            String name = s.nextLine();

            System.out.println("국어점수를 입력하세요:");
            int kor = Integer.parseInt(s.nextLine());

            System.out.println("영어점수를 입력하세요:");
            int eng = Integer.parseInt(s.nextLine());

            System.out.println("수학점수를 입력하세요:");
            int math = Integer.parseInt(s.nextLine());

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

            System.out.printf("%s,국어(%d),영어(%d),수학(%d),총점(%d),평균(%.1f),등급(%s)\n"
                    ,name,kor,eng,math,total,avg,grade);

            result += String.format("%s,국어(%d),영어(%d),수학(%d),총점(%d),평균(%.1f),등급(%s)\n"
                    ,name,kor,eng,math,total,avg,grade);
        } //end for
        System.out.println("-------------");
        System.out.println(result);

        s.close(); // 스캐너 사용이 끝났다면 닫아준다.
        System.out.println("end main...");
    }//end main
}//end class
