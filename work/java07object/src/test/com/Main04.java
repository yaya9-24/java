package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //객체 생성시 생성자를 정의해서 전역변수 초기화를 할 수 있다.
        NoteBook nb = new NoteBook();

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);

        nb = new NoteBook("Apple",200,5.5);

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);

        nb = new NoteBook("LG",15.5);

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);

        nb = new NoteBook("MM",500);

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);
    } // end main
} // end class
