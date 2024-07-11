package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //1.인터페이스란?
        //다중상속을 지원하는 툴
        //모든 전역변수는 public static final
        System.out.println(BoardDAO.NAME);
        //추상메서드를 포함할 수 있다.
        //default method, static method를 포함한다.

        //2.인터페이스간의 상속 - 다중상속가능, extends

        //3.클래스와 인터페이스간의 상속 - 다중상속, implements

        BoardDAO dao = new BoardDAOimpl();
        System.out.println(dao.insert());
        System.out.println(dao.delete());
        System.out.println(BoardDAO.selectOne());
        BoardDAO dao2 = new BoardDAO() {
            @Override
            public int insert() {
                System.out.println("inner insert()...");
                return 0;
            }
        };
        dao2.insert();

        System.out.println(BoardDAO2.ADDR);

        BoardDAOimpl dao3 = new BoardDAOimpl();
        dao3.insert();
        dao3.update();


        System.out.println("=============");
        BoardDAO2 dao4 = new BoardDAO2() {
            @Override
            public int update() {
                System.out.println("update...");
                return 0;
            }
        };
        dao4.update();
        dao4.fn();
        BoardDAO2.fn1();
    }//end main
}//end class
