package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //추상클래스의 객체생성- 상속관계의 다형성으로만 생성 가능
        //1.NoteBook를 상속받는 클래스 NoteBookEx
        NoteBook bookEx = new NoteBookEx();
        System.out.println(bookEx.insert(11,22));
        System.out.println(bookEx.update("yang"));

        System.out.println("===============");
        //2.AnonyMous inner
        NoteBook book = new NoteBook() {
            @Override
            public int insert(int x, int y) {
                return x*y;
            }

            @Override
            public String update(String name) {
                return "hello "+name;
            }
        };
        System.out.println(book.insert(33,44));
        System.out.println(book.update("lee"));
    }//end main
}//end class
