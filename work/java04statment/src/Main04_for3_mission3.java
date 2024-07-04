import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04_for3_mission3 {
    public static void main(String[] args) throws IOException{
        System.out.println("hello");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 이전 미션처럼 반복문을 3번 사용하되 메뉴5가 입력되면 반복문 탈출하도록 하세요.

        //메뉴를 입력하세요
        //System.out.println("메뉴선택 [1.입력 2.수정 3.삭제 4.검색 5.종료]");
        //메뉴선택 [1.입력 2.수정 3.삭제 4.검색 5.종료]

        //어떤 번호를 선택했는지에 따라서 분기처리
        //1번 선택 : 입력 이라고 출력
        //2번 선택 : 수정 이라고 출력
        //3번 선택 : 삭제 이라고 출력
        //4번 선택 : 검색 이라고 출력
        //5번 선택 : 프로그램을 종료합니다 라고 출력

        first:for (int i = 0; i < 3; i++) {
            System.out.println("메뉴선택 [1.입력 2.수정 3.삭제 4.검색 5.종료]");
            String menu =br.readLine();
            switch(menu){
                case "1":
                    System.out.println("입력");
                    break;
                case "2":
                    System.out.println("수정");
                    break;
                case "3":
                    System.out.println("삭제");
                    break;
                case "4":
                    System.out.println("검색");
                    break;
                case "5":
                    System.out.println("프로그램을 종료합니다");
                    break first;
            }
        }

        br.close();
        System.out.println("end main...");
    }//end main
}//end class
