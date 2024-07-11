package test.com;

public class MemberDAOimpl implements MemberDAO{
    @Override
    public void insert() {
        System.out.println("insert()...");
    }

    @Override
    public void update(int num, String id, String pw, String name, String tel) {
        System.out.println("update(AllArgs)...");
        System.out.println(num);
        System.out.println(id);
        System.out.println(pw);
        System.out.println(name);
        System.out.println(tel);
    }

    @Override
    public void update(MemberVO vo) {
        System.out.println("update(vo)...");
        System.out.println(vo);
    }

    @Override
    public MemberVO delete() {
        System.out.println("delete()...");
        MemberVO vo = new MemberVO();
        vo.setNum(1);
        vo.setId("admin");
        vo.setPw("h1111");
        vo.setName("kim");
        vo.setTel("02");
        return vo;
    }

    @Override
    public int delete2() {
        System.out.println("delete2()...");
        return 0;
    }

    @Override
    public MemberVO select(MemberVO vo) {
        System.out.println("select()...");
        System.out.println(vo);
        MemberVO vo2 = new MemberVO();
        vo2.setNum(1);
        vo2.setId("admin");
        vo2.setPw("h1111");
        vo2.setName("kim");
        vo2.setTel("02");
        return vo2;
    }

    @Override
    public MemberVO[] select(String searchKey, String searchWord) {
        System.out.println("select(key,value)...");
        System.out.println(searchKey);
        System.out.println(searchWord);

        MemberVO[] vos = new MemberVO[3];
        for (int i = 0; i < vos.length; i++) {
            MemberVO vo = new MemberVO();
            vo.setNum(1+i);
            vo.setId("admin"+i);
            vo.setPw("h1111"+i);
            vo.setName("kim"+i);
            vo.setTel("02"+i);
            vos[i] = vo;
        }
        return vos;
    }
}
