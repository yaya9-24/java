package test.com.main;

import test.com.emp.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.GregorianCalendar;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) throws IOException {

        EmpDAO dao = new EmpDAOimpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력 2.수정 3.삭제 4.번호검색 5.모두검색 6.검색어검색\n" +
                    "7.모두검색2(부서+사원 조인=뷰-view_dept_emp)\n" +
                    "8.모두검색3(업무+사원 조인=뷰-view_job_emp)");
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
                System.out.println("hire_date[예:2024-12-25]");
                String str_hire_date = br.readLine();
                String[] arr = str_hire_date.split("-");
                GregorianCalendar cal = new GregorianCalendar(Integer.parseInt(arr[0]),Integer.parseInt(arr[1])-1,Integer.parseInt(arr[2]));
                System.out.println(new Date(cal.getTimeInMillis()));
                Date hire_date = new Date(cal.getTimeInMillis());
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
                //vo.setHire_date(new Date(new Timestamp(System.currentTimeMillis()).getTime()));
                vo.setHire_date(hire_date);
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
                System.out.printf("%5s%10s%10s%10s%15s%15s%13s%10s%10s%10s%10s\n"
                        ,"사원번호","이름","성","이메일","폰번","입사일","업무코드","월급","커미션","매니저번호","부서번호");
                for (EmpVO x: list){
                    System.out.printf("%5s%12s%12s%15s%20s%15s%15s%10s%10s%10s%10s\n"
                            ,x.getEmployee_id(),x.getFirst_name(),x.getLast_name(),x.getEmail(),x.getPhone_number()
                            ,x.getHire_date(),x.getJob_id(),x.getSalary(),x.getCommission_pct(),x.getManager_id()
                            ,x.getDepartment_id());
                }
            } else if (menu.equals("6")) {
                //6.검색어검색
                System.out.println("searchKey[first_name,job_id]:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<EmpVO> list = dao.searchList(searchKey,searchWord);

                System.out.printf("%5s%10s%10s%10s%15s%15s%13s%10s%10s%10s%10s\n"
                        ,"사원번호","이름","성","이메일","폰번","입사일","업무코드","월급","커미션","매니저번호","부서번호");
                for (EmpVO x: list){
                    System.out.printf("%5s%12s%12s%15s%20s%15s%15s%10s%10s%10s%10s\n"
                            ,x.getEmployee_id(),x.getFirst_name(),x.getLast_name(),x.getEmail(),x.getPhone_number()
                            ,x.getHire_date(),x.getJob_id(),x.getSalary(),x.getCommission_pct(),x.getManager_id()
                            ,x.getDepartment_id());
                }
            }else if (menu.equals("7")){
                //7.모두검색2
                List<EmpDeptVO> list = dao.selectAll2();
                System.out.printf("%5s%10s%10s%10s%15s%15s%13s%10s%10s%10s%10s%10s\n"
                        ,"사원번호","이름","성","이메일","폰번","입사일","업무코드","월급","커미션","매니저번호","부서번호","부서이름");
                for (EmpDeptVO x: list){
                    System.out.printf("%5s%12s%12s%15s%20s%15s%15s%10s%10s%10s%10s%17s\n"
                            ,x.getEmployee_id(),x.getFirst_name(),x.getLast_name(),x.getEmail(),x.getPhone_number()
                            ,x.getHire_date(),x.getJob_id(),x.getSalary(),x.getCommission_pct(),x.getManager_id()
                            ,x.getDepartment_id(),x.getDepartment_name());
                }
            } else if (menu.equals("8")) {
                //8.모두검색3
                List<EmpJobVO> list = dao.selectAll3();
                System.out.printf("%5s%10s%10s%10s%15s%15s%13s%25s%10s%10s%10s\n"
                        ,"사원번호","이름","성","이메일","폰번","입사일","업무코드","업무이름","월급","커미션","매니저번호","부서번호");
                for (EmpJobVO x: list){
                    System.out.printf("%5s%12s%12s%15s%20s%15s%10s%35s%10s%17s%10s\n"
                            ,x.getEmployee_id(),x.getFirst_name(),x.getLast_name(),x.getEmail(),x.getPhone_number()
                            ,x.getHire_date(),x.getJob_id(),x.getJob_title(), x.getSalary(),x.getCommission_pct()
                            ,x.getManager_id(),x.getDepartment_id());
                }
            }

            if(menu.equals("x")) break;
        }//end while

    }//end main
}//end class
