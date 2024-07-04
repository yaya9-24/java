import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_mission2 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //BufferedReader 사용할 것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //members : id, pw, name, tel
        //new String[][]{
        //  new String[]{"admin","hi1234","kim","010"}
        //  new String[]{"admin","hi1234","kim","010"}
        //  new String[]{"admin","hi1234","kim","010"}
        //  }

        //3명의 회원을 가입시키는 반복문을 작성한 후 출력하세요.

        String[][] members = new String[3][4];

        for (int i = 0; i < members.length; i++) {
            System.out.println("id를 입력하세요");
            String id = br.readLine();
            System.out.println("pw를 입력하세요");
            String pw = br.readLine();
            System.out.println("name를 입력하세요");
            String name = br.readLine();
            System.out.println("tel를 입력하세요");
            String tel = br.readLine();

            members[i] = new String[]{id,pw,name,tel};
        }
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < members[i].length; j++) {
                System.out.print(members[i][j]+" ");
            }
            System.out.println();
        }
    } //end main
} // end class