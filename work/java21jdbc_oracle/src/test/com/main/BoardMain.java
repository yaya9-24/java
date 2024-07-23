package test.com.main;

import test.com.board.BoardDAO;
import test.com.board.BoardDAOimpl;
import test.com.board.BoardVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BoardDAO dao = new BoardDAOimpl();

        while (true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력 2.수정 3.삭제 4.번호검색 5.모두검색 6.검색어검색");
            String menu = br.readLine();
            if (menu.equals("1")){
                //1.insert
                System.out.println("title:");
                String title = br.readLine();
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                BoardVO vo = new BoardVO();
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.insert(vo);
                if (result==1){
                    System.out.println("insert completed");
                } else{
                    System.out.println("insert failed");
                }
            } else if (menu.equals("2")) {
                //2.update
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("title:");
                String title = br.readLine();
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                BoardVO vo = new BoardVO();
                vo.setNum(num);
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.update(vo);
                if (result==1){
                    System.out.println("update completed");
                } else{
                    System.out.println("update failed");
                }
            } else if (menu.equals("3")) {
                //3.delete
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                BoardVO vo = new BoardVO();
                vo.setNum(num);

                int result = dao.delete(vo);
                if (result==1){
                    System.out.println("delete completed");
                } else{
                    System.out.println("delete failed");
                }
            } else if (menu.equals("4")) {
                //4.selectOne
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                BoardVO vo = new BoardVO();
                vo.setNum(num);
                BoardVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if (vo2!=null){
                    System.out.println("delete completed");
                } else if (vo2==null){
                    System.out.println("delete failed");
                }
            } else if (menu.equals("5")) {
                //5.selectAll
                List<BoardVO> list = dao.selectAll();
                System.out.printf("%3s %5s %9s %10s %12s\n"
                        ,"번호","제목","내용","작성자","작성일자");
                for (BoardVO x:list){
                    System.out.printf("%3d %10s %10s %10s %20s\n"
                            ,x.getNum(),x.getTitle(),x.getContent(),x.getWriter(),x.getWdate());
                }
            } else if (menu.equals("6")) {
                //6.searchList
                System.out.println("searchKey:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<BoardVO> list = dao.searchList(searchKey,searchWord);
                System.out.printf("%3s %5s %9s %10s %12s\n"
                        ,"번호","제목","내용","작성자","작성일자");
                for (BoardVO x:list){
                    System.out.printf("%3d %10s %10s %10s %20s\n"
                            ,x.getNum(),x.getTitle(),x.getContent(),x.getWriter(),x.getWdate());
                }
            }
            if (menu.equals("x")) break;
        }//end while
    }//end main
}//end class
