package test.com;

public class Main04 {
    public static void main(String[] args) {

        /* final*/ String name = "kim";
        //name = "kim";
        //2.로컬 내부 클래스
        class Inner{
            int num =10;
            Inner(){
                System.out.println("Inner()...");
            }
            void test(){
                //메인함수영역의 로컬변수에 접근가능(읽기전용으로만)
                //name = "lee";//수정불가, final상수에만 접근가능
                System.out.println("test()..."+name);
            }
        }
        Inner in = new Inner();
        in.test();
    }
}
