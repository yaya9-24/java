package test.com.main;

import test.com.member.MemberDAO;
import test.com.member.MemberDAOimpl;
import test.com.member.MemberVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MemberMain {
    public static void main(String[] args) throws IOException {

        MemberDAO dao = new MemberDAOimpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력 2.수정 3.삭제 4.번호검색 5.모두검색 6.검색어검색");
            String menu = br.readLine();

            if (menu.equals("1")){
                //1.insert
                System.out.println("id:");
                String id = br.readLine();

                //입력한 id 검증이 필요하다.
                //즉, 중복체크가 필요하다.
                //중복되지 않은 회원아이디인 경우만 다음으로 진행
                MemberVO vo2 = dao.idCheck(id);
                while(vo2!=null){
                    System.out.println("중복된 아이디입니다.");
                    System.out.println("id:");
                    id = br.readLine();
                    vo2 = dao.idCheck(id);
                }
                System.out.println("사용가능한 아이디입니다.");
                System.out.println("pw:");
                String pw = br.readLine();
                System.out.println("name:");
                String name = br.readLine();
                System.out.println("tel:");
                String tel = br.readLine();

                MemberVO vo = new MemberVO();
                vo.setId(id);
                vo.setPw(pw);
                vo.setName(name);
                vo.setTel(tel);
                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert completed");
                } else{
                    System.out.println("insert failed");
                }
            } else if (menu.equals("2")) {
                //2.update
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                // UK and FK설정된 컬럼은 수정안 함
                // System.out.println("id:");
                //String id = br.readLine();
                System.out.println("pw:");
                String pw = br.readLine();
                System.out.println("name:");
                String name = br.readLine();
                System.out.println("tel:");
                String tel = br.readLine();

                MemberVO vo = new MemberVO();
                vo.setNum(num);
                //vo.setId(id);
                vo.setPw(pw);
                vo.setName(name);
                vo.setTel(tel);
                int result = dao.update(vo);
                System.out.println("result:"+result);
                if (result >= 1){
                    System.out.println("update completed");
                } else{
                    System.out.println("update failed");
                }
            }else if (menu.equals("3")){
                //3.delete
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                MemberVO vo = new MemberVO();
                vo.setNum(num);

                int result = dao.delete(vo);
                System.out.println("result:"+result);
                if (result >= 1){
                    System.out.println("delete completed");
                } else{
                    System.out.println("delete failed");
                }
            }else if (menu.equals("4")){
                //4.selectOne
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                MemberVO vo = new MemberVO();
                vo.setNum(num);
                MemberVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if (vo2!=null){
                    System.out.println("selectOne completed");
                } else if (vo2==null) {
                    System.out.println("selectOne failed");
                }
            } else if (menu.equals("5")) {
                //5.selectAll
                List<MemberVO> list = dao.selectAll();
                System.out.printf("%3s %6s %10s %12s %12s\n"
                        ,"번호","ID","PW","NAME","TEL");
                for (MemberVO x:list){
                    System.out.printf("%3d %10s %10s %10s %15s\n"
                            ,x.getNum(),x.getId(),x.getPw(),x.getName(),x.getTel());
                }
                if (list!=null){
                    System.out.println("selectAll completed");
                } else if (list==null) {
                    System.out.println("selectAll failed");
                }
            } else if (menu.equals("6")) {
                //6.searchList
                System.out.println("searchKey:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<MemberVO> list = dao.searchList(searchKey,searchWord);
                System.out.printf("%3s %6s %10s %12s %12s\n"
                        ,"번호","ID","PW","NAME","TEL");
                for (MemberVO x:list){
                    System.out.printf("%3d %10s %10s %10s %15s\n"
                            ,x.getNum(),x.getId(),x.getPw(),x.getName(),x.getTel());
                }
            }

            if (menu.equals("x")) break;
        }//end while
    }//end main
}//end class
