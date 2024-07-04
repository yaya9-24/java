import java.util.Scanner;

public class Main03_mission2 {

    //전역 변수 영역 - 전역변수는 초기화가 없을시 해당타입의 기본값이 자동 할당됨.

    public static void main(String[] args)  {
        System.out.println("hello");

        //로컬변수 영역 - 로컬변수는 선언,초기화,사용의 순서를 지켜야한다.

        //2. Scanner 입출력
        Scanner s = new Scanner(System.in);

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
        String name = s.nextLine();
        System.out.println("이름을 입력하세요:"+name);

        int kor = s.nextInt();
        System.out.println("국어점수를 입력하세요:"+kor);

        int eng = s.nextInt();
        System.out.println("영어점수를 입력하세요:"+eng);

        int math = s.nextInt();
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

        s.close(); // 스캐너 사용이 끝났다면 닫아준다.
        System.out.println("end main...");
    }//end main
}//end class
