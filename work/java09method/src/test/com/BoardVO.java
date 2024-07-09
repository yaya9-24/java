package test.com;

// VO는 값만 가지고 있는 클래스를 의미한다.

public class BoardVO {

    private int num;
    private String title;
    private String content;
    private String writer;
    private String wdate;

    public void setNum(int num){
        this.num =num;
    }
    public int getNum(){
        return num;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
    public void setWriter(String writer){
        this.writer = writer;
    }
    public String getWriter(){
        return writer;
    }
    public void setWdate(String wdate){
        this.wdate = wdate;
    }
    public String getWdate(){
        return wdate;
    }
    public BoardVO() {

    }

    public BoardVO(int num,
                   String title,
                   String content,
                   String writer,
                   String wdate) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.wdate = wdate;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", wdate='" + wdate + '\'' +
                '}';
    }
}
