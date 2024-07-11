package test.com.board;

public class BoardDAOimpl implements BoardDAO {

    @Override
    public int insert(BoardVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public int update(BoardVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public int delete(BoardVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        return 0;
    }

    @Override
    public BoardVO selectOne(BoardVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        BoardVO vo2 = new BoardVO();
        vo2.setNum(1);
        vo2.setTitle("java...");
        vo2.setContent("study...");
        vo2.setWriter("admin");
        vo2.setWdate("2024-12-25");
        return vo2;
    }

    @Override
    public BoardVO[] selectAll() {
        System.out.println("selectAll()...");
        BoardVO[] vos = new BoardVO[3];
        for (int i = 0; i < vos.length; i++) {
            BoardVO vo = new BoardVO();
            vo.setNum(1+i);
            vo.setTitle("java..."+i);
            vo.setContent("study..."+i);
            vo.setWriter("admin"+i);
            vo.setWdate("2024-12-25"+i);
            vos[i] = vo;
        }
        return vos;
    }

    @Override
    public BoardVO[] searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        BoardVO[] vos = new BoardVO[3];
        for (int i = 0; i < vos.length; i++) {
            BoardVO vo = new BoardVO();
            vo.setNum(1+i);
            vo.setTitle("java..."+i);
            vo.setContent("study..."+i);
            vo.setWriter("admin"+i);
            vo.setWdate("2024-12-25"+i);
            vos[i] = vo;
        }
        return vos;
    }
}
