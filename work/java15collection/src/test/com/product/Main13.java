package test.com.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main13 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //게시글 프로그램을 메뉴기능을 넣어서 Main09처럼
        //BoardVO,BoardDAO,BoardDAOimpl
        //반복문이 종료되기 전까지
        //1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색..[x입력 시 종료]
        //[x입력 시 종료]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ProductDAO dao = new ProductDAOimpl();
        ProductVO vo;
        int result;

        while (true){
            System.out.println("메뉴를 입력하세요");
            System.out.println("//1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색");
            System.out.println("---------------------");
            String menu = br.readLine();

            if (menu.equals("1")){
                //1.입력
                System.out.println("pname:");
                String pname = br.readLine();
                System.out.println("model:");
                String model = br.readLine();
                System.out.println("price:");
                int price = Integer.parseInt(br.readLine());
                System.out.println("count:");
                int count = Integer.parseInt(br.readLine());

                vo = new ProductVO();
                vo.setPname(pname);
                vo.setModel(model);
                vo.setPrice(price);
                vo.setCount(count);
                result = dao.insert(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert successed");
                } else {
                    System.out.println("insert failed");
                }
            } else if (menu.equals("2")) {
                //2.수정
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("pname:");
                String pname = br.readLine();
                System.out.println("model:");
                String model = br.readLine();
                System.out.println("price:");
                int price = Integer.parseInt(br.readLine());
                System.out.println("count:");
                int count = Integer.parseInt(br.readLine());

                vo = new ProductVO();
                vo.setNum(num);
                vo.setPname(pname);
                vo.setModel(model);
                vo.setPrice(price);
                vo.setCount(count);
                result = dao.update(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("update successed");
                } else {
                    System.out.println("update failed");
                }
            } else if (menu.equals("3")) {
                //3.삭제
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                vo = new ProductVO();
                vo.setNum(num);
                result = dao.delete(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("delete successed");
                } else {
                    System.out.println("delete failed");
                }
            } else if (menu.equals("4")) {
                //4.번호검색
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                vo = new ProductVO();
                vo.setNum(num);
                ProductVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if (vo2!=null){
                    System.out.println("selectOne successed");
                } else {
                    System.out.println("selectOne failed");
                }
            } else if (menu.equals("5")) {
                //5.모두검색
                List<ProductVO> list = dao.selectAll();
                for (ProductVO x:list){
                    System.out.println(x);
                }
            } else if (menu.equals("6")) {
                //6.검색어검색
                System.out.println("searchKey:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();

                List<ProductVO> list2 = dao.searchList(searchKey,searchWord);
                for (ProductVO x : list2){
                    System.out.println(x);
                }
            }


            if (menu.equals("x")) break;
        }//end while

    } //end main
}//end class
