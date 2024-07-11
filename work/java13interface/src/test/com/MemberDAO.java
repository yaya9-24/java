package test.com;

public interface MemberDAO {

    public void insert();
    public void update(int num,String id,String pw,String name,String tel);
    public void update(MemberVO vo);
    public MemberVO delete();
    public int delete2();
    public MemberVO select(MemberVO vo);
    public MemberVO[] select(String searchKey,String searchWord);
}
