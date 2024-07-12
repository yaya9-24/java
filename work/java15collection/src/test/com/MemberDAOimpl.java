package test.com;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

    List<MemberVO> list = new ArrayList<>();

    public MemberDAOimpl() {
        for (int i = 0; i < 5; i++) {
            MemberVO vo = new MemberVO();
            vo = new MemberVO();
            vo.setNum(i+1);
            vo.setId("admin"+(i+1));
            vo.setPw("pass"+(i+1));
            vo.setName("kim");
            vo.setTel("010-9999-111");

            list.add(vo);
        }

    }

    @Override
    public int insert(MemberVO vo) {
        System.out.println("insert()...");
        int flag = 0;
        if (list.size()==0){
            vo.setNum(1);
        }else {
            vo.setNum(list.get(list.size()-1).getNum()+1);
        }
        System.out.println(vo);
        list.add(vo);
        flag = 1;
        return flag;
    }

    @Override
    public int update(MemberVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum() == vo.getNum()) {
                list.set(i, vo);
                flag = 1;
            }
        }
        return flag;
    }

    @Override
    public int delete(MemberVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum() == vo.getNum()) {
                list.remove(i);
                flag = 1;
            }
        }
        return flag;
    }

    @Override
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        MemberVO vo2 = null;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum() == vo.getNum()) {
                vo2 = list.get(i);
            }
        }

        return vo2;
    }

    @Override
    public List<MemberVO> selectAll() {
        System.out.println("selectAll()...");

        return list;
    }

    @Override
    public List<MemberVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<MemberVO> vos = new ArrayList<>();
        if (searchKey.equals("name")) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().contains(searchWord)) {
                    vos.add(list.get(i));
                }
            }
        } else if (searchKey.equals("tel")) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getTel().contains(searchWord)) {
                    vos.add(list.get(i));
                }

            }

        }
        return vos;
    }
}

