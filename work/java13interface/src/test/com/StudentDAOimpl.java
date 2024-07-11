package test.com;

public class StudentDAOimpl implements StudentDAO{
    @Override
    public int insert(StudentVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public int update(StudentVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public int delete(StudentVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public StudentVO selectOne(StudentVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        StudentVO vo2 = new StudentVO();
        vo2.setNum(123);
        vo2.setName("yang");
        vo2.setKor(88);
        vo2.setEng(77);
        vo2.setMath(99);
        return vo2;
    }

    @Override
    public StudentVO[] selectAll() {
        System.out.println("selectAll()...");

        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            StudentVO vo = new StudentVO();
            vo.setNum(123+i);
            vo.setName("yang"+i);
            vo.setKor(88+i);
            vo.setEng(77+i);
            vo.setMath(99+i);
            vos[i] = vo;
        }
        return vos;
    }

    @Override
    public StudentVO[] searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            StudentVO vo = new StudentVO();
            vo.setNum(123+i);
            vo.setName("yang"+i);
            vo.setKor(88+i);
            vo.setEng(77+i);
            vo.setMath(99+i);
            vos[i] = vo;
        }
        return vos;
    }
}
