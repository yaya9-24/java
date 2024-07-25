package test.com.main;

import test.com.dept.DeptDAO;
import test.com.dept.DeptDAOimpl;
import test.com.dept.DeptVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class DeptMain {
    public static void main(String[] args) throws IOException {

        DeptDAO dao = new DeptDAOimpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력 2.수정 3.삭제 4.번호검색 5.모두검색 6.검색어검색");
            String menu = br.readLine();
            System.out.println("======================");

            if (menu.equals("1")){
                //1.입력
                System.out.println("department_name:");
                String department_name = br.readLine();
                System.out.println("manager_id:");
                int manager_id = Integer.parseInt(br.readLine());
                System.out.println("location_id:");
                int location_id = Integer.parseInt(br.readLine());


                DeptVO vo = new DeptVO();
                vo.setDepartment_name(department_name);
                vo.setManager_id(manager_id);
                vo.setLocation_id(location_id);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert successed...");
                }else {
                    System.out.println("insert failed...");
                }
            } else if (menu.equals("2")) {
                //2.수정
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());
                System.out.println("department_name:");
                String department_name = br.readLine();
                System.out.println("manager_id:");
                int manager_id = Integer.parseInt(br.readLine());
                System.out.println("location_id:");
                int location_id = Integer.parseInt(br.readLine());


                DeptVO vo = new DeptVO();
                vo.setDepartment_id(department_id);
                vo.setDepartment_name(department_name);
                vo.setManager_id(manager_id);
                vo.setLocation_id(location_id);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert successed...");
                }else {
                    System.out.println("insert failed...");
                }
            } else if (menu.equals("3")) {
                //3.삭제
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());

                DeptVO vo = new DeptVO();
                vo.setDepartment_id(department_id);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert successed...");
                }else {
                    System.out.println("insert failed...");
                }
            } else if (menu.equals("4")) {
                //4.번호검색
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());

                DeptVO vo = new DeptVO();
                vo.setDepartment_id(department_id);
                DeptVO vo2 = dao.selectOne(vo);
                System.out.println(vo2);
                if (vo2!=null){
                    System.out.println("selectOne successed...");
                }else if (vo2==null){
                    System.out.println("selectOne failed...");
                }
            } else if (menu.equals("5")) {
                //5.모두검색
                List<DeptVO> list = dao.selectAll();
                System.out.printf("%8s%15s%10s%8s\n","부서번호","부서명","매니저아이디","지역코드");
                for (DeptVO x: list){
                    System.out.printf("%8d%23s%8d%8d\n",
                            x.getDepartment_id(),x.getDepartment_name(),x.getManager_id(),x.getLocation_id());
                }
            } else if (menu.equals("6")) {
                //6.검색어검색
                System.out.println("searchKey[department_name,manager_id]:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<DeptVO> list = dao.searchList(searchKey,searchWord);
                System.out.printf("%8s%15s%10s%8s\n","부서번호","부서명","매니저아이디","지역코드");
                for (DeptVO x: list){
                    System.out.printf("%8d%23s%8d%8d\n",
                            x.getDepartment_id(),x.getDepartment_name(),x.getManager_id(),x.getLocation_id());
                }
            }

            if(menu.equals("x")) break;
        }//end while
    }//end main
}//end class
