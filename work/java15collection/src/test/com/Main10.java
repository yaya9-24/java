package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main10 {
    public static void main(String[] args) throws IOException {

        //게시글 프로그램을 메뉴기능을 넣어서 Main09처럼
        //BoardVO,BoardDAO,BoardDAOimpl
        //반복문이 종료되기 전까지
        //1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색..[x입력 시 종료]
        //[x입력 시 종료]

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BoardDAO dao = new BoardDAOimpl();
        BoardVO vo = null;
        int result = 0;
        while(true){

            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색..[x입력 시 종료]");
            String menu = br.readLine();
            System.out.println("-----------------------");
            //1.입력
            if (menu.equals("1")){
                System.out.println("title:");
                String title = br.readLine();
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                vo = new BoardVO();
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);

                result = dao.insert(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert successed");
                }else {
                    System.out.println("insert failed");
                }
                System.out.println("-----------------------");
            }else if (menu.equals("2")){
                //2.수정
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("title:");
                String title = br.readLine();
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                vo = new BoardVO();
                vo.setNum(num);
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);

                result = dao.update(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("update successed");
                }else {
                    System.out.println("update failed");
                }
                System.out.println("-----------------------");
            }else if (menu.equals("3")){
                //3.삭제
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                vo = new BoardVO();
                vo.setNum(num);

                result = dao.delete(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("delete successed");
                }else {
                    System.out.println("delete failed");
                }
                System.out.println("-----------------------");
            }else if (menu.equals("4")){
                //4.번호검색
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                vo = new BoardVO();
                vo.setNum(num);
                BoardVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if (vo2!=null){
                    System.out.println("selectOne successed");
                }else {
                    System.out.println("selectOne failed");
                }
                System.out.println("-----------------------");
            }else if (menu.equals("5")){
                //5.모두검색
                List<BoardVO> list = dao.selectAll();
                for (BoardVO x : list){
                    System.out.println(x);
                }
                System.out.println("-----------------------");
            } else if (menu.equals("6")) {
                //6.검색어검색
                System.out.println("searchKey[title or content]:");
                String searchKey =br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<BoardVO> list = dao.searchList(searchKey,searchWord);
                for (BoardVO x : list){
                    System.out.println(x);
                }
                System.out.println("-----------------------");
            }


            if (menu.equals("x")) break;
        }


        System.out.println("프로그램 종료");
    }
}

