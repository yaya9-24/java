package test.com.main;

import test.com.emp.EmpDAO;
import test.com.emp.EmpDAOimpl;
import test.com.emp.EmpVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) throws IOException {

        EmpDAO dao = new EmpDAOimpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력 2.수정 3.삭제 4.번호검색 5.모두검색 6.검색어검색");
            String menu = br.readLine();
            System.out.println("======================");

            if (menu.equals("1")){
                //1.입력
                System.out.println("first_name:");
                String first_name = br.readLine();
                System.out.println("last_name:");
                String last_name = br.readLine();
                System.out.println("email:");
                String email = br.readLine();
                System.out.println("phone_number:");
                String phone_number = br.readLine();
                System.out.println("job_id:");
                String job_id = br.readLine();
                System.out.println("salary:");
                int salary = Integer.parseInt(br.readLine());
                System.out.println("commission_pct:");
                double commission_pct = Double.parseDouble(br.readLine());
                System.out.println("manager_id:");
                int manager_id = Integer.parseInt(br.readLine());
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());

                EmpVO vo = new EmpVO();
                vo.setFirst_name(first_name);
                vo.setLast_name(last_name);
                vo.setEmail(email);
                vo.setPhone_number(phone_number);
                vo.setHire_date(new Date(new Timestamp(System.currentTimeMillis()).getTime()));
                vo.setJob_id(job_id);
                vo.setSalary(salary);
                vo.setCommission_pct(commission_pct);
                vo.setManager_id(manager_id);
                vo.setDepartment_id(department_id);

                int result = dao.insert(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert successed...");
                }else {
                    System.out.println("insert failed...");
                }
            } else if (menu.equals("2")) {
                //2.수정
                System.out.println("employee_id:");
                int employee_id = Integer.parseInt(br.readLine());
                System.out.println("first_name:");
                String first_name = br.readLine();
                System.out.println("last_name:");
                String last_name = br.readLine();
                System.out.println("email:");
                String email = br.readLine();
                System.out.println("phone_number:");
                String phone_number = br.readLine();
                System.out.println("job_id:");
                String job_id = br.readLine();
                System.out.println("salary:");
                int salary = Integer.parseInt(br.readLine());
                System.out.println("commission_pct:");
                double commission_pct = Double.parseDouble(br.readLine());
                System.out.println("manager_id:");
                int manager_id = Integer.parseInt(br.readLine());
                System.out.println("department_id:");
                int department_id = Integer.parseInt(br.readLine());

                EmpVO vo = new EmpVO();
                vo.setEmployee_id(employee_id);
                vo.setFirst_name(first_name);
                vo.setLast_name(last_name);
                vo.setEmail(email);
                vo.setPhone_number(phone_number);
                vo.setHire_date(new Date(new Timestamp(System.currentTimeMillis()).getTime()));
                vo.setJob_id(job_id);
                vo.setSalary(salary);
                vo.setCommission_pct(commission_pct);
                vo.setManager_id(manager_id);
                vo.setDepartment_id(department_id);

                int result = dao.update(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert successed...");
                }else {
                    System.out.println("insert failed...");
                }
            } else if (menu.equals("3")) {
                //3.삭제
                System.out.println("employee_id:");
                int employee_id = Integer.parseInt(br.readLine());

                EmpVO vo = new EmpVO();
                vo.setEmployee_id(employee_id);

                int result = dao.delete(vo);
                System.out.println("result:"+result);
                if (result==1){
                    System.out.println("insert successed...");
                }else {
                    System.out.println("insert failed...");
                }
            } else if (menu.equals("4")) {
                //4.번호검색
                System.out.println("employee_id:");
                int employee_id = Integer.parseInt(br.readLine());

                EmpVO vo = new EmpVO();
                vo.setEmployee_id(employee_id);
                EmpVO vo2 = dao.selectOne(vo);
                if (vo2!=null){
                    System.out.println("selectOne successed...");
                }else if (vo2==null){
                    System.out.println("selectOne failed...");
                }
            } else if (menu.equals("5")) {
                //5.모두검색
                List<EmpVO> list = dao.selectAll();
                for (EmpVO x: list){
                    System.out.println(x);
                }
            } else if (menu.equals("6")) {
                //6.검색어검색
                System.out.println("searchKey:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<EmpVO> list = dao.searchList(searchKey,searchWord);
                for (EmpVO x: list){
                    System.out.println(x);
                }
            }

            if(menu.equals("x")) break;
        }//end while

    }//end main
}//end class
