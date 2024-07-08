package test.com;

public class Main03 {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        int result = dao.insert(new StudentVO(1,"kim",99,88,77));
        System.out.println("result:"+result);

        result = dao.update(new StudentVO(11,"kim",99,88,77));
        System.out.println("result:"+result);

        result = dao.delete(new StudentVO(111,"kim",99,88,77));
        System.out.println("result:"+result);

        StudentVO vo = dao.selectOne(new StudentVO(222,"kim",11,22,44));
        System.out.println(vo);

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
