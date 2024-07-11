package test.com.board;

public class Main04 {
    public static void main(String[] args) {

        BoardDAO dao = new BoardDAOimpl();


        //1.insert
        BoardVO vo = new BoardVO();
        vo.setNum(1);
        vo.setTitle("java...");
        vo.setContent("study...");
        vo.setWriter("admin");
        vo.setWdate("2024-12-25");
        System.out.println(dao.insert(vo));

        //2.update
        vo = new BoardVO();
        vo.setNum(2);
        vo.setTitle("java...2");
        vo.setContent("study...2");
        vo.setWriter("admin2");
        vo.setWdate("2024-12-22");
        System.out.println(dao.update(vo));

        //3.delete
        vo = new BoardVO();
        vo.setNum(3);
        vo.setTitle("java...3");
        vo.setContent("study...3");
        vo.setWriter("admin3");
        vo.setWdate("2024-12-33");
        System.out.println(dao.delete(vo));

        //4.selectOne
        vo = new BoardVO();
        vo.setNum(4);
        vo.setTitle("java...4");
        vo.setContent("study...4");
        vo.setWriter("admin4");
        vo.setWdate("2024-12-44");
        System.out.println(dao.selectOne(vo));

        //5.selectAll
        BoardVO[] vos = dao.selectAll();
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }

        //6.searchList
        vos = dao.searchList("title","java");
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
        }

    }
}
