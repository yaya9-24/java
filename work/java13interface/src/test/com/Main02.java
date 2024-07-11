package test.com;

public class Main02 {
    public static void main(String[] args) {

        MemberDAO dao = new MemberDAOimpl();

        dao.insert();
        System.out.println("---------------");
        dao.update(123,"yaya","h1234","yang","010-2222-8888");
        System.out.println("---------------");
        MemberVO vo = new MemberVO();
        vo.setNum(1);
        vo.setId("admin");
        vo.setPw("h1111");
        vo.setName("kim");
        vo.setTel("02");
        dao.update(vo);

        MemberVO vo2 = dao.delete();
        System.out.println(vo2);

        System.out.println(dao.delete2());

        MemberVO vo3 = dao.select(vo);
        System.out.println(vo3);

        MemberVO[] vos = dao.select("name","kim");
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }
    }//end main
}//end class
