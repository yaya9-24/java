package test.com.member;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO{

    List<MemberVO> list = new ArrayList<>();

    //3-1 : 전역변수 설정
    private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "java";
    private static final String PASSWORD = "hi123456";
    private Connection conn; //커넥션객체
    private PreparedStatement pstmt; //쿼리(sql문-CRUD) 실행 객체
    private ResultSet rs; // select문 리턴 객체


    public MemberDAOimpl() {
        //1.jdbc 라이브러리 세팅(경로설정)
        //C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib : ojdbc.jar 복사
        //내 프로젝트 >>lib폴더(없다면 생성)에 복붙
        //상단 메뉴 > File > Project Structure > Libraries > + > 복붙 > ojdbc.jar선택

        //2. 오라클 드라이버 클래스(OracleDriver)를 찾아서 인식(연동) - 객체 생성시 즉, 생성자에서 구현
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver successed...");
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        //3. URL(호스트),사용자명,비번을 이용하여 데이터베이스 연동
        //3-1. 전역변수 선언
        //3-2. 각 메서드에서 구현
    }

    @Override
    public int insert(MemberVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        int flag = 0;
        //3-2 : 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public int update(MemberVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        int flag = 0;
        //3-2 : 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public int delete(MemberVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;
        //3-2 : 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        MemberVO vo2 = null;
        //3-2 : 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");

            String sql = "select * from member where num=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,vo.getNum());

            rs = pstmt.executeQuery();

            while (rs.next()){
                vo2 = new MemberVO();
                vo2.setNum(rs.getInt("num"));
                vo2.setId(rs.getString("id"));
                vo2.setPw(rs.getString("pw"));
                vo2.setName(rs.getString("name"));
                vo2.setTel(rs.getString("tel"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vo2;
    }

    @Override
    public List<MemberVO> selectAll() {
        System.out.println("selectAll()...");
        List<MemberVO> list = new ArrayList<>();

        //3-2 : 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");

            //4. : 쿼리문 전달(요청)
            String sql = "select * from member order by num desc";
            pstmt = conn.prepareStatement(sql);

            //5. : 반환(응답)
            rs= pstmt.executeQuery(); //select문에서만 사용하는 함수

            //6. rs >>> list에 할당
            while (rs.next()){//읽어들일 행이 있으면 true
                MemberVO vo = new MemberVO();
                vo.setNum(rs.getInt("num"));
                vo.setId(rs.getString("id"));
                vo.setPw(rs.getString("pw"));
                vo.setName(rs.getString("name"));
                vo.setTel(rs.getString("tel"));
                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public List<MemberVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<MemberVO> vos = new ArrayList<>();
        //3-2 : 커넥션
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("conn successed...");
            String sql = "";
            if (searchKey.equals("name")){
                sql = "select * from member where name like ? order by num desc";
            } else if (searchKey.equals("tel")) {
                sql = "select * from member where tel like ? order by num desc";
            }
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"%"+searchWord+"%");

            rs = pstmt.executeQuery();
            while (rs.next()) {
                MemberVO vo = new MemberVO();
                vo.setNum(rs.getInt("num"));
                vo.setId(rs.getString("id"));
                vo.setPw(rs.getString("pw"));
                vo.setName(rs.getString("name"));
                vo.setTel(rs.getString("tel"));
                vos.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vos;
    }
}
