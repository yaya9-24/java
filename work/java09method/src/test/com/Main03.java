package test.com;

public class Main03 {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        StudentVO vo = new StudentVO();
        vo.setNum(12);
        vo.setName("yang");
        vo.setKor(82);
        vo.setEng(97);
        vo.setMath(92);
        System.out.println(vo.getNum());
        System.out.println(vo.getName());
        System.out.println(vo.getKor());
        System.out.println(vo.getEng());
        System.out.println(vo.getMath());
        System.out.println(vo);
        int result = dao.insert(new StudentVO(1,"kim",99,88,77));
        System.out.println("result:"+result);

        result = dao.update(new StudentVO(11,"kim",99,88,77));
        System.out.println("result:"+result);

        result = dao.delete(new StudentVO(111,"kim",99,88,77));
        System.out.println("result:"+result);

        StudentVO vo1 = dao.selectOne(new StudentVO(222,"kim",11,22,44));
        System.out.println(vo1);

        StudentVO[] vos = dao.selectAll();
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }

        vos = dao.searchList("name","홍길동");
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }


    } // end main
} // end class
