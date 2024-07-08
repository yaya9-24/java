package test.com;

// VO는 값만 가지고 있는 클래스를 의미한다.

public class BoardVO {

    private int num;
    private String title;
    private String content;
    private String writer;
    private String wdate;

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
