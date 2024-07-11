package test.com;

public interface BoardDAO {

    /*public static final*/ String NAME = "kim";

    public /*abstract생략가능*/ int insert();

    public default int delete(){
        System.out.println("default delete()...");
        return 1;
    }

    public static int selectOne(){
        System.out.println("static selectOne()...");
        return 9;
    }
}
