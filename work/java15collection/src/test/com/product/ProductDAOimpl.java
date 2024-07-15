package test.com.product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOimpl implements ProductDAO{


    List<ProductVO> list = new ArrayList<>();

    public ProductDAOimpl() {
        for (int i = 0; i < 5; i++) {
            ProductVO vo = new ProductVO();
            vo.setNum(1+i);
            vo.setPname("product"+(i+1));
            vo.setModel("phone"+(i+1));
            vo.setPrice(991+i);
            vo.setCount(1+i);

            list.add(vo);
        }
    }

    @Override
    public int insert(ProductVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        int flag = 0;
        vo.setNum(list.get(list.size()-1).getNum()+1);
        flag =1;
        list.add(vo);
        return flag;
    }

    @Override
    public int update(ProductVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (vo.getNum()==list.get(i).getNum()){
                list.set(i,vo);
                flag =1;
            }
        }
        return flag;
    }

    @Override
    public int delete(ProductVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum()==vo.getNum()){
                list.remove(i);
                flag = 1;
            }
        }
        return flag;
    }

    @Override
    public ProductVO selectOne(ProductVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        ProductVO vo2 = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum()==vo.getNum()){
                vo2 =list.get(i);
            }
        }
        return vo2;
    }

    @Override
    public List<ProductVO> selectAll() {
        System.out.println("selectAll()...");

        return list;
    }

    @Override
    public List<ProductVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<ProductVO> vos = new ArrayList<>();
        if (searchKey.equals("pname")){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getPname().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        } else if (searchKey.equals("model")) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getModel().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        }
        return vos;
    }
}
