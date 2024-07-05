package test.com;

public class Member {
    int num;
    String id;
    String pw;
    String name;
    String tel;

    public Member(){
        num =99;
        id ="yaya0924";
        pw ="h1234";
        name ="yang";
        tel = "010-9999-8888";
    }
    public Member(int num,
    String id,
    String pw,
    String name,
    String tel){
        this.num =num;
        this.id =id;
        this.pw =pw;
        this.name =name;
        this.tel = tel;
    }
}
