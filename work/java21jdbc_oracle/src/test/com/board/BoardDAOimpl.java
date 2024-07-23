package test.com.board;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO{

    List<BoardVO> list = new ArrayList<>();

    private static final String DRIVE_NAME = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "java";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public BoardDAOimpl() {
        try {
            Class.forName(DRIVE_NAME);
            System.out.println("Driver successed...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insert(BoardVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        int flag = 0;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public int update(BoardVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        int flag = 0;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public int delete(BoardVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public BoardVO selectOne(BoardVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        BoardVO vo2 = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed");

            String sql ="select * from board where num=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getNum());

            rs = pstmt.executeQuery();
            while (rs.next()){
                vo2 = new BoardVO();
                vo2.setNum(rs.getInt("num"));
                vo2.setTitle(rs.getString("title"));
                vo2.setContent(rs.getString("content"));
                vo2.setWriter(rs.getString("writer"));
                vo2.setWdate(rs.getDate("wdate").toString());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vo2;
    }

    @Override
    public List<BoardVO> selectAll() {
        System.out.println("selectAll()...");
        List<BoardVO> list = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");

            String sql = "select * from board order by num desc";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()){
                BoardVO vo = new BoardVO();
                vo.setNum(rs.getInt("num"));
                vo.setTitle(rs.getString("title"));
                vo.setContent(rs.getString("content"));
                vo.setWriter(rs.getString("writer"));
                //vo.setWdate(rs.getDate("wdate").toString());
                vo.setWdate(new Timestamp(rs.getDate("wdate").getTime()).toString());
                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public List<BoardVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<BoardVO> vos = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");
            String sql ="";
            if (searchKey.equals("writer")){
                sql = "select * from board where writer like ? order by num desc";

            } else if (searchKey.equals("title")){
                sql = "select * from board where title like ? order by num desc";

            } else if (searchKey.equals("content")) {
                sql = "select * from board where content like ? order by num desc";
            }
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"%"+searchWord+"%");

            rs = pstmt.executeQuery();
            while (rs.next()){
                BoardVO vo = new BoardVO();
                vo.setNum(rs.getInt("num"));
                vo.setTitle(rs.getString("title"));
                vo.setContent(rs.getString("content"));
                vo.setWriter(rs.getString("writer"));
                vo.setWdate(rs.getDate("wdate").toString());
                vos.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vos;
    }
}
