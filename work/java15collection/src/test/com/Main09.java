package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main09 {
    public static void main(String[] args) throws IOException {

        //Main05프로그램을 메뉴기능을 넣어서 Main08처럼
        //반복문이 종료되기 전까지
        //1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색..[x입력 시 종료]
        //[x입력 시 종료]

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MemberDAO dao = new MemberDAOimpl();
        MemberVO vo = null;
        int result = 0;

        while (true) {
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색..[x입력 시 종료]");
            String menu = br.readLine();
            //1.입력
            if (menu.equals("1")) {
                System.out.println("ID:");
                String id = br.readLine();
                System.out.println("PW:");
                String pw = br.readLine();
                System.out.println("name:");
                String name = br.readLine();
                System.out.println("tel:");
                String tel = br.readLine();

                vo = new MemberVO();
                vo.setId(id);
                vo.setPw(pw);
                vo.setName(name);
                vo.setTel(tel);

                result = dao.insert(vo);
                System.out.println("result:" + result);
                if (result==1){
                    System.out.println("insert completed");
                }else {
                    System.out.println("insert failed");
                }
                System.out.println("----------------------------");

            } else if (menu.equals("2")) {
                //2.수정
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("ID:");
                String id = br.readLine();
                System.out.println("PW:");
                String pw = br.readLine();
                System.out.println("name:");
                String name = br.readLine();
                System.out.println("tel:");
                String tel = br.readLine();

                vo = new MemberVO();
                vo.setNum(num);
                vo.setId(id);
                vo.setPw(pw);
                vo.setName(name);
                vo.setTel(tel);

                result = dao.update(vo);
                System.out.println("result:" + result);
                if (result==1){
                    System.out.println("insert completed");
                }else {
                    System.out.println("insert failed");
                }
                System.out.println("----------------------------");
            } else if (menu.equals("3")) {
                //3.삭제
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                vo = new MemberVO();
                vo.setNum(num);

                result = dao.delete(vo);
                System.out.println("result:" + result);
                if (result==1){
                    System.out.println("insert completed");
                }else {
                    System.out.println("insert failed");
                }
                System.out.println("----------------------------");
            } else if (menu.equals("4")) {
                //4.번호검색
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                vo = new MemberVO();
                vo.setNum(num);

                MemberVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if (vo2!=null){
                    System.out.println("selectOne completed");
                }else {
                    System.out.println("selectOne failed");
                }
                System.out.println("----------------------------");
            } else if (menu.equals("5")) {
                //5.모두검색
                List<MemberVO> list = dao.selectAll();
                for (MemberVO x : list) {
                    System.out.println(x);
                }
                if (list.size()==0) System.out.println("selectAll failed");
                System.out.println("----------------------------");
            } else if (menu.equals("6")) {
                //6.검색어검색
                System.out.println("searchKey:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<MemberVO> list = dao.searchList(searchKey, searchWord);
                for (MemberVO x : list) {
                    System.out.println(x);
                }
                if (list.size()==0) System.out.println("searchList failed");
            }

            if (menu.equals("x")) break;
        }
        System.out.println("프로그램 종료");
    }
}

