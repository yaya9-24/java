package test.com;

import java.util.ArrayList;
import java.util.List;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("hello");

        // 데이터타입 :MemberVO
        //MemberDAO : 인터페이스 입력,수정,삭제,검색용 추상메서드(6개)
        //MemberDAOimpl : MemberDAO를 상속받기.
        //MemberDAOimpl(전역변수 ArrayList)를 이용해서 메인에서 입력한 값들로
        //입력, 수정, 삭제, 검색 구현

        MemberDAO dao = new MemberDAOimpl();
        MemberVO vo = null;
        int result = 0;

        //1.insert
        for (int i = 0; i < 5; i++) {
            vo = new MemberVO();
            vo.setNum(i+1);
            vo.setId("admin"+(i+1));
            vo.setPw("pass"+(i+1));
            vo.setName("kim");
            vo.setTel("010-9999-111");

            result = dao.insert(vo);
            System.out.println("result:"+result);
        }
        System.out.println("----------------------------");

        //2.update
        vo =new MemberVO();
        vo.setNum(1);
        vo.setId("tester");
        vo.setPw("hi2222");
        vo.setName("lee");
        vo.setTel("031");

        result = dao.update(vo);
        System.out.println("result:"+result);
        System.out.println("----------------------------");

        //3.delete
        vo = new MemberVO();
        vo.setNum(2);

        result = dao.delete(vo);
        System.out.println("result:"+result);
        System.out.println("----------------------------");

        //4.selectOne
        vo = new MemberVO();
        vo.setNum(3);

        MemberVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);
        System.out.println("----------------------------");

        //5.selectAll
        List<MemberVO> list = dao.selectAll();
        for(MemberVO x: list){
            System.out.println(x);
        }
        System.out.println("----------------------------");

        //6.searchList
        list = dao.searchList("tel","9");
        for(MemberVO x: list){
            System.out.println(x);
        }
    }//end main
}// class
