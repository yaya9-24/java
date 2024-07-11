package test.com;

public class Main03 {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAOimpl();

        //1.insert
        StudentVO vo = new StudentVO();
        vo.setNum(123);
        vo.setName("yang");
        vo.setKor(88);
        vo.setEng(77);
        vo.setMath(99);

        int result = dao.insert(vo);
        System.out.println(result);

        //2.update
        vo = new StudentVO();
        vo.setNum(1234);
        vo.setName("yang");
        vo.setKor(22);
        vo.setEng(55);
        vo.setMath(77);

        result = dao.update(vo);
        System.out.println(result);

        //3.delete
        vo = new StudentVO();
        vo.setNum(12345);
        vo.setName("yang");
        vo.setKor(45);
        vo.setEng(46);
        vo.setMath(78);

        result = dao.delete(vo);
        System.out.println(result);

        //4.selectOne
        vo = new StudentVO();
        vo.setNum(12345);
        vo.setName("yang");
        vo.setKor(45);
        vo.setEng(46);
        vo.setMath(78);

        StudentVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);

        //5.selectAll
        StudentVO[] vos = dao.selectAll();
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }

        //6.searchList
        vos = dao.searchList("name","lee");
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }
    }
}
