package test.com;

public class Board {
    int num;
    String title;
    String cont;
    String name;
    String date;

    public Board(){
        num = 1234;
        title = "큰제목";
        cont = "큰 내용";
        name = "yang";
        date = "240708";
    }

    public Board(int num,
    String title,
    String cont,
    String name,
    String date){
        this.num = num;
        this.title = title;
        this.cont = cont;
        this.name = name;
        this.date = date;
    }
}
