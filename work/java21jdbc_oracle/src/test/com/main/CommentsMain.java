package test.com.main;

import test.com.board.BoardVO;
import test.com.comments.CommentsDAO;
import test.com.comments.CommentsDAOimpl;
import test.com.comments.CommentsVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CommentsMain {
    public static void main(String[] args) throws IOException {

        // mission
        // 해당 게시글에 작성된 댓글기능을 구현하세요.
        // java: CommentsVO,CommentsDAO,CommentsDAOimpl, CommentsMain
        // oracle db : comments - num(PK),content,writer,wdate,bnum(FK)

        CommentsDAO dao = new CommentsDAOimpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력 2.수정 3.삭제 4.번호검색 5.모두검색 6.검색어검색");
            String menu = br.readLine();
            System.out.println("=======================");

            if (menu.equals("1")){
                //1.댓글 입력
                System.out.println("bnum:");
                int bnum = Integer.parseInt(br.readLine());
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();


                CommentsVO vo = new CommentsVO();
                vo.setBnum(bnum);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert completed");
                } else{
                    System.out.println("insert failed");
                }
                System.out.println("=================");
            } else if (menu.equals("2")) {
                //2.댓글 수정
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();


                CommentsVO vo = new CommentsVO();
                vo.setNum(num);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.update(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("update completed");
                } else{
                    System.out.println("update failed");
                }
                System.out.println("====================");
            } else if (menu.equals("3")) {
                //댓글 삭제
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                CommentsVO vo = new CommentsVO();
                vo.setNum(num);

                int result = dao.delete(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("delete completed");
                } else{
                    System.out.println("delete failed");
                }
                System.out.println("====================");
            }else if (menu.equals("4")) {
                //4.selectOne
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                CommentsVO vo = new CommentsVO();
                vo.setNum(num);

                CommentsVO vo2 = dao.selectOne(vo);
                System.out.printf("%3s  %9s %10s %12s\n"
                        ,"번호","내용","작성자","작성일자");
                System.out.printf("%3d %10s %10s %10s %20s\n"
                        ,vo2.getNum(),vo2.getContent(),vo2.getWriter(),vo2.getWdate());
                if (vo2!=null){
                    System.out.println("selectOne completed");
                } else if (vo2==null){
                    System.out.println("selectOne failed");
                }
            } else if (menu.equals("5")){
                //5.댓글 모두 검색
                System.out.println("bnum:");
                int bnum = Integer.parseInt(br.readLine());

                List<CommentsVO> list = dao.selectAll(bnum);

                System.out.printf("%s %5s %8s %10s %10s\n"
                        ,"게시글번호","댓글번호","내용","작성자","작성일자");
                for (CommentsVO x : list){
                    System.out.printf("%8d %8d %10s %10s %10s \n"
                            ,x.getBnum(),x.getNum(),x.getContent(),x.getWriter(),x.getWdate());
                }
            } else if (menu.equals("6")) {
                //6.searchList
                System.out.println("searchKey[writer or content]:");
                String searchKey = br.readLine();

                System.out.println("searchWord:");
                String searchWord = br.readLine();

                System.out.println("bnum:");
                int bnum = Integer.parseInt(br.readLine());

                List<CommentsVO> list = dao.searchList(searchKey,searchWord,bnum);
                System.out.printf("%3s %5s %5s %20s %10s\n"
                        ,"게시글번호","댓글번호","내용","작성자","작성일자");
                for (CommentsVO x : list){
                    System.out.printf("%3d %3d %5s %5s         %20s \n"
                            ,x.getBnum(),x.getNum(),x.getContent(),x.getWriter(),x.getWdate());
                }
            }
            if (menu.equals("x")) break;
        } //end while
    } //end main
} //end class
