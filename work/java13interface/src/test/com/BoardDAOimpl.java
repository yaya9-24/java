package test.com;


public class BoardDAOimpl implements BoardDAO,BoardDAO2{
    @Override
    public int insert() {
        System.out.println("BoardDAOimpl insert()...");
        return 0;
    }

    @Override
    public int update() {
        System.out.println("BoardDAOimpl update()...");
        return 0;
    }
}
